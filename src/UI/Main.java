package UI;

import objects.*;
import UI.*;
import GUI.*;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Objects;

public class Main {
       public static  ArrayList<product> currentInventory = new ArrayList<>();
    public static void main(String[] args) {

        if( login.hasAccount()){
            login.getID();
        } else{
            login.makeAccount();
        }

    }
}
