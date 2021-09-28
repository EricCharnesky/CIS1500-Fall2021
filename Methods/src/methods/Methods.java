package methods;

import java.util.Scanner;

public class Methods {

    // this is usable in all methods in the class
    public static Scanner keyboard = new Scanner(System.in);

    public static void main(String[] args) {
        String again = "Y";

        while (again.equalsIgnoreCase("y")) {
            printNumbersUpToN();
            again = askTheUserIfTheyWantToRunAgain();
        }

        System.out.println("Let's solve a quadratic for you!");
        double a = askTheUserForAnInt("enter the A value: ");
        double b = askTheUserForAnInt("enter the B value: ");
        double c = askTheUserForAnInt("enter the C value: ");

        double firstYIntercept = firstYIntercept(a, b, c);

        System.out.println("The first intercept is: " + firstYIntercept);

    }

    public static void printNumbersUpToN() {
        int number = askTheUserForAnInt("Enter a number 1-100");

        for (int n = 0; n < number; n++) {
            System.out.println(n);
        }
    }

    public static int askTheUserForAnInt(String prompt) {

        int number = 0;
        boolean tryAgain = true;
        while (tryAgain) {
            System.out.println(prompt);
            try {
                number = Integer.parseInt(keyboard.nextLine());
                tryAgain = false;
                // break;
                // return number;
            } catch (NumberFormatException ex) {
                System.out.println("That's not a an integer, please try again");
            }
        }

        return number;
    }

    public static int askUserForIntWithinRange(String prompt,
            int lowerBound, int upperBound) {

        if (lowerBound == Integer.MIN_VALUE && upperBound == Integer.MAX_VALUE) {
            return askTheUserForAnInt(prompt);
        }

        if (lowerBound == Integer.MIN_VALUE) {
            int value = upperBound + 1;
            while (value > upperBound) {
                value = askTheUserForAnInt(prompt);
            }

            return value;
        }

        if (upperBound == Integer.MAX_VALUE) {
            int value = lowerBound - 1;
            while (value < lowerBound) {
                value = askTheUserForAnInt(prompt);
            }

            return value;
        }

        int value = lowerBound - 1;

        while (value < lowerBound || value > upperBound) {
            value = askTheUserForAnInt(prompt);
        }

        return value;
    }

    public static String askTheUserIfTheyWantToRunAgain() {
        System.out.println("Do you want to run again? y/n");
        String again = keyboard.nextLine();
        return again;
    }

    public static int numberSquared(int number) {
        // int result = number* number;
        // return result;
        return number * number;
    }

    public static double firstYIntercept(double a, double b, double c) {
        // x = (-b +- sqrt(b^2-4ac)) / 2a

        // it's ok if it crashes if there isn't an intercept
        double firstYIntercept = (-b + Math.sqrt(b * b - 4 * a * c)) / (2 * a);
        double secondYIntercept = (-b - Math.sqrt(b * b - 4 * a * c)) / (2 * a);

        return firstYIntercept;
    }

}
