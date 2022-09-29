package UI;

public class profiles {

    public static void profileMenu() {
        boolean leave = false;
        System.out.println("welcome");
        while (leave = false) {
            String profileMenuChoice = login.getInput("would you like to: edit a profile, remove a profile or leave?");

            switch (profileMenuChoice) {
                case ("edit"):

                    break;
                case ("remove"):

                        break;
                case ("leave"):
                    leave = true;
                        break;
                default:
                        System.out.println("that is not a valid input, please try again");
                        break;

            }
        }
    }
}