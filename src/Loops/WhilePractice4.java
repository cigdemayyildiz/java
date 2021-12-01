package Loops;

import java.util.Scanner;

public class WhilePractice4 {

    public static void main(String[] args) {

        /*
        user has $100 in their account
        ask user "How much money they want to spend?"
        if the amount is less than balance
            update the balance and show it to user
        if the amount is more than the balance
            print --> "You don't have enough money in the account! Your balance is: ..."
         */

        double balance = 100;
        Scanner input = new Scanner(System.in);

        while (balance>0){
            System.out.println("How much money do you want to spend?");
            double spend = input.nextDouble();
            if (spend<=balance) {
                balance -= spend;
                System.out.println("Your new balance is: " + balance);
            }
            else {
                System.out.println("You don't have enough money in the account!" + balance);
            }
        }
    }
}
