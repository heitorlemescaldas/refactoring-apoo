package br.edu.ifsp.Formatter;

import br.edu.ifsp.Customer;
import br.edu.ifsp.Formatter.StatementFormatter;
import br.edu.ifsp.Rental;

import java.util.List;

public class TextStatementFormatter implements StatementFormatter {
    @Override
    public String format(Customer customer, List<Rental> rentals, double totalAmount, int frequentRenterPoints) {
        StringBuilder result = new StringBuilder("Rental Record for " + customer.getName() + "\n");
        for (Rental rental : rentals) {
            double amount = rental.getToolItem().getTool().calculateAmount(rental.getDaysRented());
            result.append("\t").append(rental.getToolItem().getTool().getName())
                    .append("\t").append(amount).append("\n");
        }
        result.append("Amount owed is ").append(totalAmount).append("\n");
        result.append("You earned ").append(frequentRenterPoints).append(" frequent renter points");
        return result.toString();
    }
}
