package chapter3;

import java.util.Scanner;

public class Chapter3 {

    public static void main(String[] args) {

        final int MAGIC_MULTIPLE = 9;

        int averageNumberOfSlicesOfPizzaAGuestWillEat;

        int someNumber = 42; // 4 bytes
        double numberWithADecimal = 7.7; // 8 bytes
        float smallerThanADouble = 4.2f; // 4 bytes
        byte smallInteger = 127; // 1 byte
        short slightlyLargerInt = 1205; // 2 bytes
        long biggerInteger = 765_987_123_012l; // 8 bytes

        char singleCharacter = '}'; // 2 bytes

        char captialE = 69;
        char lowercaseR = 114;
        char lowercaseI = 105;
        char lowercaseC = 99;

        System.out.print(captialE);
        System.out.print(lowercaseR);
        System.out.print(lowercaseI);
        System.out.println(lowercaseC);

        boolean trueOrFalseValue = false;

        System.out.println(trueOrFalseValue);

        System.out.println("42 == 42: " + (42 == 42));

        String favoriteColor;

        System.out.println("What's your favorite color?");
        Scanner keyboard = new Scanner(System.in);

        favoriteColor = keyboard.nextLine();

        if (favoriteColor.equalsIgnoreCase("blue")) {
            System.out.println("Hey that's my favorite too!");
        } else if (favoriteColor.equalsIgnoreCase("red")) {
            System.out.println("That's my son's favorite color");
        } else if (favoriteColor.equalsIgnoreCase("turquiose")) {
            System.out.println("That's my daughter's favorite color");
        } else {
            System.out.println("You're special!");
        }

        System.out.println("Enter a number 1-9");
        int yourNumber = Integer.parseInt(keyboard.nextLine());

        int magicNumber = yourNumber * MAGIC_MULTIPLE;
        int tensPlace = magicNumber / 10;

        // modulus gives the integer remainder
        int onesPlace = magicNumber % 10;

        System.out.println("Your number * 9 has a " + tensPlace
                + "in the tens place, and " + onesPlace
                + " in the ones palces");
        
        
    }

}
