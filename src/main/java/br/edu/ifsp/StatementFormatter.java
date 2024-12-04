package br.edu.ifsp;

import java.util.List;
public interface StatementFormatter {
    String format(Customer customer, List<Rental> rentals, double totalAmount, int frequentRenterPoints);
}
