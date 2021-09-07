package chapter2;

import java.util.Scanner;

public class Chapter2 {

    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        
        
        System.out.println("Please enter your hourly pay rate:");
        // double is for numbers with decimal places
        
        // avoid this if possible
        // double payRate = keyboard.nextDouble();
        
        // this is a better way to get numberic input using scanner
        double payRate = Double.parseDouble(keyboard.nextLine());
        
        
        System.out.println("Please enter the number of hours you worked:");
        double hoursWorked = Double.parseDouble(keyboard.nextLine());
        
        double weeklyPay = payRate * hoursWorked;
        
        System.out.println("Your weekly pay is: $" + weeklyPay);
    }
    
}
