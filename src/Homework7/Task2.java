package Homework7;

import java.util.Scanner;

public class Task2 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Please enter the starting number");
        int startingNumber = input.nextInt();
        System.out.println("Please enter the ending number");
        int endingNumber = input.nextInt();

        int sum = 0;

        for (;startingNumber<endingNumber;startingNumber++){
            if (startingNumber%3==0 && startingNumber%5==0)
                System.out.println(startingNumber);
            for (;startingNumber>endingNumber;endingNumber++){
                if (endingNumber%3==0 && endingNumber%5==0){
                    System.out.println(endingNumber);
                }
            }
        }

    }
}
