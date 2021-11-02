
package midtermreview;

import java.util.Scanner;

public class MidtermReview {

    public static int plusMinusMultiply(int first, int second, int third, int fourth){
        int result = first + second;
        result -= third;
        result *= fourth;
        
        // return first + second - third * fourth;
        
        return result;
    }
    
    public static int sumOfEvenNumbersUpToN(int number){
        int sum = 0;
        //for ( int value = 2; value <= number; value += 2)
         for ( int value = 0; value <= number; value ++){
             if ( value % 2 == 0){
                 sum += value;
             }
         }
         return sum;
    }
    
    public static void main(String[] args) {
        
        String moreItems = "y";
        Scanner keyboard = new Scanner(System.in);
        
        while ( moreItems.equalsIgnoreCase("y")){
            System.out.println("Enter an item to add to your shopping list");
            String item = keyboard.nextLine();
            System.out.println("Do you have more items to add to your list? y/n");
            moreItems = keyboard.nextLine();
        }
        
        String className = "";
        
        while ( !className.equalsIgnoreCase("ALLDONE")){
            System.out.println("Please enter the name of your class or ALLDONE to stop");
            className = keyboard.nextLine();
        }
    }
    
}
