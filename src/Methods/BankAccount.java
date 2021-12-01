package Methods;

public class BankAccount {

    String bankName="Chase Bank";
    int accountNumber;
    double balance;
    String accountHolderName;
    boolean loggedIn;
    String userName;
    String password;

    // create a method that will display all of the account information
    // create a method named as deposit, it will update the balance
    // create a method named as withdraw, it will update the balance
    // create a method named as login, it will check if the user logged in or not, it will return boolean

    public void information(){
        System.out.println("Bank name is: "+bankName+"\nAccount holder name is: "+accountHolderName+"\nAccount number is: "+accountNumber+"\nBalance is: "+balance);
    }
    public double deposit(double depositAmount){
        balance+=depositAmount;
        System.out.println("Your new balance after deposit amount of "+depositAmount+ " is "+balance);
        return balance;

    }
    public double deposit(double depositAmount, int num) {
        balance += depositAmount*num;

        System.out.println("Your new balance after deposit amount of " + depositAmount + " is " + balance);
        return balance;
    }
    public double withdraw(double withdrawAmount){
        balance-=withdrawAmount;
        System.out.println("Your new balance after withdraw amount of "+withdrawAmount+" is "+balance);
        return balance;
    }
    public boolean logIn(String user, String pass) {
        if (userName.equals(user) && password.equals(pass)) {
            System.out.println("Perfect! You successfully logged in.");
            loggedIn = true;
        } else {
        System.out.println("Your credentials are not matching, please try again!");
    }
        return loggedIn;
    }
}
