package Homework7;

import java.util.Scanner;

public class Task1 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Please enter an integer number");
        int number = input.nextInt();

        int multiplier = 1;

        while (multiplier<=10){
            System.out.println(number + " X " + multiplier + " = " + number*multiplier);
            multiplier++;
        }

    }
}
