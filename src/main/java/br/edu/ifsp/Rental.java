package br.edu.ifsp;

public class Rental {
    private int daysRented;
    private ToolItem toolItem;

    public Rental(ToolItem toolItem, int daysRented) {
        this.toolItem = toolItem;
        this.daysRented = daysRented;
    }

    public int getDaysRented() {
        return daysRented;
    }

    public ToolItem getToolItem() {
        return toolItem;
    }
}

