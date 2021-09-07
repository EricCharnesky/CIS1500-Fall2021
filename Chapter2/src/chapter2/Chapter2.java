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

        System.out.println("Please enter the number of "
                + "times the class meets");

        // int is short for Integer - whole numbers only
        int numberOfClassMeetings = Integer.parseInt(keyboard.nextLine());

        System.out.println("Please enter the number of "
                + "credit hours for the course");

        int courseCreditHours = Integer.parseInt(keyboard.nextLine());

        int totalContactHours = numberOfClassMeetings * courseCreditHours;

        System.out.println("Total in class hours: " + totalContactHours);

        double someNumber = 4.2;

        float floatNumber = 7.7f;

        System.out.println("Max value of an int: "
                + Integer.MAX_VALUE);

        // long is a realy big integer value
        long someBigInteger = 123_456_789_123_456_789L;

        // order of operations still applies!
        int result = 5 + 20 / 10 * 50 - 50;

        System.out.println("5 + 20 / 10 * 50 - 50 = " + result);

        double integerDivisionIsWeird = 5 / 2;
        System.out.println("5/2 = " + integerDivisionIsWeird);

        double toKeepTheDecimalResultUseADoubleOnOneSide = 5.0 / 2;
        System.out.println("5.0/2 = "
                + toKeepTheDecimalResultUseADoubleOnOneSide);

        int value = 1;
        System.out.println("value:" + value);

        value = value + 10;
        System.out.println("value:" + value);

        // combined assignment operator - it's a shortcut of above
        value += 10;
        System.out.println("value:" + value);

        System.out.println("value:" + (value + 10));

        System.out.println("value:" + value);
        
        System.out.println("Simon says \"take a break\"");
    }

}
