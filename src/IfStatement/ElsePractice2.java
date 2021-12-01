package IfStatement;

import java.util.Scanner;

public class ElsePractice2 {

    public static void main(String[] args) {

        /*
        Ask user to enter an integer value;
        if the number is even number --> print "your number is an even number"
        otherwise --> "your number is an odd number"
         */

        Scanner input = new Scanner(System.in);
        System.out.println("Please enter an integer value");
        int number = input.nextInt();

        if (number%2==0){
            System.out.println("Your number is an even number " + number);
        }
        else {
            System.out.println("Your number is an odd number " + number);
        }


    }
}
