package br.edu.ifsp;

public class Main {
    public static void main(String[] args) {
        final Tool regularHammer = new Tool("Hammer", Tool.REGULAR);
        final Tool newElectricDrill = new Tool("Electric Drill", Tool.NEW_RELEASE);
        final Tool refurbishedScrewDriver = new Tool("Screw Driver", Tool.REFURBISHED);
        final Tool refurbishedHandsaw = new Tool("Handsaw", Tool.REFURBISHED);
        final Tool newChainsaw = new Tool("Chainsaw", Tool.NEW_RELEASE);

        final Customer customer = new Customer("Martin Fowler");
        customer.addRental(new Rental(new ToolItem("123", newElectricDrill), 1));
        customer.addRental(new Rental(new ToolItem("321", newElectricDrill), 5));
        customer.addRental(new Rental(new ToolItem("333", refurbishedHandsaw), 4));
        customer.addRental(new Rental(new ToolItem("664", refurbishedScrewDriver), 2));
        customer.addRental(new Rental(new ToolItem("344", regularHammer), 5));
        customer.addRental(new Rental(new ToolItem("324", newChainsaw), 2));

        System.out.println(customer.statement());
    }
}
