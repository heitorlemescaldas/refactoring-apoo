package br.edu.ifsp.Formatter;

import br.edu.ifsp.Customer;
import br.edu.ifsp.Formatter.StatementFormatter;
import br.edu.ifsp.Rental;

import java.util.List;

public class HtmlStatementFormatter implements StatementFormatter {
    @Override
    public String format(Customer customer, List<Rental> rentals, double totalAmount, int frequentRenterPoints) {
        StringBuilder result = new StringBuilder("<h1>Rental Record for " + customer.getName() + "</h1><ul>");
        for (Rental rental : rentals) {
            double amount = rental.getToolItem().getTool().calculateAmount(rental.getDaysRented());
            result.append("<li>").append(rental.getToolItem().getTool().getName())
                    .append(": ").append(amount).append("</li>");
        }
        result.append("</ul>");
        result.append("<p>Amount owed is <strong>").append(totalAmount).append("</strong></p>");
        result.append("<p>You earned <strong>").append(frequentRenterPoints).append("</strong> frequent renter points</p>");
        return result.toString();
    }
}
