package Methods;

public class BankAccountTest {

    public static void main(String[] args) {

       BankAccount myAccount = new BankAccount();
       myAccount.information();
       myAccount.accountNumber = 8816410;
       myAccount.balance = 100_000;
       myAccount.accountHolderName = "Cigdem Ayyildiz";
       myAccount.userName = "Cigdem";
       myAccount.password = "12345";

        System.out.println();
        myAccount.information();
        myAccount.deposit(5_000);
        myAccount.withdraw(1_000);
        myAccount.logIn("Cigdem","12345");
        System.out.println();
        myAccount.information();
        myAccount.deposit(300,3);
    }
}
