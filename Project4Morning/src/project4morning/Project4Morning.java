package project4morning;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Project4Morning {

    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Do you want to (M)anage or (S)ell items?");

        String choice = keyboard.nextLine();

        if (choice.equalsIgnoreCase("M")) {

            while (!choice.equalsIgnoreCase("Q")) {
                System.out.println("DO you want to (A)dd an item, "
                        + "(U)pdate and item, (D)elete an item,"
                        + "or (Q)uit?");
                choice = keyboard.nextLine();

                if (choice.equalsIgnoreCase("A")) {
                    addItem(keyboard);
                } else if (choice.equalsIgnoreCase("U")) {
                    updateItem(keyboard);
                } else if (choice.equalsIgnoreCase("D")) {
                    deleteItem(keyboard);
                }
            }

        } else if (choice.equalsIgnoreCase("S")) {
            sellItem(keyboard);

        } else {
            System.out.println("I can't do that");
        }
    }

    private static void sellItem(Scanner keyboard) throws NumberFormatException {
        String itemName = "";

        while (!itemName.equalsIgnoreCase("QUIT")) {
            System.out.println("What do you want to buy, or QUIT?");
            itemName = keyboard.nextLine();

            if (itemName.equalsIgnoreCase("QUIT")) {
                break;
            }

            File itemFile = new File(itemName + ".txt");

            if (itemFile.exists()) {
                try {
                    Item item = new Item(itemFile);
                    printCurrentItem(item);
                    System.out.println("How many do you want to buy?");
                    int quantity = Integer.parseInt(keyboard.nextLine());

                    if (quantity > item.getQuantity()) {
                        System.out.println("We don't have that many, try again");
                    } else {
                        item.setQuantity(item.getQuantity() - quantity);
                        item.writeToFile();
                        System.out.println("Please send bitcoin to x12315135a");
                        keyboard.nextLine();
                    }

                } catch (FileNotFoundException ex) {
                    System.out.println("Something bad happened, no soup for you");
                    System.out.println(ex);
                }
            } else {
                System.out.println("We don't sell that");
            }
        }
    }

    private static void printCurrentItem(Item item) {
        System.out.println("Current Quantity: " + item.getQuantity());
        System.out.println("Current Price:" + item.getPrice());
    }

    private static void deleteItem(Scanner keyboard) {
        String itemName = getItemName(keyboard);

        File itemFile = new File(itemName + ".txt");

        if (itemFile.delete()) {
            System.out.println("removed item from inventory");
        } else {
            System.out.println("We don't have that item anyway");
        }
    }

    private static void updateItem(Scanner keyboard) throws NumberFormatException {
        String itemName = getItemName(keyboard);

        File itemFile = new File(itemName + ".txt");

        if (itemFile.exists()) {
            try {
                Item item = new Item(itemFile);
                printCurrentItem(item);

                int quantity = getItemQuantity(keyboard);
                double price = getItemPrice(keyboard);
                item.setQuantity(quantity);
                item.setPrice(price);

                item.writeToFile();

            } catch (FileNotFoundException ex) {
                System.out.println("Something bad happened, try again maybe?");
                System.out.println(ex);
            }
        } else {
            System.out.println("We can't find that item");
        }
    }

    private static void addItem(Scanner keyboard) throws NumberFormatException {
        String itemName = getItemName(keyboard);

        int quantity = getItemQuantity(keyboard);

        double price = getItemPrice(keyboard);

        Item item = new Item(itemName, quantity, price);

        try {
            item.writeToFile();
        } catch (FileNotFoundException ex) {
            System.out.println("Something bad happened, try again?");
            System.out.println(ex);
        }
    }

    private static double getItemPrice(Scanner keyboard) throws NumberFormatException {
        System.out.println("What is the item price?");
        double price = Double.parseDouble(keyboard.nextLine());
        return price;
    }

    private static int getItemQuantity(Scanner keyboard) throws NumberFormatException {
        System.out.println("What quantity do you have?");
        int quantity = Integer.parseInt(keyboard.nextLine());
        return quantity;
    }

    private static String getItemName(Scanner keyboard) {
        System.out.println("What is the item name?");
        String itemName = keyboard.nextLine();
        return itemName;
    }

}
