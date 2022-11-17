import objects.*;
import UI.*;
import GUI.*;
public class Main {

    public static void main(String[] args) {

        if( login.hasAccount()){
            login.getID();
        } else{
            login.makeAccount();
        }

    }
}
