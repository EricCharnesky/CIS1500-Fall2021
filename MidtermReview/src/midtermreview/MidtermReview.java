
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
    
    public static void main(String[] args) {
        String className = "";
        Scanner keyboard = new Scanner(System.in);
        
        while ( !className.equalsIgnoreCase("ALLDONE")){
            System.out.println("Please enter the name of your class or ALLDONE to stop");
            className = keyboard.nextLine();
        }
    }
    
}
