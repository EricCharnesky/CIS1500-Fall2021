package fileinputoutput;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
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

    }

}
