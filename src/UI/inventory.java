package UI;

public class inventory {

    public static void inventoryMenu() {

        boolean leave = false;
        System.out.println("welcome");
        while (leave = false) {
            String inventoryMenuChoice = login.getInput("would you like to:add an item, edit an item, browse stock or leave?");
            switch (inventoryMenuChoice) {

                case ("add"):

                    break;
                case ("edit"):

                    break;
                case ("browse"):

                    break;
                case ("leave"):
                    leave = true;
                    break;
                default:
                    System.out.println("that is not a valid input, please try again");
            }

        }
    }
}