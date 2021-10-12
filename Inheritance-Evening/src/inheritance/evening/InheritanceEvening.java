
package inheritance.evening;

import java.util.Scanner;


public class InheritanceEvening {

    public static void printProduct(Product product){
        System.out.println("The product name is: " + product.getName());
        System.out.println("The product size is: " + product.getSize());
        System.out.println("The product cost is: " + product.getCost());
        System.out.println("The product sales price is: " + product.getSalesPrice());
    }
    
    public static void discountProduct(Product product, double percentageDiscount){
        double currentPrice = product.getSalesPrice();
        double discountPrice = currentPrice * ( 1 - percentageDiscount );
        product.setSalesPrice(discountPrice);
        
        // same as above, but less lines, yay!
        //product.setSalesPrice( product.getSalesPrice() * ( 1 - discountPrice ));
    }
    
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Enter the name of the product you are selling to me: ");
        String name = keyboard.nextLine();
        
        System.out.println("Enter the size of the product you are selling to me: ");
        String size = keyboard.nextLine();
        
        System.out.println("Enter the cost of the product you are selling to me: ");
        double cost = Double.parseDouble(keyboard.nextLine());
        
        System.out.println("Enter the sales price of the product you are selling to me: ");
        double salesPrice = Double.parseDouble(keyboard.nextLine());
        
        
        Product myProduct = new Product(salesPrice, name, size, cost);
        System.out.println("You will make: $" + myProduct.getProfit() + " if I buy this...");
        
        
        printProduct(myProduct);
        discountProduct(myProduct, .1);
        printProduct(myProduct);
        
        
        TaxableProduct taxableProduct = new TaxableProduct("Burger", "small", .97, 1.5, .06);
        System.out.println("The total cost cost including taxes is: " + taxableProduct.getSalesPrice());
        
        printProduct(taxableProduct);
        
        TransparentColor color = new TransparentColor();
        color.setAlpha(155);
        color.setBlue(50);
        color.setRed(25);
        color.setGreen(255);
        
    }
    
    
    
    
    
    
    
    
    
}
