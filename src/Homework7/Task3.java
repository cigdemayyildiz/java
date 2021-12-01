package Homework7;

import java.util.Scanner;

public class Task3 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Please enter a random String value ");
        String random = input.nextLine();

        if (random.charAt((random.length()/2)+1) == 'd' && random.charAt((random.length()/2)-1) == 'd') {
            System.out.println("dad");

        }

    }
}
