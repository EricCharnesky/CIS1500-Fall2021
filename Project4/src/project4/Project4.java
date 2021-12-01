package project4;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Project4 {

    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Do you want to (M)anage your inventory or (S)ell items?");
        String choice = keyboard.nextLine();

        if (choice.equalsIgnoreCase("M")) {

            while (!choice.equalsIgnoreCase("Q")) {
                System.out.println("DO you want (A)dd an item, (U)pdate an item, (D)elete an item, or (Q)uit?");
                choice = keyboard.nextLine();

                if (choice.equalsIgnoreCase("A")) {
                    System.out.println("What is the item name?");
                    String name = keyboard.nextLine();

                    getQuantityAndPriceForItemAndWriteToFile(keyboard, name);

                } else if (choice.equalsIgnoreCase("U")) {
                    File itemFile = getFileNameAndCreateFile(keyboard);
                    if (itemFile.exists()) {
                        try {
                            Item item = new Item(itemFile);
                            printItemQuantityAndPrice(item);

                            getQuantityAndPriceForItemAndWriteToFile(keyboard, item.getName());

                        } catch (FileNotFoundException ex) {
                            System.out.println("Failed to read item, try again?");
                            System.out.println(ex);
                        }
                    }

                } else if (choice.equalsIgnoreCase("D")) {
                    File itemFile = getFileNameAndCreateFile(keyboard);
                    itemFile.delete();
                    System.out.println("Removed");
                }
            }

        } else if (choice.equalsIgnoreCase("S")) {
            String itemToBuy = "";
            while (!itemToBuy.equalsIgnoreCase("quit")) {
                System.out.println("What do you want to buy or enter QUIT to stop shopping?");
                itemToBuy = keyboard.nextLine();

                if (!itemToBuy.equalsIgnoreCase("quit")) {
                    File itemFile = new File(itemToBuy + ".txt");
                    if (itemFile.exists()) {
                        try {
                            Item item = new Item(itemFile);
                            printItemQuantityAndPrice(item);

                            System.out.println("How many do you want to buy?");
                            int numberToBuy = Integer.parseInt(keyboard.nextLine());

                            if (numberToBuy <= item.getQuantity()) {

                                item.setQuantity(item.getQuantity() - numberToBuy);
                                item.writeToFile();
                                System.out.println("the total cost is: $" + numberToBuy * item.getPrice());
                                System.out.println("Please enter your bitcoin wallet #");
                                keyboard.nextLine();

                            } else {
                                System.out.println("sorry we don't have that many, try again");
                            }

                        } catch (FileNotFoundException ex) {
                            System.out.println("Something bad happened, please try again?");
                            System.out.println(ex);
                        }

                    } else {
                        System.out.println("Sorry we don't sell that");
                    }
                }

            }
        } else {
            System.out.println("I can't do that.");
        }
    }

    private static void printItemQuantityAndPrice(Item item) {
        System.out.println("Current Quantity: " + item.getQuantity());
        System.out.println("Current Price: " + item.getPrice());
    }

    private static File getFileNameAndCreateFile(Scanner keyboard) {
        System.out.println("What is the item name?");
        String name = keyboard.nextLine();

        File itemFile = new File(name + ".txt");
        return itemFile;
    }

    private static void getQuantityAndPriceForItemAndWriteToFile(Scanner keyboard, String name) throws NumberFormatException {
        System.out.println("What quantity do you have?");
        int quantity = Integer.parseInt(keyboard.nextLine());

        System.out.println("What is the item price?");
        double price = Double.parseDouble(keyboard.nextLine());

        Item item = new Item(name, quantity, price);
        try {
            item.writeToFile();
        } catch (FileNotFoundException ex) {
            System.out.println("Failed to create item, try again?");
            System.out.println(ex);
        }
    }

}
