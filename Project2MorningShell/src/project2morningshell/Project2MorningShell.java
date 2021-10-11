package project2morningshell;

import java.util.Scanner;

// cite your source - put URL here
public class Project2MorningShell {

    // just an option
    public static Scanner keyboard = new Scanner(System.in);
    public static int numberOfWrongGuesses;
    public static int numberOfAllowedIncorrectGuesses;

    public static void main(String[] args) {

        String playAgain = "Y";
        String lettersGuessed = "";

        while (playAgain.equalsIgnoreCase("y")) {
            numberOfWrongGuesses = 0;
            String wordToGuess = askTheUserForTheWordToGuess();
            numberOfAllowedIncorrectGuesses
                    = askTheUserForANumberInRange(
                            "How many guesses do they get 1-26?", 1, 26);

            while (isStillPlaying(wordToGuess, lettersGuessed)) {
                displayTheWordToGuessWithBlanks(wordToGuess, lettersGuessed);
                displayAllThePreviouslyGuessedLetters(lettersGuessed);
                String guess = askUserToGuessALetter(lettersGuessed);
                checkForIncorrectGuess(guess, wordToGuess);
                lettersGuessed += guess;
            }
            
            System.out.println("The word was: " + wordToGuess);

            playAgain = askTheUserIfTheyWantToPlayAgain();
        }

    }

    public static void checkForIncorrectGuess(String guess, String wordToGuess) {
        if (!wordToGuess.contains(guess)) {
            numberOfWrongGuesses++;
        }
    }

    public static String askTheUserIfTheyWantToPlayAgain() {
        return "Do you want to play again? y/n";
    }

    public static void displayTheWordToGuessWithBlanks(String wordToGuess, String lettersGuessed) {
        for (char letter : wordToGuess.toCharArray()) {
            boolean hasGuessedLetter = false;
            for (char guessedLetter : lettersGuessed.toCharArray()) {
                if (letter == guessedLetter) {
                    hasGuessedLetter = true;
                }
            }

            if (hasGuessedLetter) {
                System.out.print(letter + " ");
            } else {
                System.out.print("_ ");
            }
        }
        System.out.println("");
    }

    public static void displayAllThePreviouslyGuessedLetters(String lettersGuessed) {
        System.out.println("You have guessed: " + lettersGuessed);
    }

    // this could return the letter if you wanted
    // make sure they don't guess the same letter twice
    public static String askUserToGuessALetter(String lettersGuessed) {
        String letter = "";
        boolean alreadyGuessedTheLetter = false;
        do {

            System.out.println("Guess a letter");

            letter = keyboard.nextLine().toUpperCase();
            while (letter.length() > 1) {
                System.out.println("Guess a only a single letter");
                letter = keyboard.nextLine().toUpperCase();
            }

            alreadyGuessedTheLetter = false;
            for (char guessedLetter : lettersGuessed.toCharArray()) {
                for (char currentGuess : letter.toCharArray()) {
                    if (currentGuess == guessedLetter) {
                        alreadyGuessedTheLetter = true;
                    }
                }
            }
        } while (alreadyGuessedTheLetter);

        return letter.toUpperCase();
    }

    public static boolean isStillPlaying(String wordToGuess, String lettersGuessed) {
        if ( numberOfWrongGuesses >= numberOfAllowedIncorrectGuesses ){
            System.out.println("You ran out of guesses!");
            return false;
        }
        
        boolean everyLetterHasBeenGuessed = true;
        for ( char letter : wordToGuess.toCharArray() ){
            boolean hasBeenGuessed = false;
            for ( char guessedLetter : lettersGuessed.toCharArray())
            {
                if ( letter == guessedLetter){
                    hasBeenGuessed = true;
                }
            }
            if ( hasBeenGuessed == false){
                everyLetterHasBeenGuessed = false;
                return true;
                
            }
            
        }
        //return !everyLetterHasBeenGuessed;
        return false;
        
    }

    public static String askTheUserForTheWordToGuess() {
        System.out.println("Enter a word to guess for hangman: ");
        String wordToGuess = keyboard.nextLine();
        return wordToGuess.toUpperCase();
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
