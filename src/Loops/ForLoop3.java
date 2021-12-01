package Loops;

import java.util.Scanner;

public class ForLoop3 {

    public static void main(String[] args) {

        // get a positive integer from user which less than 10
        // print out the number starting from that given number to 10 is included

        Scanner input = new Scanner(System.in);
        System.out.println("Please enter a positive integer less than 10");
        int number = input.nextInt();

        for ( ; number<=10 ;number++ ){
            System.out.println(number);
            /*
            pseudo code
            1. create a new class
            2. write the main code
            3. create a scanner code to get a number from user
            4. create a sout to ask the number from user
            5. create an int to store the number of user
            6. create the for loop line and put a condition in it as like number <=10
            7. after condition create your break in the for loop parentheses
            8. create another sout in the for loop body to print the result
            9. and run the code and make sure if it works or not
             */

        }

    }
}
