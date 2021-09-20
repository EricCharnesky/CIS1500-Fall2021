package chapter3.morning;

import java.math.BigDecimal;
import java.text.NumberFormat;
import java.util.Random;
import java.util.Scanner;

public class Chapter3Morning {

    public static void main(String[] args) {
        
        // don't leave comments telling me what a variable is, 
        //   use a better name
        int anosop;
        int averageNumberOfSlicesOfPie;
        
        

        System.out.println("Hello world, happy wednesday!");

        String name = ""; // not a primitive
        
        byte reallySmallNumber = 100; // 1 byte
        short smallNumbers = 32_000; // 2 bytes
        int myNumber = 42; // 4 bytes
        long biggerNumber = 123_456_789_000l; // 8 bytes

        float smallerNumberWithADecimal = 920.7f; // 4 bytes
        double numberWithADecimal = 7.7; // 8 bytes

        char singleCharacter = '|'; // 2 bytes

        char capitalE = 69;
        char lowercaseR = 114;
        char lowercaseI = 105;
        char lowercaseC = 99;

        System.out.print(capitalE);
        System.out.print(lowercaseR);
        System.out.print(lowercaseI);
        System.out.println(lowercaseC);

        boolean areYouHungry = true;

        if (areYouHungry) {
            System.out.println("Go eat!");
        } else {
            System.out.println("There is free food"
                    + " at noon on campus");
        }
        
        if ( areYouHungry == false ){
            
        }
        
        if ( !areYouHungry){
            
        }

        // declaring
        int favoriteNumber;
        
        System.out.println("What's your favorite number?");
        Scanner keyboard = new Scanner(System.in);
        
        // assign the value
        favoriteNumber = Integer.parseInt( keyboard.nextLine() );
        
        
        // int first = 5, second = 10;
        // same above
        int first = 5;
        int second = 10;
        
        int value1 = 10;
        int value2 = 20;
        
        final int MAGIC_NUMBER;
        
        MAGIC_NUMBER = 42;
        
        // can't change it once it's been assigned
        // MAGIC_NUMBER = 43;
        
        
        System.out.println("How high of a number do you want to guess to?");
        int maxNumber = Integer.parseInt(keyboard.nextLine());
        
        
        int numberOfGuesses = 1;
        System.out.println("Guess a number 1-" + maxNumber);
        int guess = Integer.parseInt( keyboard.nextLine() );
        
        Random random = new Random();
        int anotherRandomValue = random.nextInt(maxNumber) + 1;
        
        while ( guess != anotherRandomValue ){
            
            if ( guess < anotherRandomValue){
                System.out.println("too low!");
            }
            else if ( guess > anotherRandomValue ){
                System.out.println("too high!");
            }
            
            System.out.println("guess again!");
            guess = Integer.parseInt( keyboard.nextLine() );
            numberOfGuesses++;
        }
        
        System.out.println("You guessed it right!");
        System.out.println("It took you " + numberOfGuesses + " guesses!");
        
        int sum = first + second;
        
        System.out.println("Enter a value 1-9");
        int value = Integer.parseInt( keyboard.nextLine() );
        
        int newValue = value * 9;
        int tensPlace = newValue / 10;
        
        // modulus - integer remainder of the division
        int onesPlace = newValue % 10; 
        
        int sumOfTensAndOnesPlace = tensPlace + onesPlace;
        System.out.println("The sum of your "
                + " number * 9, tens "
                + "place and ones place is: " 
                + sumOfTensAndOnesPlace);
        
        value = value + 1;
        
  
        System.out.println("Current value of value: " + value);
        // postfix operator - get the value first, then add 1
        System.out.println("Current value of value: " + value++ );
        
        // prefix operator - adds 1, then gives the value 
        System.out.println("Current value of value: " + ++value );
        
        value = -value;
        
        value = value + 5;
        // same as above, but less typing, yay
        value += 5;
        
        // this will set value to positive 5
        value =+ 5;
        
        int result = 5 - 10 + 20;
        
        // PEMDAS
        int ninetyPercentOfPeopleCantSovleThis = 
                5 + 10 / 5 * 20 - 10; // 35
        
        
        double someWholeNumber = 1;
        
        double someFloatNumber = 1.2f;
        
        float someOtherFloatNumber = (float)1.2;
        
        int someResult = (int)(4.2 / 3.5);
        double anotherResult = (4.2 / 3.5);
        
        System.out.print((char)(capitalE + 1));
        System.out.print((char)(lowercaseR + 1));
        System.out.print((char)(lowercaseI + 1));
        System.out.println((char)(lowercaseC + 1));
        
        Integer myIntegerNumber = 42;
        
        Math.ceil(4.00000000001);
        Math.sqrt(100);
        Math.pow(2, 31);
        
        NumberFormat formatter = NumberFormat.getPercentInstance();
        
        double somePercentage = .37;
        System.out.println(formatter.format(somePercentage));
        System.out.println(somePercentage * 100 + "%");
        
        BigDecimal someBigNumber = new BigDecimal("9876543210.123");
        BigDecimal anotherBigNumber = new BigDecimal("19876543210.123");
        
        BigDecimal bigNumberResult = someBigNumber.add(anotherBigNumber);
        
        System.out.println(bigNumberResult);
        
        
        int randomNumber = (int)(Math.random() * 23) + 1;
        
        
    }

}
