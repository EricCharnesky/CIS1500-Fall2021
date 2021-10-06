
package chapter7classes;

import java.util.Scanner;

public class Chapter7Classes {

    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        
        System.out.println("Enter the bank account owner");
        String owner = keyboard.nextLine();
        
        System.out.println("Enter the interest rate for the account ( 0.00 - 1 )");
        double interestRate = Double.parseDouble(keyboard.nextLine());
        
        SavingsAccount account = new SavingsAccount(owner);
        //account.setOwner(owner);
        SavingsAccount.setInterestRate(interestRate);
        
        //Integer myValue = 42;
        //myValue.  -lists the instance methods
        // Integer. - lists the static methods
        
        System.out.println("How much money do you want to deposit?");
        double deposit = Double.parseDouble( keyboard.nextLine());
        account.deposit("10");
       
        account.deposit(deposit);
        
        System.out.println("Alright, your bank account has" 
                + account.getBalance());
        
        System.out.println("It's time to earn some interest!");
        account.earnInterest();
        
        System.out.println("Alright, your bank account has" 
                + account.getBalance());
        
        
        
        
        
        System.out.println("Enter the length rectangle you want");
        int length = Integer.parseInt(keyboard.nextLine());
        
        System.out.println("Enter the width rectangle you want");
        int width = Integer.parseInt(keyboard.nextLine());
        
        System.out.println("What color rectangle do you want?");
        String color = keyboard.nextLine();
        
        Rectangle myRectangle = new Rectangle();
        
        String myRectanglesColor = myRectangle.getColor();
        System.out.println("THe color has " + myRectanglesColor.length() + " letters" );
        
        myRectangle.setLength(length);
        myRectangle.setWidth(width);
        myRectangle.setColor(color);
        
        int area = myRectangle.getArea();
        
        System.out.println("Your rectangles area is: " + area);
        
        System.out.println("Enter the length rectangle you want");
        length = Integer.parseInt(keyboard.nextLine());
        
        System.out.println("Enter the width rectangle you want");
        width = Integer.parseInt(keyboard.nextLine());
        
        System.out.println("What color rectangle do you want?");
        color = keyboard.nextLine();
        
        Rectangle anotherRectangle = new Rectangle();
        anotherRectangle.setLength(length);
        anotherRectangle.setWidth(width);
        anotherRectangle.setColor(color);
        
        area = anotherRectangle.getArea();
        
        System.out.println("Your other rectangles area is: " + area);
        
        
        
    }
    
}
