package Primitives;

public class RemainderPractice3 {

    public static void main(String[] args) {

        // by using modulus operator
        // phone price is $875  --  $100 for each month
        // print last month's payment which is $75

        int phonePrice = 875;
        int monthlyPayment = 100;

        int result = phonePrice%monthlyPayment;

        System.out.println("The last month's payment --> $" + result); // The last month's payment --> $75
    }
}
