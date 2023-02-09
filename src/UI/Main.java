package UI;

import objects.*;

import java.io.*;


import java.util.ArrayList;

import java.util.NoSuchElementException;
import java.util.Scanner;

public class Main {

    public static File inventory = new File("inventory.txt");
    public static File accs = new File ("accs.txt");

    //lists used here to track current inventory and accounts, before saving them to txt file when program ends
    public static ArrayList<product> currentInventory = new ArrayList<>();

    public static ArrayList<account> currentAccs = new ArrayList<>();



    public static void main(String[] args) {
        createAccs();
        createInventory();



        inventoryToTemp();
        accsToTemp();


        if (login.hasAccount()) {
            login.getID();
        } else {
            login.makeAccount();
            login.getID();
        }



        inventoryToTxt();
        accsToTxt();

    }



    public static void createInventory() {
        try {
            File inventory = new File("inventory.txt");
            if (inventory.createNewFile()) {
                System.out.println("inventory created");
            } else {
                System.out.println("inventory already exists");
            }
        } catch (IOException e) {
            System.out.println("an error occured");
            e.printStackTrace();
        } }

    public static void createAccs(){

        try {
            File inventory = new File ("accs.txt");
            if(inventory.createNewFile()){
                System.out.println("accs created");
            } else{
                System.out.println("accs already exists");
            }
        }catch (IOException e){
            System.out.println("an error occured");
            e.printStackTrace();
        }
    }


    public static void inventoryToTemp() {
        try {
            Scanner scanner = new Scanner("inventory.txt");
            scanner.useDelimiter("~");
            if ((inventory.length() != 0)) {
                while (scanner.hasNextLine()) {
                    currentInventory.add(new product(scanner.next(), scanner.next(), scanner.nextDouble(), scanner.nextInt(), scanner.nextBoolean()));

                }
            }

        }catch (NoSuchElementException e){
            e.printStackTrace();
        }
    }

    public static void accsToTemp() {
        try {
            Scanner scanner = new Scanner("accs.txt");
            scanner.useDelimiter("~");
            if((accs.length() != 0)){
            while (scanner.hasNextLine()) {
                currentAccs.add(new account(scanner.next(), scanner.next(), scanner.nextInt(), scanner.hasNextBoolean()));
            }}

        }catch (NoSuchElementException e){
            e.printStackTrace();
        }
    }
    public static void accsToTxt() {
        try {
            FileWriter cleaner = new FileWriter("accs.txt", false);
            FileWriter writer = new FileWriter("accs.txt", true);
            cleaner.write("");
            cleaner.close();
            for (account acc : currentAccs) {
                writer.write(acc.toString());
            }
            writer.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void inventoryToTxt() {

    }
}
