public class AccessModifiers {
    public static void main(String args[]){
        BankAccount myAccount = new BankAccount();
        myAccount.userName = "Likitha Khatri";
        myAccount.SetPassword("abcdefigk");
    }
}

class BankAccount{
    public String userName;
    private String password;

    public void SetPassword(String pwd){
        password = pwd;
    }
}
