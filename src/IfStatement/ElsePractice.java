package IfStatement;

public class ElsePractice {

    public static void main(String[] args) {


        // if you have more than one if condition you cannot use the else statement
        // if you have only one if condition you can use the else statement


        /*
        if your payment $100 or more you will get %20 discount
        otherwise you will get %5 discount
         */

        double payment = 90;
        double twentyPercent = payment*.20;
        double fivePercent = payment*.05;

        if (payment>=100) {
            System.out.println("Your are going to pay after %20 off: $" + (payment - twentyPercent));
        }
        else {
            System.out.println("Your are going to pay after %5 off: $" + (payment - fivePercent));
        }


        // other way

        if (payment>=100){
            payment -= payment * 0.20;
            System.out.println("Your are going to pay after %20 off: $" + (payment));
        }
        else {
            payment -= payment * 0.05;
            System.out.println("Your are going to pay after %5 off: $" + (payment));
        }
    }
}
