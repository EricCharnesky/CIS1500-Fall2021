package project1pizzaparty;

import java.util.Scanner;

public class Project1PizzaParty {

    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);

        System.out.println("Please enter your name");

        String name = keyboard.nextLine();

        System.out.println(name + ", how many "
                + "guests are coming to your party?");

        int numberOfGuests = Integer.parseInt(keyboard.nextLine());

        System.out.println(name + ", how many slices of pizza "
                + "will an average guest eat?");

        double slicesOfPizzaPerGuest
                = Double.parseDouble(keyboard.nextLine());

        System.out.println(name + ", what size pizza are you getting? "
                + "(Small, Medium, or Large?");
        String pizzaSize = keyboard.nextLine();

        // other way
        //double numberOfSlicesInAPizza = 0;
        
        
        if (pizzaSize.equalsIgnoreCase("small")) {
            //numberOfSlicesInAPizza = 6;
            double numberOfPizzasToOrder
                    = Math.ceil(numberOfGuests * slicesOfPizzaPerGuest / 6);
            System.out.println(name + ", you need to buy " + numberOfPizzasToOrder
                    + "pizzas to feed all your guests!");
        } else if (pizzaSize.equalsIgnoreCase("medium")) {
            //numberOfSlicesInAPizza = 8;
            double numberOfPizzasToOrder
                    = Math.ceil(numberOfGuests * slicesOfPizzaPerGuest / 8);
            System.out.println(name + ", you need to buy " + numberOfPizzasToOrder
                    + "pizzas to feed all your guests!");

        } else if (pizzaSize.equalsIgnoreCase("large")) {
            //numberOfSlicesInAPizza = 10;
            double numberOfPizzasToOrder
                    = Math.ceil(numberOfGuests * slicesOfPizzaPerGuest / 10);
            System.out.println(name + ", you need to buy " + numberOfPizzasToOrder
                    + "pizzas to feed all your guests!");

        } else {
            System.out.println(name + ", I don't know what that size is, try again");
        }
        //double numberOfPizzasToOrder
       //        = Math.ceil(numberOfGuests * slicesOfPizzaPerGuest / numberOfSlicesInAPizza);
        
    }

}
