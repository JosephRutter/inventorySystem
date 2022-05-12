package UI;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import objects.accounts.*;

public class login {

    public static String getInput(String prompt) {
        System.out.println(prompt);
        Scanner input = new Scanner(System.in);
        return input.nextLine();
    }

    public static void makeAccount() {
        String newUserName = getInput("please input your first name");
        String newUserEmail = getEmail();
        String newUserPassword = getPassword();
        String newUserRole = getInput("is this an admin or staff account");
        if (newUserRole.equals("admin")) {
            new staffAccount(newUserEmail, newUserName, newUserPassword, "admin");
        } else {
            new staffAccount(newUserEmail, newUserName, newUserPassword, "staff");
        }
    }

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


    public static void getID() {
        String emailInput = getInput("please enter your email");
        String passwordInput = getInput("please enter your password");


    }

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
