package br.edu.ifsp;

import br.edu.ifsp.Formatter.HtmlStatementFormatter;
import br.edu.ifsp.Formatter.StatementFormatter;
import br.edu.ifsp.Formatter.TextStatementFormatter;

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

        for (Rental each : rentals) {
            totalAmount += each.getToolItem().getTool().calculateAmount(each.getDaysRented());
            frequentRenterPoints += each.getToolItem().getTool().calculateFrequentRenterPoints(each.getDaysRented());
        }

        StatementFormatter formatter = new TextStatementFormatter();
        return formatter.format(this, rentals, totalAmount, frequentRenterPoints);
    }


    public String htmlStatement() {
        double totalAmount = 0;
        int frequentRenterPoints = 0;

        for (Rental each : rentals) {
            totalAmount += each.getToolItem().getTool().calculateAmount(each.getDaysRented());
            frequentRenterPoints += each.getToolItem().getTool().calculateFrequentRenterPoints(each.getDaysRented());
        }

        StatementFormatter formatter = new HtmlStatementFormatter();
        return formatter.format(this, rentals, totalAmount, frequentRenterPoints);
    }

    public void addRental(Rental arg) {
        rentals.add(arg);
    }

    public void removeRental(Rental arg) {
        rentals.remove(arg);
    }
}