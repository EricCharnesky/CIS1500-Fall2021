package arraysandarraylists.monring;

import java.util.Scanner;

public class ArraysAndArrayListsMonring {

    public static void main(String[] args) {
        int[] numbers = new int[10];
        numbers[0] = 1;
        numbers[1] = 1;
        for (int index = 2; index < numbers.length; index++) { // fibonacci
            numbers[index] = numbers[index - 1] + numbers[index - 2];
        }

        for (int number : numbers) { // read only loop
            System.out.println(number);
        }

        Scanner keyboard = new Scanner(System.in);
        System.out.println("How many numbers do you want to enter?");
        int numberOfValues = Integer.parseInt(keyboard.nextLine());

        int[] usersNumbers = new int[numberOfValues];

        for (int index = 0; index < usersNumbers.length; index++) {
            System.out.println("Enter the value for index " + index);
            usersNumbers[index] = Integer.parseInt(keyboard.nextLine());
        }

        System.out.println("The largest value you entered is: "
                + findLargestValue(usersNumbers));

        // takes 1 value at a time, assigns it to number - READ ONLY
        for (int number : usersNumbers) {
            System.out.println(number);
        }

        int[] firstBunchOfNumbers = {1, 2, 3, 4, 5}; // array initializer
        // same as above
        firstBunchOfNumbers[0] = 1;
        firstBunchOfNumbers[1] = 2;
        firstBunchOfNumbers[2] = 3;
        firstBunchOfNumbers[3] = 4;
        firstBunchOfNumbers[4] = 5;
        
        int[] addedToNumbers = addToMyArray(firstBunchOfNumbers);
        
        printArray(firstBunchOfNumbers);
        printArray(addedToNumbers);

    }
    
    public static void printArray(int[] values){
        for (int number : values) {
            System.out.println(number);
        }
    }

    public static int findLargestValue(int[] values) {
        int largestValue = values[0];

        for (int value : values) {
            if (value > largestValue) {
                largestValue = value;
            }
        }

        values[2] = 100000000;

        values = new int[1]; // this won't change the place the array points outside the method
        values[0] = 100000000;

        return largestValue;
    }
    
    public static int[] addToMyArray(int[] values){
        int[] newValues = new int[values.length];
        for ( int index = 0; index < newValues.length; index++){
            newValues[index] = values[index] + 10;
        }
        return newValues;
    }

}
