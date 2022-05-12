import objects.*;
import UI.*;

public class Main {

    public static void main(String[] args) {

        if( login.hasAccount()){
            login.getID();
        } else{
            login.makeAccount();
        }

    }
}
