package Loops;

import java.util.Scanner;

public class WhilePractice5 {

    public static void main(String[] args) {
        /*
        ask user to give a number
        create a multiplication table from 1 to 10 from that given number
         */

        Scanner input = new Scanner(System.in);
        System.out.println("Please enter any int number:");
        int number = input.nextInt();

        int multiplier = 1;

        if (number >= 0) {
            while (multiplier <= 10) {
                System.out.println(number + " x " + multiplier + " = " + number * multiplier);
                multiplier++;
            }
        }

        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter a number");
        int number1= scan.nextInt();
        int multiply=1;

        while(multiply<=10){
            System.out.println(number1+" * "+multiply+" = "+number1*multiply);
            multiply++;
        }
    }
}
