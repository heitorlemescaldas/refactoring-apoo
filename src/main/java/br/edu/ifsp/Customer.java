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
            double thisAmount = each.getToolItem().getTool().calculateAmount(each.getDaysRented());
            totalAmount += thisAmount;

            // Delegação do cálculo de pontos
            frequentRenterPoints += each.getToolItem().getTool().calculateFrequentRenterPoints(each.getDaysRented());

            result += "\t" + each.getToolItem().getTool().getName() + "\t" + thisAmount + "\n";
        }

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