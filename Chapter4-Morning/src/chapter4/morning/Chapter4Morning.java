package chapter4.morning;

import java.util.Scanner;

public class Chapter4Morning {

    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);

        // todo - move me back down
        System.out.println("What size square do you want to print?");
        int squareSize = Integer.parseInt(keyboard.nextLine());
        for (int row = 1; row <= squareSize; row++) {
            for (int star = 1; star <= squareSize; star++) {
                System.out.print("*");
            }
            System.out.println("");
        }

        System.out.println("What height rectangle do you want?");
        int rectangleHeight = Integer.parseInt(keyboard.nextLine());

        System.out.println("What width rectangle do you want?");
        int rectangleWidth = Integer.parseInt(keyboard.nextLine());

        for (int row = 1; row <= rectangleHeight; row++) {
            for (int star = 1; star <= rectangleWidth; star++) {
                System.out.print("*");
            }
            System.out.println("");
        }

        System.out.println("What size triangle do you want?");
        int triangleSize = Integer.parseInt(keyboard.nextLine());

        for (int row = 1; row <= triangleSize; row++) {
            for (int star = 1; star <= row; star++) {
                System.out.print("*");
            }
            System.out.println("");
        }
        System.out.println("");

        // making sure it's an odd size
        if (triangleSize % 2 == 0) {
            triangleSize++;
        }
        int spaces = triangleSize / 2; // integer division is good here

        for (int stars = 1; stars <= triangleSize; stars += 2) {
            for (int space = 1; space <= spaces; space++) {
                System.out.print(" ");
            }
            for (int star = 1; star <= stars; star++) {
                System.out.print("*");
            }
            spaces--;
            System.out.println("");
        }

        System.out.println("Enter a number: ");
        int usersNumber = Integer.parseInt(keyboard.nextLine());

        // relational operators
        if (usersNumber == 4) {

        }
        if (usersNumber != 4) {

        }
        if (usersNumber < 4) {

        }
        if (usersNumber >= 4) {

        }

        // logical operators
        // && and
        // || or
        // ! not
        // ! true == false
        // ! false == true
        System.out.println("Enter your favorite color");
        String color = keyboard.nextLine();

        if (!color.equalsIgnoreCase("blue")) {
            System.out.println("You're wrong");
        }

        // && and
        // true && true == true
        // true && false == false
        // false && true == false
        // false && false == false
        // || or
        // true || true == true
        // true || false == true
        // false || true == true
        // false || false == false
        System.out.println("Enter a number between 1-100");

        usersNumber = Integer.parseInt(keyboard.nextLine());

        // validation loop
        while (usersNumber < 1 || usersNumber > 100) {
            System.out.println("I said 1-100 dummy!");
            System.out.println("Enter a number between 1-100");
            usersNumber = Integer.parseInt(keyboard.nextLine());
        }

        // validation loop - the hard way
        while (!(usersNumber >= 1 && usersNumber <= 100)) {
            System.out.println("I said 1-100 dummy!");
            System.out.println("Enter a number between 1-100");
            usersNumber = Integer.parseInt(keyboard.nextLine());
        }

        System.out.println("Enter a primary color");
        color = keyboard.nextLine();

        // validation loop with strings
        while (!color.equalsIgnoreCase("blue")
                && !color.equalsIgnoreCase("yellow")
                && !color.equalsIgnoreCase("red")) {
            System.out.println("Primary colors are red, blue, and yellow");
            System.out.println("Enter a primary color");
            color = keyboard.nextLine();
        }

        // validation loop with strings
        while (!(color.equalsIgnoreCase("blue")
                || color.equalsIgnoreCase("yellow")
                || color.equalsIgnoreCase("red"))) {
            System.out.println("Primary colors are red, blue, and yellow");
            System.out.println("Enter a primary color");
            color = keyboard.nextLine();
        }

        System.out.println("What's your age?");
        int age = Integer.parseInt(keyboard.nextLine());

        System.out.println("Are you male or female?");
        String gender = keyboard.nextLine();

        // nested if/else
        if (age <= 25) {
            if (gender.equalsIgnoreCase("male")) {
                System.out.println("You pay the most for car insurance");
            } else {
                System.out.println("You are more for insurance, but not the most");
            }
        } else {
            System.out.println("You pay the least for car insurance");
        }

        // same as above
        if (age <= 25 && gender.equalsIgnoreCase("male")) {
            System.out.println("You pay the most for car insurance");
        } else if (age <= 25) {
            System.out.println("You are more for insurance, but not the most");
        } else {
            System.out.println("You pay the least for car insurance");
        }

        System.out.println("Rock, paper or scissors");
        String usersThrow = keyboard.nextLine();

        if (usersThrow.equalsIgnoreCase("rock")) {
            System.out.println("You lose!");
        } else if (usersThrow.equalsIgnoreCase("paper")) {
            System.out.println("TIE");
        } else if (usersThrow.equalsIgnoreCase("scissors")) {
            System.out.println("You win!");
        } else {
            System.out.println("That's not rock paper or scissors?");
        }

        switch (usersThrow.toLowerCase()) {
            // case "ROCK": - too slow to match every possible casing
            case "rock":
                System.out.println("You lose!");
                break;
            case "paper":
                System.out.println("TIE");
                break;
            case "scissors":
                System.out.println("You win!");
                break;
            default: // must be last
                System.out.println("That's not rock paper or scissors?");

        }

        // forces the validation loop to run at least once
        int score = 0;

        while (score < 1 || score > 100) {
            System.out.println("Enter a score between 1-100");
            score = Integer.parseInt(keyboard.nextLine());
        }

        if (score >= 94 && score <= 100) {
            System.out.println("You get an A");
        }
        if (score >= 90 && score <= 93) {
            System.out.println("You get an A-");
        }

        if (score >= 94) {
            System.out.println("You get an A");
        } else if (score >= 90) {
            System.out.println("You get an A-");
        } else if (score >= 87) {
            int someNumber = 10;
            System.out.println("You get a B+");
        }

        // post test loop - runs at least 1 time
        int anotherScore;
        do {
            System.out.println("Enter another score 1-100");
            anotherScore = Integer.parseInt(keyboard.nextLine());
        } while (anotherScore < 1 || anotherScore > 100);

        if (anotherScore == 42) {
            System.out.println("You win!");
            System.out.println("That's the answer!");
        }

        int hour = 0;
        while (hour <= 23) {
            int minute = 0;
            while (minute <= 59) {
                System.out.println(hour + ":" + minute);
                minute++;
            }
            hour++;
        }

        int number = 0;
        while (number < 10) {
            System.out.println(number);
            number++;
        }

        for (int anotherNumber = 0; anotherNumber < 10; anotherNumber++) {
            System.out.println(anotherNumber);
        }

        for (int anotherHour = 0; anotherHour < 24; anotherHour++) {
            for (int minute = 0; minute < 60; minute++) {
                System.out.println(hour + ":" + minute);
            }
        }

    }

}
