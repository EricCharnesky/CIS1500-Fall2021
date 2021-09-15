package chapter3.morning;

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
        
        System.out.println("Guess a number 1-100");
        int guess = Integer.parseInt( keyboard.nextLine() );
        
        while ( guess != MAGIC_NUMBER ){
            System.out.println("guess again!");
            guess = Integer.parseInt( keyboard.nextLine() );
        }
        
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
    }

}
