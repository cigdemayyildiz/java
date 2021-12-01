package Mentoring;

import java.util.Scanner;

public class GetTheDigitAndSum {

    public static void main(String[] args) {

        /*
        1. Write a program that will accept number
        numbers like 578432 and find  multiplication
            (5*7*8*4*3*2) of all digits and sum
            (5+7+8+4+3+2) of all digits
        Example 1:
        578432
        Multiplication of all digits is 6720;
        The sum of all digits is 29;
         */

        Scanner input = new Scanner(System.in);
        System.out.println("Please enter a number");
        int number = input.nextInt();
        int digit;
        int sum = 0;
        int multiplication = 1;
        while (number!=0){
            digit = number%10;
            sum+=digit;
            multiplication*=digit;
            number/=10;
        }
        System.out.println(sum);
        System.out.println(multiplication);
    }
}
