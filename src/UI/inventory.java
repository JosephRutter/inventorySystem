package UI;

import UI.login;
import objects.product;

import java.io.*;
import java.util.Scanner;

public class  inventory {


    public static void inventoryMenu() {

        boolean leave = false;
        System.out.println("welcome");
        while (leave = false) {
            String inventoryMenuChoice = login.getInput("would you like to:add an item, edit an item, browse stock or leave?");
            switch (inventoryMenuChoice) {

                case ("add"):
                        addStock();
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
   public static void addStock() {
       Scanner input = new Scanner(System.in);
       System.out.println("please enter the product name, its category, its price , quantity in that order");
       product tempProduct =  new product(input.next(), input.next(), input.nextDouble(),input.nextInt(), true );
       if (tempProduct.getProductQuantity() == 0 ){
           tempProduct.setProductInstock(false);
       }
       Main.currentInventory.add(tempProduct);
   }
}