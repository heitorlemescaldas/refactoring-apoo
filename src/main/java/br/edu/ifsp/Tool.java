package br.edu.ifsp;

import br.edu.ifsp.Price.NewReleasePrice;
import br.edu.ifsp.Price.Price;
import br.edu.ifsp.Price.RefurbishedPrice;
import br.edu.ifsp.Price.RegularPrice;

public class Tool extends DomainObject{
    public static final int REFURBISHED = 2;
    public static final int  REGULAR = 0;
    public static final int  NEW_RELEASE = 1;
    private String name;
    private Price price;

    public Tool(String name, int priceCode) {
        this.name = name;
        setPrice(priceCode);
    }

    private void setPrice(int priceCode) {
        switch (priceCode) {
            case REGULAR -> price = new RegularPrice();
            case NEW_RELEASE -> price = new NewReleasePrice();
            case REFURBISHED -> price = new RefurbishedPrice();
            default -> throw new IllegalArgumentException("Invalid price code");
        }
    }

    public double calculateAmount(int daysRented) {
        return price.calculateAmount(daysRented);
    }

    public int calculateFrequentRenterPoints(int daysRented) {
        return price.calculateFrequentRenterPoints(daysRented);
    }

    public String getName() {
        return name;
    }
}
