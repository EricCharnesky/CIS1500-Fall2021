package project2morningshell;

import java.util.Scanner;

// cite your source - put URL here
public class Project2MorningShell {

    // just an option
    public static int numberOfWrongGuesses;
    public static int numberOfAllowedIncorrectGuesses;

    public static void main(String[] args) {

        String playAgain = "Y";
        String lettersGussedd = "";

        while (playAgain.equalsIgnoreCase("y")) {

            String wordToGuess = askTheUserForTheWordToGuess();
            numberOfAllowedIncorrectGuesses
                    = askTheUserForANumberInRange("...", 1, 26);

            while (isStillPlaying()) {
                displayTheWordToGuessWithBlanks(wordToGuess);
                displayAllThePreviouslyGuessedLetters();
                lettersGussedd += askUserToGuessALetter();
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
    public static String askUserToGuessALetter() {
        return "";
    }

    public static boolean isStillPlaying() {
        return false;
    }

    public static String askTheUserForTheWordToGuess() {
        return "";
    }

    // from https://github.com/EricCharnesky/CIS1500-Fall2021/blob/main/Methods-Morning/src/methods/morning/MethodsMorning.java
    public static int askTheUserForANumber(String prompt) {
        Scanner keyboard = new Scanner(System.in);

        System.out.println(prompt);
        int number = Integer.parseInt(keyboard.nextLine());

        return number;
    }

    // from https://github.com/EricCharnesky/CIS1500-Fall2021/blob/main/Methods-Morning/src/methods/morning/MethodsMorning.java
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
