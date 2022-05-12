package objects.accounts;

public class staffAccount extends accountTemplate{
    public staffAccount(String userEmail, String userName, String userPassword, String userRole) {
        super(userEmail, userName, userPassword, "staff");
    }
}
