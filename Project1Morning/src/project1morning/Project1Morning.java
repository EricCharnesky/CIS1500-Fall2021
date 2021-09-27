package project1morning;

import java.util.Scanner;

public class Project1Morning {

    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);

        System.out.println("What's your name?");
        String name = keyboard.nextLine();

        System.out.println(name + ", how many people are coming to the party?");
        int numberOfGuests = Integer.parseInt(keyboard.nextLine());

        System.out.println(name + ", how many slices of pie will the average guest eat?");
        double averageSlicesOfPiePerGuest = Double.parseDouble(keyboard.nextLine());

        double totalNumberOfSlicesOfPieNeeded = averageSlicesOfPiePerGuest * numberOfGuests;

        System.out.println("What kind of pie are you getting? ( Apple, Blueberry, or Pumpkin )");
        String kindOfPie = keyboard.nextLine();

        if (kindOfPie.equalsIgnoreCase("apple")) {
            double numberOfPiesNeeded
                    = Math.ceil(totalNumberOfSlicesOfPieNeeded / 8);
            System.out.println(name + ", you need to make " + numberOfPiesNeeded
                    + " " + kindOfPie + " pies!");
        } else if (kindOfPie.equalsIgnoreCase("blueberry")) {
            double numberOfPiesNeeded
                    = Math.ceil(totalNumberOfSlicesOfPieNeeded / 10);
            System.out.println(name + ", you need to make " + numberOfPiesNeeded
                    + " " + kindOfPie + " pies!");
        } else if (kindOfPie.equalsIgnoreCase("pumpkin")) {
            double numberOfPiesNeeded
                    = Math.ceil(totalNumberOfSlicesOfPieNeeded / 6);
            System.out.println(name + ", you need to make " + numberOfPiesNeeded
                    + " " + kindOfPie + " pies!");
        }// a validation loop would be nice here, but not required
        else {
            System.out.println("That's not apple, blueberry or pumpking");
        }
    }

}
