package Homework7;

import java.util.Scanner;

public class Task6 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("How many eggs do you have?"); // 13
        int numberOfEggs = input.nextInt();

        for (;numberOfEggs>0;){
            System.out.println("How many eggs did you eat?");
            int eatenEggs = input.nextInt();
            numberOfEggs-=eatenEggs;
            System.out.println("There are " + (numberOfEggs) + " eggs left.");

        }System.out.println("You have eaten all the eggs.");
    }
}
