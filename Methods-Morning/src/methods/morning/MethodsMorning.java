package methods.morning;

import java.util.Scanner;

public class MethodsMorning {
    
    // a little ugly, but don't worry
    public static double firstXIntercept;
    public static double secondXIntercept;

    public static void main(String[] args) {
        printHello();
        int a = askTheUserForANumber(
                "Enter a value for A");
        int b = askTheUserForANumber(
                "Enter a value for B");
        int c = askTheUserForANumber(
                "Enter a value for C");

        calculateFirstXIntercept(a, b, c);

        System.out.println("The first intercept is: " + firstXIntercept);
        System.out.println("The first intercept is: " + secondXIntercept);
    }

    public static void printHello() {
        System.out.println("Hi there!");
        System.out.println("Happy Wednesday!");
        printArentMethodsFun();
    }

    public static void printArentMethodsFun() {
        System.out.println("Aren't you having fun with methods?");
    }

    public static int askTheUserForANumber(String prompt) {
        Scanner keyboard = new Scanner(System.in);

        System.out.println(prompt);
        int number = Integer.parseInt(keyboard.nextLine());

        return number;
    }

    public static int askTheUserForANumberBetween(int lowerBound, int upperBound) {
        String prompt = "Enter a number" + lowerBound + "-" + upperBound;
        int number = askTheUserForANumberInRange(prompt, lowerBound, upperBound);
        return number;
    }

    public static int askTheUserForANumberInRange(
            String prompt, int lowerBound, int upperBound) {
        
        if (lowerBound == Integer.MIN_VALUE && upperBound == Integer.MAX_VALUE ){
            int number = askTheUserForANumber(prompt);
            return number;
        }
        
        if ( lowerBound == Integer.MIN_VALUE ){
            int number = askTheUserForANumber(prompt);

            while ( number > upperBound) {
                number = askTheUserForANumber(prompt);
            }

            return number;
        }
        
         if ( upperBound == Integer.MAX_VALUE ){
            int number = askTheUserForANumber(prompt);

            while ( number < lowerBound) {
                number = askTheUserForANumber(prompt);
            }

            return number;
        }
        
        int number = askTheUserForANumber(prompt);

        while (number < lowerBound || number > upperBound) {
            number = askTheUserForANumber(prompt);
        }

        return number;
    }

    public static void calculateFirstXIntercept(double a, double b, double c) {
        // x = -b +- sqrt ( b^2 - 4ac )  / 2a

        firstXIntercept = (-b + Math.sqrt(b * b - 4 * a * c)) / (2 * a);
        secondXIntercept = (-b + Math.sqrt(b * b - 4 * a * c)) / (2 * a);

    }

}
