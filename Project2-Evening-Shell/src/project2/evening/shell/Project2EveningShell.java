package project2.evening.shell;

// got this from here....
import java.util.Scanner;

public class Project2EveningShell {

    public static int health = 10;

    public static void main(String[] args) {
        displayStoryIntro();

        String secretEscapeWord = "soup";
        String choice = getUsersCommand();
        int numberOfTurns = 0;

        while (!choice.equalsIgnoreCase(secretEscapeWord)) {

            if (checkIfIsValidCommand(choice)) {
                numberOfTurns++;
                displayStoryForCommand(choice);
            } else {
                if (choice.equalsIgnoreCase("help")) {
                    displayHelp();
                } else {
                    System.out.println("You can't do that!");
                }
            }

            choice = getUsersCommand();
        }

        System.out.println("Thanks for playing our crappy game");
        System.out.println("You spent " + numberOfTurns + " playing!");
    }

    public static void displayHelp() {
        System.out.println("You may enter: north, east, south, west, run, jump, sleep, hide");
    }

    public static void displayStoryIntro() {
        System.out.println("Welcome to our crappy adventure game!");
    }

    public static String getUsersCommand() {
        Scanner keyboard = new Scanner(System.in);
        System.out.println("What do you want to do?");
        String command = keyboard.nextLine();
        return command;
    }

    public static boolean healthCheckBeforeTravel() {
        if (health > 1) {
            return true;
        }
        System.out.println("You are too tired to travel, you need to sleep");
        return false;
    }

    public static boolean checkIfIsValidCommand(String choice) {
        if (choice.equalsIgnoreCase("north")) {
            return healthCheckBeforeTravel();
        }
        if (choice.equalsIgnoreCase("east")) {
            return healthCheckBeforeTravel();
        }
        if (choice.equalsIgnoreCase("south")) {
            return healthCheckBeforeTravel();
        }
        if (choice.equalsIgnoreCase("west")) {
            return healthCheckBeforeTravel();
        }
        if (choice.equalsIgnoreCase("run")) {
            return true;
        }
        if (choice.equalsIgnoreCase("jump")) {
            return true;
        }
        if (choice.equalsIgnoreCase("hide")) {
            return true;
        }
        if (choice.equalsIgnoreCase("sleep")) {
            return true;
        }

        return false;
    }

    public static void displayStoryForCommand(String choice) {
        if (choice.equalsIgnoreCase("north")) {
            health--;
            System.out.println("You went north towards the forest");
        } else if (choice.equalsIgnoreCase("east")) {
            health--;
            System.out.println("You went east towards the ocean");
        } else if (choice.equalsIgnoreCase("south")) {
            health--;
            System.out.println("You went south towards the plains");
        } else if (choice.equalsIgnoreCase("west")) {
            health--;
            System.out.println("You went west towards the mountains");
        } else if (choice.equalsIgnoreCase("run")) {
            System.out.println("You start running from a shadow");
        } else if (choice.equalsIgnoreCase("jump")) {
            System.out.println("You jump up and try and catch a cloud");
        } else if (choice.equalsIgnoreCase("hide")) {
            System.out.println("You hide from your nightmares");
        } else if (choice.equalsIgnoreCase("sleep")) {
            System.out.println("You take a nice long nap");
            health = 10;
        }
    }

}
