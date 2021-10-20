package arraysandarraylists;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class ArraysAndArrayLists {

    public static void main(String[] args) {
        int[] numbers = new int[10];
        numbers[0] = 10;
        numbers[1] = 20;
        numbers[2] = 30;
        numbers[3] = 40;
        numbers[4] = 7;
        numbers[5] = 0;
        numbers[6] = 1234567;
        numbers[7] = numbers[4];
        numbers[8] = 10 * 30;
        numbers[9] = 0;
        // numbers[10] = 10; this is bad -  array index out of bounds exception!

        // shorthand array initalizer syntax
        int[] favoriteNumbers = {1, 2, 3, 4, 5, 6};
        
        int sum = 0;
        for(int index = 0; index < numbers.length; index++){
            sum += numbers[index];
        } 
        
        int anotherSum = 0; // a read only loop
        for ( int number : numbers ){
            anotherSum += number;
        }

        
        Scanner keyboard = new Scanner(System.in);
        System.out.println("How many words do you want to enter?");
        int numberOfWords = Integer.parseInt(keyboard.nextLine());
        String[] words = new String[numberOfWords];
        for ( int index = 0; index < words.length; index++ ){
            System.out.println("Enter a word");
            words[index] = keyboard.nextLine();
        }
        
        
        for ( String word : words){ // read only
            System.out.println(word);
        }
        System.out.println(words); // junk output

        
        //numbers = new int[20]; would lose all the old values
        int[] newNumbers = new int[10];
        
        for ( int index = 0; index < numbers.length; index++){
            newNumbers[index] = numbers[index];
        }
        
        if ( newNumbers == numbers){
            System.out.println("The arrays are equal!");
        } else{
            System.out.println("The arrays are not equal");
        }
        
        
        
        // will compare the contents
        if ( Arrays.equals(newNumbers, numbers)){
            System.out.println("The arrays are equal!");
        } else{
            System.out.println("The arrays are not equal");
        }
        
        // this doesn't copy - twop varaibles pointed at the same location in memory
        //numbers = newNumbers;
        
        System.out.println(numbers);
        System.out.println(newNumbers);
        
        // rows, columns
        int[][] twoDimensionalArray = new int[3][3];
        
        for ( int rowIndex = 0; rowIndex < twoDimensionalArray.length; rowIndex++){
            for ( int columnIndex = 0; columnIndex < twoDimensionalArray[rowIndex].length; columnIndex++){
                System.out.print(twoDimensionalArray[rowIndex][columnIndex] + ", ");
            }
            System.out.println("");
        }
        
        // only allowed to use classes, no primitives
        ArrayList<Integer> numbersList = new ArrayList<>();
        numbersList.add(10); // adds to the end of the list
        numbersList.add(20);
        numbersList.add(30);
        numbersList.get(0); // gets the value at index 0
        // numbers[0]
        numbersList.set(0, 42); // sets the value at index 0 to 42
        // numbers[0] = 42;
        
        for ( int index = 0; index < numbersList.size(); index++ ){
            System.out.println(numbersList.get(index));
        }
        
        for ( int number : numbersList ){ // read only loop
            System.out.println(number);
        }
        
        ArrayList<ArrayList<Integer>> twoDimensionalArrayList = new ArrayList<>();
        twoDimensionalArrayList.add( new ArrayList<>() );
        
        
    }
    
    // our version of Arrays.equals
    public static boolean doArraysMatch(int[] first, int[] second){
        if ( first.length != second.length){
            return false;
        }
        
        for ( int index = 0; index < first.length; index++ ){
            if ( first[index] != second[index]){
                return false;
            }
        }
        
        return true;
        
       
    }

}
