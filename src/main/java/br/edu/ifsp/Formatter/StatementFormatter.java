package br.edu.ifsp.Formatter;

import br.edu.ifsp.Customer;
import br.edu.ifsp.Rental;

import java.util.List;
public interface StatementFormatter {
    String format(Customer customer, List<Rental> rentals, double totalAmount, int frequentRenterPoints);
}
