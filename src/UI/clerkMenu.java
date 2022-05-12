package UI;

public class clerkMenu {

    public static void clerkMainMenu() {
        {
            boolean leave = false;
            System.out.println("welcome");
            while (leave = false) {
                String clerkMenuChoice = login.getInput("would you like to: manage inventory, or log out?");

                switch (clerkMenuChoice) {
                    case ("inventory"):
                        inventory.inventoryMenu();
                        break;

                    case ("log out"):
                        leave = true;
                        break;

                    default:
                        System.out.println("this is not a valid choice");
                        break;
                }
            }
        }
    }
}

