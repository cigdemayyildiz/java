package IfStatement;

import java.util.Scanner;

public class ElseIfPractice {

    public static void main(String[] args) {

        /*
        pick a number between 0 to 25
        if number is between 0-5 is included print "Your number is in the range of 0-5"
        if number is between 5-10 is included print "Your number is in the range of 5-10"
        if number is between 10-15 is included print "Your number is in the range of 10-15"
        if number is between 15-20 is included print "Your number is in the range of 15-20"
         */

        Scanner input = new Scanner(System.in);
        System.out.println("Please pick a number between 0 to 20:");
        int number = input.nextInt();

        if (number>=0 && number<=5){
            System.out.println("Your number is between 0-5");
        }
        else if (number>5 && number<=10){
            System.out.println("Your number is between 6-10");
        }
        else if (number>10 && number<=15){
            System.out.println("Your number is between 11-15");
        }
        else if (number>15 && number<=20){
            System.out.println("Your number is between 16-20");
        }
        else {
            System.out.println("Your number is out of range");
        }

    }
}
