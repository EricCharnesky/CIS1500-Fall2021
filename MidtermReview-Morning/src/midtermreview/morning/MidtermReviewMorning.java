package midtermreview.morning;

import java.util.Scanner;

public class MidtermReviewMorning {

    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);

        String moreItems = "Y";

        while (moreItems.equalsIgnoreCase("y")) {
            System.out.println("Enter an item for your shopping list: ");
            String item = keyboard.nextLine();
            System.out.println("Do you have more items to add? (y/n)");
            moreItems = keyboard.nextLine();
        }

        String className = "";
        while (!className.equalsIgnoreCase("ALL DONE")) {
            System.out.println("Enter the name of a class you need to take or ALL DONE to stop");
            className = keyboard.nextLine();
        }
    }

    public static int sumOfEvenNumbersUpToN(int number) {
        int sum = 0;

        //for ( int value = 2; value <= number; value += 2){
        for (int value = 0; value <= number; value++) {
            if (value % 2 == 0) {
                sum += value;
            }
        }

        return sum;
    }

    public static int plusMinusMultiply(int first, int second, int third, int fourth) {
        int result = first + second;
        result -= third;
        result *= fourth;

        return result;

        // return ( first + second - third ) * fourth;
    }
}
