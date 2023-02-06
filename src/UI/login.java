package UI;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import GUI.*;
import objects.account.*;

public class login {


    //a general purpose method to retrieve a string from user input

    public static String getInput(String prompt) {
        System.out.println(prompt);
        Scanner input = new Scanner(System.in);
        return input.nextLine();
    }
    // account creation method, uses other methods to  retrieve a username, password and email from user and checks validity of each
public static String getUsername(){
     String username =   getInput("please enter your first name");
        return username;
}

    public static void makeAccount() {
        String newUserName = getUsername() ;
        String newUserEmail = getEmail();
        String newUserPassword = getPassword();
        String newUserRole = getInput("is this an admin or staff account");
        if (newUserRole.equals("admin")) {
            new objects.account(newUserEmail, newUserName, newUserPassword, true);
        } else {
            new objects.account(newUserEmail, newUserName, newUserPassword, false);
        }
    }
    // asks user if they already have an account and wish to sign in or create a new account

    public static boolean hasAccount() {
        while (true) {
            String userChoice = getInput("would you like to log in or create an account?");
            switch (userChoice) {
                case ("log in"):
                    return true;

                case ("create account"):
                    return false;

                default:
                    System.out.println("that is not a valid choice");

            }
        }
    }
    // gets the email and password of the user attempting login

    public static void getID() {
        String emailInput = getInput("please enter your email");
        String passwordInput = getInput("please enter your password");


    }

    //retrieves email from user for account creation, checks validity of email

    public static String getEmail() {
        while (true) {
            String emailInput = getInput("please enter a valid email");
            if (emailInput.contains("@") && emailInput.contains(".com")) {
                return emailInput;
            } else {
                System.out.println("that is not a valid email, please try again");
            }
        }
    }

    // retrieves password from user, checks security of password

    public static String getPassword() {

        Pattern validPassword = Pattern.compile("(?=.*[A-Z])(?=.*[!@#$&*])(?=.*[0-9])(?=.*[a-z]).{8,}");

        while (true) {
            String passwordInput = getInput("please enter a secure password, it must have 1 uppercase letter, 1 special character, and be at least 8 letters long");
            Matcher matcher = validPassword.matcher(passwordInput);
            if (matcher.matches()) {
                return passwordInput;
            } else {
                System.out.println("that is not a secure enough password, please try again");
            }
        }
    }

}
