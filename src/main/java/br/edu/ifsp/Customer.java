package br.edu.ifsp;

import java.util.ArrayList;
import java.util.List;

class Customer extends DomainObject {

    private final List<Rental> rentals = new ArrayList<>();

    public Customer(String name) {
        this.name = name;
    }

    public String statement() {
        double totalAmount = 0;
        int frequentRenterPoints = 0;
        String result = "Rental Record for " + getName() + "\n";

        for (Rental each : rentals) {
            // O cálculo do preço é delegado diretamente à Tool
            double thisAmount = each.getToolItem().getTool().calculateAmount(each.getDaysRented());

            // Soma o total geral
            totalAmount += thisAmount;

            // O cálculo de pontos de locação frequente é delegado à Tool
            frequentRenterPoints += each.getToolItem().getTool().calculateFrequentRenterPoints(each.getDaysRented());

            // Adiciona detalhes ao relatório
            result += "\t" + each.getToolItem().getTool().getName() + "\t" + thisAmount + "\n";
        }

        // Adiciona o rodapé ao relatório
        result += "Amount owed is " + totalAmount + "\n";
        result += "You earned " + frequentRenterPoints + " frequent renter points";

        return result;
    }
    public void addRental(Rental arg) {
        rentals.add(arg);
    }

    public void removeRental(Rental arg) {
        rentals.remove(arg);
    }
}