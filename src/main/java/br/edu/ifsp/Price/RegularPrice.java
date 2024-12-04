package br.edu.ifsp.Price;

import br.edu.ifsp.Price.Price;

public class RegularPrice extends Price {
    @Override
    public double calculateAmount(int daysRented) {
        double amount = 2;
        if (daysRented > 2) {
            amount += (daysRented - 2) * 1.5;
        }
        return amount;
    }
}
