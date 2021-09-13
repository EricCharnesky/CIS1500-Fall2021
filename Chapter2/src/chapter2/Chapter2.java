package chapter2;

import java.util.Date;
import java.util.Scanner;

public class Chapter2 {

    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);

        System.out.println("Please enter your hourly pay rate:");
        // double is for numbers with decimal places

        // avoid this if possible
        // double payRate = keyboard.nextDouble();
        // this is a better way to get numberic input using scanner
        double payRate = Double.parseDouble(keyboard.nextLine());

        System.out.println("Please enter the number of hours you worked:");
        double hoursWorked = Double.parseDouble(keyboard.nextLine());

        double weeklyPay = payRate * hoursWorked;

        System.out.println("Your weekly pay is: $" + weeklyPay);

        System.out.println("Please enter the number of "
                + "times the class meets");

        // int is short for Integer - whole numbers only
        int numberOfClassMeetings = Integer.parseInt(keyboard.nextLine());

        System.out.println("Please enter the number of "
                + "credit hours for the course");

        int courseCreditHours = Integer.parseInt(keyboard.nextLine());

        int totalContactHours = numberOfClassMeetings * courseCreditHours;

        System.out.println("Total in class hours: " + totalContactHours);

        double someNumber = 4.2;

        float floatNumber = 7.7f;

        System.out.println("Max value of an int: "
                + Integer.MAX_VALUE);

        // long is a realy big integer value
        long someBigInteger = 123_456_789_123_456_789L;

        // order of operations still applies!
        int result = 5 + 20 / 10 * 50 - 50;

        System.out.println("5 + 20 / 10 * 50 - 50 = " + result);

        double integerDivisionIsWeird = 5 / 2;
        System.out.println("5/2 = " + integerDivisionIsWeird);

        double toKeepTheDecimalResultUseADoubleOnOneSide = 5.0 / 2;
        System.out.println("5.0/2 = "
                + toKeepTheDecimalResultUseADoubleOnOneSide);

        int value = 1;
        System.out.println("value:" + value);

        value = value + 10;
        System.out.println("value:" + value);

        // combined assignment operator - it's a shortcut of above
        value += 10;
        System.out.println("value:" + value);

        System.out.println("value:" + (value + 10));

        System.out.println("value:" + value);

        System.out.println("Simon says \"take a break\"");

        // I think import is easier
        // java.util.Scanner anotherScanner = new java.util.Scanner(System.in);
        Date now = new Date();
        System.out.println("It is currently: " + now.toString());

        System.out.println("Enter a number");
        int firstNumber = Integer.parseInt(keyboard.nextLine());

        System.out.println("Enter another number");
        int secondNumber = Integer.parseInt(keyboard.nextLine());

        System.out.println("firstNumber == secondNumber: "
                + (firstNumber == secondNumber));

        System.out.println("firstNumber != secondNumber: "
                + (firstNumber != secondNumber));

        System.out.println("firstNumber > secondNumber: "
                + (firstNumber > secondNumber));

        System.out.println("firstNumber < secondNumber: "
                + (firstNumber < secondNumber));

        System.out.println("firstNumber >= secondNumber: "
                + (firstNumber >= secondNumber));

        System.out.println("firstNumber <= secondNumber: "
                + (firstNumber <= secondNumber));

        System.out.println("Enter a name");
        String name = keyboard.nextLine();

        System.out.println("Enter another name");
        String anotherName = keyboard.nextLine();

        // don't use == for Strings
        System.out.println("name.equals(anotherName): "
                + (name.equals(anotherName)));

        // ! is the NOT operator - it flips True and False
        // !True is False
        // !False is True
        System.out.println("!name.equals(anotherName): "
                + (!name.equals(anotherName)));

        System.out.println("name.equalsIgnoreCase(anotherName): "
                + (name.equalsIgnoreCase(anotherName)));

        System.out.println("Is it raining out? ( yes/no )");
        String isItRaining = keyboard.nextLine();

        if (isItRaining.equalsIgnoreCase("yes")) {
            System.out.println("Don't forget your umbrella!");
        } else { // else is completely optional
            System.out.println("You should bring your running shoes");
        }

        System.out.println("Enter your percentage score 0-100");
        int score = Integer.parseInt(keyboard.nextLine());

        // chain of if/else if/else if.... mutually exclusive
        // one and only one will run
        if (score >= 94) {
            System.out.println("You get an A");
        } else if (score >= 90) {
            System.out.println("You get an A-");
        } else if (score >= 87) {
            System.out.println("You get a B+");
        } else if (score >= 84) {
            System.out.println("You get a B");
        } else if (score >= 80) {
            System.out.println("You get a B-");
        } else if (score >= 77) {
            System.out.println("You get a C+");
        } else if (score >= 74) {
            System.out.println("You get a C");
        } else if (score >= 70) {
            System.out.println("You get a C-");
        } else if (score >= 67) {
            System.out.println("You get a D+");
        } else if (score >= 64) {
            System.out.println("You get a D");
        } else {
            System.out.println("You get an F");
        }

        int magicNumber = 42;

        System.out.println("Guess a number 1-100");
        int numberOfGuesses = 1;

        int guess = Integer.parseInt(keyboard.nextLine());

        // if the expression is true, it runs
        while (guess != magicNumber) {
            if (guess < magicNumber) {
                System.out.println("Too low!");
                numberOfGuesses += 1;
                guess = Integer.parseInt(keyboard.nextLine());
            } else if (guess > magicNumber) {
                System.out.println("Too high!");
                numberOfGuesses += 1;
                guess = Integer.parseInt(keyboard.nextLine());
            }
        } // go check if the expression is true and run again if it is
        System.out.println("You guessed it in "
                + numberOfGuesses + " guesses!");

        String again = "y";
        double totalTestScore = 0;
        int numberOfTestScores = 0;
        int lowestTestScore = Integer.MAX_VALUE;
        int highestTestScore = Integer.MIN_VALUE;

        while (again.equalsIgnoreCase("y")) {
            System.out.println("Enter a test score");
            int testScore = Integer.parseInt(keyboard.nextLine());

            if (testScore > highestTestScore) {
                highestTestScore = testScore;
            }

            if (testScore < lowestTestScore) {
                lowestTestScore = testScore;
            }

            totalTestScore += testScore;
            numberOfTestScores += 1;
            System.out.println("Do you have more scores to enter? y/n");
            again = keyboard.nextLine();
        }

        double averageTestScore = totalTestScore / numberOfTestScores;
        System.out.println("Average score is: " + averageTestScore);
        System.out.println("The highest score is: " + highestTestScore);
        System.out.println("The lowest score is: " + lowestTestScore);

        String rockPaperOrScissors = "";
        while (!rockPaperOrScissors.equalsIgnoreCase("quit")) {

            System.out.println("Let's play Rock Paper Scissors, "
                    + "enter Rock Paper Scissors or 'quit' to be all done");
            rockPaperOrScissors = keyboard.nextLine();

            if (rockPaperOrScissors.equalsIgnoreCase("rock")) {
                System.out.println("You tie!");
            } else if (rockPaperOrScissors.equalsIgnoreCase("paper")) {
                System.out.println("You win!");
            } else if (rockPaperOrScissors.equalsIgnoreCase("scissors")) {
                System.out.println("You lose!");
            } else if ( !rockPaperOrScissors.equalsIgnoreCase("quit")){
                System.out.println("Please enter Rock, Paper, Scissors or Quit");
            }

        }

    }

}
