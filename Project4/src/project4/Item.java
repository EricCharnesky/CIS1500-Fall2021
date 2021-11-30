
package project4;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class Item {
    private String name;
    private int quantity;
    private double price;
    
    public Item(File itemFile) throws FileNotFoundException{
        name = itemFile.getName().substring(0, itemFile.getName().length() - 4);
        Scanner fileReader = new Scanner(itemFile);
        quantity = Integer.parseInt(fileReader.nextLine());
        price = Double.parseDouble(fileReader.nextLine());
        fileReader.close();
    }

    public Item(String name, int quantity, double price) {
        this.name = name;
        this.quantity = quantity;
        this.price = price;
    }
    
    public void writeToFile() throws FileNotFoundException{
        PrintWriter printWriter = new PrintWriter(name + ".txt");
        printWriter.println(quantity);
        printWriter.println(price);
        printWriter.close();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    
    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
    
    
}
