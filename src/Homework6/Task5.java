package Homework6;

import java.util.Scanner;

public class Task5 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Please enter a year"); // 2016
        int year = input.nextInt();

        if (year%4==0 || year%100==0 || year%400==0) {
            System.out.println(year + " is a leap year"); // 2016 is a leap year
        }else {
            System.out.println(year + " is NOT a leap year");
        }
    }
}
