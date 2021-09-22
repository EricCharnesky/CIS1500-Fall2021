package chapter4;

import java.util.Scanner;

public class Chapter4 {

    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        //System.out.println("enter a number 1-100: ");

        // skip double prompting by setting the
        //  value to an invalid value to start
        //int number = Integer.parseInt(keyboard.nextLine());
        int number = 0;
        // validation loop - runs until the value is valid
        //while ( !(number >= 1 && number<=100))
        while (number <= 0 || number > 100) {
            System.out.println("enter a number 1-100: ");
            number = Integer.parseInt(keyboard.nextLine());
        }

        String size = "";

        // can do validation loops with strings
        while (!size.equalsIgnoreCase("small")
                && !size.equalsIgnoreCase("medium")
                && !size.equalsIgnoreCase("large")) {
            System.out.println("Enter small, medium, or large");
            size = keyboard.nextLine();
        }

        // relational operators
        if (number == 4) {

        }
        if (number != 4) {

        }
        if (number <= 4) {

        }
        if (number >= 4) {

        }

        // logical operators, combine boolean statements
        if (number >= 4 && number <= 10) {

        }

        if (number <= 0 || number >= 100) {

        }

        // true && true == true
        // true && false == false
        // false && true == false
        // false && false == false
        // true || true == true
        // true || false == true
        // false || true == true
        // false || false == false
        System.out.println("Enter the temperature");
        int temperature = Integer.parseInt(keyboard.nextLine());

        if (temperature >= 50) {
            System.out.println("Is it raining?");
            String isRaining = keyboard.nextLine();

            if (isRaining.equalsIgnoreCase("yes")) {
                System.out.println("Bring an umbrella");
            } else {
                System.out.println("don't forget the sunscreen");
            }
        } else {
            System.out.println("bring a jacket");
        }

        if (number == 4) {
            System.out.println("this line runs if the if is true");
        }

        System.out.println("this looks like it belongs to the if, but it doesn't");

        System.out.println("Enter your score 0-100");
        int score = Integer.parseInt(keyboard.nextLine());

        if (score >= 94) {
            System.out.println("You get an A");
        } else if (score >= 90) {
            System.out.println("You get an A-");
        } else if (score >= 87) {
            System.out.println("You get a B+");
        }

        System.out.println("Let's play Rock Paper or Scissors!");
        String usersThrow = keyboard.nextLine();

        if (usersThrow.equalsIgnoreCase("rock")) {
            System.out.println("You win!");
        } else if (usersThrow.equalsIgnoreCase("paper")) {
            System.out.println("You lose!");
        } else if (usersThrow.equalsIgnoreCase("scissors")) {
            System.out.println("TIE!");
        } else {
            System.out.println("You didn't enter rock, paper, or scissors");
        }

        switch (usersThrow.toLowerCase()) {
            //case "ROCK":
            case "rock":
                System.out.println("You win!");
                break;
            case "paper":
                System.out.println("You lose!");
                break;
            case "scissors":
                System.out.println("TIE!");
                break;

            // default must be the last case
            default:
                System.out.println("You didn't enter rock, paper, or scissors");
        }

        int loopNumber = 0;
        while (loopNumber < 10) {
            System.out.println(loopNumber++);
        }

        String again = "yes";
        int numberOfScores = 0;
        int total = 0;
        int smallestNumber = Integer.MAX_VALUE;
        int largestNumber = Integer.MIN_VALUE;
        while (again.equalsIgnoreCase("yes")) {
            System.out.println("Enter a score");
            int anotherScore = Integer.parseInt(keyboard.nextLine());
            total += anotherScore;
            numberOfScores++;

            if (anotherScore > largestNumber) {
                largestNumber = anotherScore;
            }
            if (anotherScore < smallestNumber) {
                smallestNumber = anotherScore;
            }

            System.out.println("Do you have more scores to enter? yes/no");
            again = keyboard.nextLine();

        }

        System.out.println("The lowest score was: " + smallestNumber);
        System.out.println("The highest score was: " + largestNumber);
        System.out.println("The average score was: "
                + (total / (double) numberOfScores));

        int oneMoreScore = 0;
        int oneMoreTotal = 0;
        int numberOfOneMoreScores = 0;

        // sentinel value of -1
        while (oneMoreScore != -1) {
            System.out.println("Enter a score or -1 to stop entering scores");
            oneMoreScore = Integer.parseInt(keyboard.nextLine());

            if (oneMoreScore == -1) {
                break;
            }

            oneMoreTotal += oneMoreScore;
            numberOfOneMoreScores++;
            // check for min and max....

        }

        System.out.println("Min max average...");

        // while loop is pre-test - runs 0 or more times
        // do while loop is a post-test - runs at least once
        int doLoopNumber = 10;
        do {
            System.out.println(doLoopNumber--);
        } while (doLoopNumber > 0);

        // you have to declare the loop variable first
        String valueEntered;
        do {
            System.out.println("Do you want to keep looping? yes or no");
            valueEntered = keyboard.nextLine();
        } while (valueEntered.equalsIgnoreCase("yes"));

        String anotherValueEntered = "yes";
        while (anotherValueEntered.equalsIgnoreCase("yes")) {
            System.out.println("Do you want to keep looping? yes or no");
            anotherValueEntered = keyboard.nextLine();
        }

        // pre-test loop
        // initialize; test; update
        for (int forNumber = 0; forNumber < 10; forNumber++) {
            System.out.println(forNumber);
        }

        System.out.println("What size triangle should we print?");
        int triangleSize = Integer.parseInt(keyboard.nextLine());

        for (int row = 1; row <= triangleSize; row++) {
            for (int star = 1; star <= row; star++) {
                System.out.print("*");
            }
            System.out.println("");
        }

        System.out.println("What size square should we print?");
        int sqaureSize = Integer.parseInt(keyboard.nextLine());

        for (int row = 1; row <= sqaureSize; row++) {
            for (int star = 1; star <= sqaureSize; star++) {
                System.out.print("*");
            }
            System.out.println("");
        }

        System.out.println("What height rectangle should we print?");
        int height = Integer.parseInt(keyboard.nextLine());

        System.out.println("What width rectangle should we print?");
        int width = Integer.parseInt(keyboard.nextLine());

        for (int row = 1; row <= height; row++) {
            for (int star = 1; star <= width; star++) {
                System.out.print("*");
            }
            System.out.println("");
        }

        System.out.println("What size diamond do you want?");
        int diamondWidth = Integer.parseInt(keyboard.nextLine());

        // ensuring it's an odd width
        if (diamondWidth % 2 == 0) {
            diamondWidth++;
        }

        // integer division is on purpose - rounds down
        int numberOfSpaces = diamondWidth / 2;

        for (int numberOfStars = 1;
                numberOfStars <= diamondWidth;
                numberOfStars += 2) {

            for (int space = 0; space < numberOfSpaces; space++) {
                System.out.print(" ");
            }
            for (int star = 0; star < numberOfStars; star++) {
                System.out.print("*");
            }
            System.out.println("");
            numberOfSpaces--;
        }

        numberOfSpaces = 1;
        for (int numberOfStars = diamondWidth - 2;
                numberOfStars >= 1;
                numberOfStars -= 2) {

            for (int space = 0; space < numberOfSpaces; space++) {
                System.out.print(" ");
            }
            for (int star = 0; star < numberOfStars; star++) {
                System.out.print("*");
            }
            System.out.println("");
            numberOfSpaces++;
        }
        
        int numbersToPrint = 0;
        while ( numbersToPrint < 100 ){
            numbersToPrint++;
            if ( numbersToPrint % 2 == 0 ){
                continue; // jump back to the while condition
            }
            System.out.println(numbersToPrint);
        }

    }

}
