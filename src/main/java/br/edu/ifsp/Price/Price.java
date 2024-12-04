package br.edu.ifsp.Price;

public abstract class Price {
    public abstract double calculateAmount(int daysRented);

    public int calculateFrequentRenterPoints(int daysRented) {
        return 1;
    }
}
