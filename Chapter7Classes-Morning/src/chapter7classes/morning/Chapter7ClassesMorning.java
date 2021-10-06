package chapter7classes.morning;

import java.util.Scanner;

public class Chapter7ClassesMorning {

    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);

        BankAccount account = new BankAccount("Eric", "Checking", 123456);

        String doMoreThings = "y";

        while (doMoreThings.equalsIgnoreCase("y")) {
            System.out.println("Do you want to Deposit or Withdraw?");
            String depositOrWithdraw = keyboard.nextLine();

            if (depositOrWithdraw.equalsIgnoreCase("deposit")) {
                System.out.println("How much money do you want to deposit?");
                int amount = Integer.parseInt(keyboard.nextLine());
                account.deposit(amount);
            } else if (depositOrWithdraw.equalsIgnoreCase("withdraw")) {
                System.out.println("How much money do you want to withdraw?");
                int amount = Integer.parseInt(keyboard.nextLine());
                if (account.withdraw(amount)) {
                    System.out.println("OK, you withdrew the money");
                } else {
                    System.out.println("The bank says NO!");
                }
            } else{
                System.out.println("Please enter Deposit or Withdraw");
            }
            System.out.println("Your current balance: " + account.getBalance());
            
            System.out.println("Do you have more transactions? y/n");
            doMoreThings = keyboard.nextLine();
        }

       
        System.out.println("Enter the length for your rectangle");
        int length = Integer.parseInt(keyboard.nextLine());

        System.out.println("Enter the width for your rectangle");
        int width = Integer.parseInt(keyboard.nextLine());

        System.out.println("Enter the color for your rectangle");
        String color = keyboard.nextLine();

        Rectangle myRectangle = new Rectangle();

        String myRectangleColor = myRectangle.getColor();
        System.out.println("Your rectangle has "
                + myRectangleColor.length() + " characters in it's color");

        myRectangle.setLength(length);
        myRectangle.setWidth(width);
        myRectangle.setColor(color);

        Rectangle otherRectangle = new Rectangle();
        otherRectangle.setLength(10);
        otherRectangle.setWidth(5);
        otherRectangle.setColor("green");

        System.out.println("The area of your rectangle is: "
                + myRectangle.getArea());
        System.out.println("The area of the other rectangle is: "
                + otherRectangle.getArea());
    }

}
