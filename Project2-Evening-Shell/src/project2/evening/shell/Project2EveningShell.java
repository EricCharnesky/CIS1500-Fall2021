package project2.evening.shell;

// got this from here....
public class Project2EveningShell {

    public static int health = 10;

    public static void main(String[] args) {
        displayStoryIntro();

        String secretEscapeWord = "";
        String choice = getUsersCommand();

        while (!choice.equalsIgnoreCase(secretEscapeWord)) {

            if (checkIfIsValidCommand(choice)) {
                // something here
            } else {

            }
            
            choice = getUsersCommand();
        }
    }

    public static void displayHelp() {

    }

    public static void displayStoryIntro() {

    }

    public static String getUsersCommand() {
        return "";
    }

    public static boolean checkIfIsValidCommand(String choice) {
        return false;
    }

}
