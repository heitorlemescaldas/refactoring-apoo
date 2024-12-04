package br.edu.ifsp.Price;

import br.edu.ifsp.Price.Price;

public class RefurbishedPrice extends Price {
    @Override
    public double calculateAmount(int daysRented) {
        double amount = 1.5;
        if (daysRented > 3) {
            amount += (daysRented - 3);
        }
        return amount;
    }
}
