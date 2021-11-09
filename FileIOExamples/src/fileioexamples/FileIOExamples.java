package fileioexamples;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Scanner;

public class FileIOExamples {

    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
//        try {
//            // opening the file
//            FileWriter fileWriter = new FileWriter("test.txt", true); // true puts it in append mode
//            PrintWriter printWriter = new PrintWriter(fileWriter); // this will delete your old file
//           
//            
//            // write to the file
//            
//            String line = "";
//            while ( !line.equalsIgnoreCase("QUIT")){
//                System.out.println("Enter a line to write to the file or QUIT to stop");
//                line = keyboard.nextLine();
//                if ( !line.equalsIgnoreCase("QUIT")){
//                    printWriter.println(line);
//                }
//            }
//            
//            System.out.println("Enter your stuffed animals name: ");
//            String name = keyboard.nextLine();
//            
//            System.out.println("Enter the color of your stuffed animal: ");
//            String color = keyboard.nextLine();
//            
//            System.out.println("Enter the sound your animal makes: ");
//            String sound = keyboard.nextLine();
//            
//            TalkingStuffedAnimal myAnimal = 
//                    new TalkingStuffedAnimal(name, color, sound);
//            
//            printWriter.println(myAnimal.getStringForFile());
//            
//            // close the file
//            printWriter.close();
//            
//        } catch (IOException ex) {
//            System.out.println(ex);
//        }

        System.out.println("enter the name of a file to read");
        String fileName = keyboard.nextLine();

        ArrayList<TalkingStuffedAnimal> animals = new ArrayList<>();

        File fileToRead = new File(fileName);
        if (fileToRead.exists()) {
            // fileToRead.delete();
            try {
                // opens the file
                Scanner fileReader = new Scanner(fileToRead);

                int lineNumber = 1;
                // read the file
                while (fileReader.hasNext()) {
                    String line = fileReader.nextLine();

                    String[] parts = line.split("~");

                    TalkingStuffedAnimal myNewAnimal = null;
                    try {
                        myNewAnimal
                                = new TalkingStuffedAnimal(null, parts[1], parts[2]);

                    } catch (IllegalArgumentException ex) {
                        System.out.println(
                                String.format("unable to read animal from "
                                        + "file at line %d, skipping", lineNumber));
                    }
                    // easier to just do this in the try block where you know it's not null
                    if (myNewAnimal != null) {
                        System.out.println(myNewAnimal.squeeze());
                        animals.add(myNewAnimal);
                    }
                    lineNumber++;

                }

                // close the file
                fileReader.close();

            } catch (FileNotFoundException ex) {
                System.out.println(ex);
            }

        } else {
            System.out.println("There is no file by that name");
        }

    }

}
