package UI;

import java.util.Scanner;

public class login {

    public static String getInput(String prompt) {
        System.out.println(prompt);
        Scanner input = new Scanner(System.in);
        return input.nextLine();
    }

    public static void makeAccount(){
    String newUserName = getInput("please input your first name");
    String newUserEmail = getInput("please enter a valid email address");
    String newUserPassword = getInput("please enter a secure password");
    }

    public static boolean hasAccount(){
        while (true){
       String userChoice = getInput("would you like to log in or create an account?");
       switch (userChoice){
           case("log in"):
               return true;

           case("create account"):
               return false;

           default:
               System.out.println("that is not a valid choice");

       }
    }
    }


    public static void getID(){
       String emailInput = getInput("please enter your email");
       String passwordInput = getInput("please enter your password");


    }
}
