package br.edu.ifsp.Price;

import br.edu.ifsp.Price.Price;

public class NewReleasePrice extends Price {
    @Override
    public double calculateAmount(int daysRented) {
        return daysRented * 3;
    }

    @Override
    public int calculateFrequentRenterPoints(int daysRented) {
        // Lançamentos ganham pontos extras para locações de mais de 1 dia
        return (daysRented > 1) ? 2 : 1;
    }
}
