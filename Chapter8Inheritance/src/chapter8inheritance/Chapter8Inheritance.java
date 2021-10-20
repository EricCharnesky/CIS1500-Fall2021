package chapter8inheritance;

import java.util.Scanner;

public class Chapter8Inheritance {

    public static void printProduct(Product product) {
        System.out.println("name: " + product.getName());
        System.out.println("quantity on hand: " + product.getQuantityOnHand());
        System.out.println("cost to buy: " + product.getCostToBuy());
        System.out.println("sales price: " + product.getSalesPrice());
    }

    public static void reduceProductCost(Product product, double percentageOff) {
        double currentSalesPrice = product.getSalesPrice();
        double newSalesPrice = currentSalesPrice * (1 - percentageOff);
        product.setSalesPrice(newSalesPrice);
    }

    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        System.out.println("What's the name of the product you want to sell?");
        String name = keyboard.nextLine();

        System.out.println("How many of the product do you have to sell?");
        int quantity = Integer.parseInt(keyboard.nextLine());

        System.out.println("How much did the product do you have to sell cost to buy?");
        double cost = Double.parseDouble(keyboard.nextLine());

        System.out.println("How much are you going to sell the product for?");
        double salesPrice = Double.parseDouble(keyboard.nextLine());

        Product product = new Product(name, quantity, cost, salesPrice);

        printProduct(product);

        Product espresso = new Product("Espresso", 5, .75, 2.5);

        printProduct(espresso);

        System.out.println("Espresso is now on sale!");

        reduceProductCost(espresso, .1);

        printProduct(espresso);
        
        TaxableProduct taxableProduct = new TaxableProduct("K cup", 12, .5, 1, .06);
        
        printProduct(taxableProduct);
        
        Rectangle rectangle = new Rectangle(2, 4);
        
        Square square = new Square(4);
        

    }

}
