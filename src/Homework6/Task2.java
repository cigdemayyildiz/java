package Homework6;

import java.util.Scanner;

public class Task2 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Please enter any String value");
        String anyValue = input.nextLine().toLowerCase(); // xxredyy

        if (anyValue.contains("red")){
            System.out.println("red");
        }
    }
}
