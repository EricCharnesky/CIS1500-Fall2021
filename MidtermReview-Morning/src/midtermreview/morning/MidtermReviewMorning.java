
package midtermreview.morning;

import java.util.Scanner;

public class MidtermReviewMorning {


    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        String className = "";
        while ( !className.equalsIgnoreCase("ALL DONE")){
            System.out.println("Enter the name of a class you need to take or ALL DONE to stop");
            className = keyboard.nextLine();
        }
    }
    
    
    public static int plusMinusMultiply(int first, int second, int third, int fourth){
        int result = first + second;
        result -= third;
        result *= fourth;
        
        return result;
        
        // return ( first + second - third ) * fourth;
    }
}
