package fileinputoutput;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Scanner;

public class FileInputOutput {

    public static void main(String[] args) {

        Scanner keyboard = new Scanner(System.in);
        System.out.println("Enter the name of a file to save your shopping list to: ");
        String fileName = keyboard.nextLine();

        try {
            // open - print writer will erase anything in the file
            PrintWriter printWriter = new PrintWriter(fileName);

            // write
            String itemName = "";

            while (!itemName.equalsIgnoreCase("STOP")) {
                System.out.println("Enter the name of an item to add to your list or STOP: ");
                itemName = keyboard.nextLine();
                if (!itemName.equalsIgnoreCase("STOP")) {
                    printWriter.println(itemName);
                }
            }

            // close
            printWriter.close();

        } catch (FileNotFoundException ex) {
            System.out.println(ex);
        }

        System.out.println("Enter the name of a file to read: ");
        String fileToRead = keyboard.nextLine();

        File fileToOpen = new File(fileToRead);
        //  fileToOpen.delete(); delete a file

        if (fileToOpen.exists()) {

            try {
                // open the file
                Scanner fileReader = new Scanner(fileToOpen);

                // read the file
                while (fileReader.hasNext()) {
                    System.out.println(fileReader.nextLine());
                }

                // close the file
                fileReader.close();

            } catch (FileNotFoundException ex) {
                System.out.println(ex);
            }

        } else {
            System.out.println("There is no file named " + fileToRead);
        }

        int sum = 0;

        File numbersFile = new File("numbers.txt");

        if (numbersFile.exists()) {

            try {
                // open the file
                Scanner fileReader = new Scanner(numbersFile);

                // read the file
                while (fileReader.hasNext()) {
                    int value = Integer.parseInt(fileReader.nextLine());
                    sum += value;

                }

                // close the file
                fileReader.close();

                System.out.println("The sum of the numbers in the file are: " + sum);

            } catch (FileNotFoundException ex) {
                System.out.println(ex);
            }

        } else {
            System.out.println("There is no file named " + fileToRead);
        }

        try {
            // open the file
            PrintWriter vehicleWriter = new PrintWriter("VehicleList.txt");

            // write the file
            System.out.println("Enter vehicle information for what's in your garage");

            String moreVehicles = "y";
            while (moreVehicles.equalsIgnoreCase("y")) {
                System.out.println("Make: ");
                String make = keyboard.nextLine();

                System.out.println("Model: ");
                String model = keyboard.nextLine();

                System.out.println("Color: ");
                String color = keyboard.nextLine();

                System.out.println("Gas tank capacity in liters");
                double gasTankCapacityInLiters = Double.parseDouble(keyboard.nextLine());

                System.out.println("Kilometers per Liter average");
                double kilometersPerLiterAverage = Double.parseDouble(keyboard.nextLine());

                Vehicle vehicle = new Vehicle(make, model, color, gasTankCapacityInLiters, kilometersPerLiterAverage);

                vehicleWriter.println(vehicle.getStringForFileOutput());

                System.out.println("Do you have more vehicles in your garage? y/n");
                moreVehicles = keyboard.nextLine();
            }

            // close the file
            vehicleWriter.close();

        } catch (FileNotFoundException ex) {
            System.out.println(ex);
        }

        ArrayList<Vehicle> vehicles = new ArrayList<>();

        // open
        File vehicleFile = new File("vehicleList.txt");
        if (vehicleFile.exists()) {
            try {
                Scanner vehicleReader = new Scanner(vehicleFile);

                while (vehicleReader.hasNext()) {
                    String line = vehicleReader.nextLine();
                    String[] details = line.split("~");

                    String make = details[0];
                    String model = details[1];
                    String color = details[2];
                    double gasTankCapacity = Double.parseDouble( details[3] );
                    double kilometersPerLiter = Double.parseDouble( details[5] );
                    
                    Vehicle vehicle = new Vehicle(make, model, color, 
                            gasTankCapacity, kilometersPerLiter);
                    vehicles.add(vehicle);
                }
            } catch (FileNotFoundException ex) {
                System.out.println(ex);
            }
        }
        
        for ( Vehicle vehcile : vehicles){
            System.out.println(vehcile.getStringForFileOutput());
        }

        // read
        // close
    }

}
