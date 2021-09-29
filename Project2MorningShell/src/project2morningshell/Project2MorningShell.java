package project2morningshell;

import java.util.Scanner;

// cite your source - put URL here
public class Project2MorningShell {

    // just an option
    public static int numberOfWrongGuesses;
    public static int numberOfAllowedIncorrectGuesses;

    public static void main(String[] args) {

        String playAgain = "Y";

        while (playAgain.equalsIgnoreCase("y")) {

            String wordToGuess = askTheUserForTheWordToGuess();
            numberOfAllowedIncorrectGuesses
                    = askTheUserForANumberInRange("...", 1, 26);

            while (isStillPlaying()) {
                displayTheWordToGuessWithBlanks();
                displayAllThePreviouslyGuessedLetters();
                askUserToGuessALetter();
            }

            playAgain = askTheUserIfTheyWantToPlayAgain();
        }

    }
    
    public static String askTheUserIfTheyWantToPlayAgain(){
        return "";
    }

    public static void displayTheWordToGuessWithBlanks() {

    }

    public static void displayAllThePreviouslyGuessedLetters() {

    }

    // this could return the letter if you wanted
    // make sure they don't guess the same letter twice
    public static void askUserToGuessALetter() {

    }

    public static boolean isStillPlaying() {
        return false;
    }

    public static String askTheUserForTheWordToGuess() {
        return "";
    }

    public static int askTheUserForANumber(String prompt) {
        Scanner keyboard = new Scanner(System.in);

        System.out.println(prompt);
        int number = Integer.parseInt(keyboard.nextLine());

        return number;
    }

    public static int askTheUserForANumberInRange(
            String prompt, int lowerBound, int upperBound) {

        if (lowerBound == Integer.MIN_VALUE && upperBound == Integer.MAX_VALUE) {
            int number = askTheUserForANumber(prompt);
            return number;
        }

        if (lowerBound == Integer.MIN_VALUE) {
            int number = askTheUserForANumber(prompt);

            while (number > upperBound) {
                number = askTheUserForANumber(prompt);
            }

            return number;
        }

        if (upperBound == Integer.MAX_VALUE) {
            int number = askTheUserForANumber(prompt);

            while (number < lowerBound) {
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
}
