package Scanner;

import java.util.Scanner;

public class PracticeTask2 {

    public static void main(String[] args) {

        /*
         David wants to deposit his money into his bank account
        -he already got $200 in his account
        -he got three different paychecks ($480, $600 and $350)
        -he can only deposit one paycheck at a time
        -after he got his money in the account
        - he bought a phone for $599 and headphone for $299
        - calculate his final money in his account
        open a new class under scanner package and name it as "MoneyTransaction"
        */

        Scanner transaction = new Scanner(System.in);

        int money = 200;
        System.out.println("You got $" + money + " in your account."); // $200

        System.out.println("What is your deposit check amount? "); // $480
        int deposit1 = transaction.nextInt();
        System.out.println("Your deposit check amount is: $" + deposit1); // $480

        System.out.println("What is your second deposit check amount? "); // $600
        int deposit2 = transaction.nextInt();
        System.out.println("Your deposit check amount is: $" + deposit2); // $600

        System.out.println("What is your third deposit check amount? "); // $350
        int deposit3 = transaction.nextInt();
        System.out.println("Your deposit check amount is: $" + deposit3); // $350

        int balance = money+deposit1+deposit2+deposit3;
        System.out.println("Your current balance is: $" + balance); // $1630

        System.out.println("What is the phone cost? "); // $599
        int phone = transaction.nextInt();
        System.out.println("Phone cost is: $" + phone); // $599

        System.out.println("What is the headphone cost? "); // $299
        int headphone = transaction.nextInt();
        System.out.println("Headphone cost is: $" + headphone); // $299

        String finalMoney = ("Your final balance is: $" + (money+deposit1+deposit2+deposit3-(phone+headphone)));

        System.out.println(finalMoney); // $732

    }
}
