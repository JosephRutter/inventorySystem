package UI;

public class adminMenu {

    public static void adminMainMenu() {
        boolean leave = false;
        System.out.println("welcome admin");
        while (leave = false) {
            String adminMenuChoice = login.getInput("would you like to: manage inventory,manage user profiles,manage restock settings or log out?");

            switch (adminMenuChoice) {
                case ("inventory"):
                    inventory.inventoryMenu();
                    break;

                case ("profiles"):
                    profiles.profileMenu();
                    break;

                case ("log out"):
                    leave = true;
                    break;

                case ("restock"):


                default:
                    System.out.println("this is not a valid choice");
                    break;
            }
        }
    }
}
