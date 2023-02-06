package UI;

import objects.*;
import UI.*;
import GUI.*;
import java.io.*;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Objects;
import java.util.Scanner;

public class Main {
       public static  ArrayList<product> currentInventory = new ArrayList<>();

       public static  ArrayList<account> currentAccs = new ArrayList<>();

        public static File accs = new File ("accs.txt");

    public static void main(String[] args) {
        createInventory();
        inventoryToTemp();
        accsToTemp();


        if( login.hasAccount()){
            login.getID();
        } else{
            login.makeAccount();
        }

        inventoryToTxt();
        accsToTxt();

    }

    public static void createInventory(){
        try {
            if (inventory.inventory.createNewFile()) {
                System.out.println("inventory successfully created");
            } else {
                System.out.println("file already exists");
            }
        } catch (IOException e) {
            System.out.println("an error occurred");
            e.printStackTrace();

        }
    }

    public static void inventoryToTemp(){
        try{
            Scanner scanner = new Scanner(inventory.inventory);
            scanner.useDelimiter("~");
            if(inventory.inventory.length() != 0){
                while (scanner.hasNextLine()){
                    currentInventory.add(new product(scanner.next(), scanner.next(), scanner.nextDouble(), scanner.nextInt(), scanner.nextBoolean()));

                }
            }
        }catch (FileNotFoundException e){
            e.printStackTrace();
        }

    }


    public static void accsToTemp() {
         try {
             Scanner scanner = new Scanner(accs);
             scanner.useDelimiter("~");
             while(scanner.hasNextLine()){
                 currentAccs.add(new account(scanner.next(), scanner.next(), scanner.next(), scanner.hasNextBoolean()));
             }

         }catch (FileNotFoundException e){
             e.printStackTrace();
         }

    }

    public static void accsToTxt() {
        try {
            FileWriter cleaner = new FileWriter(accs,false);
            FileWriter writer = new FileWriter(accs,true);
            cleaner.write("");
            cleaner.close();
            for (account acc : currentAccs){
               writer.write(acc.toString());
            } writer.close();
        }catch (IOException e){
            e.printStackTrace();
        }
    }

    public static void inventoryToTxt(){

    }
}
