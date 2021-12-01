package Homework7;

import java.util.Scanner;

public class Task5 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Please enter current speed"); // 6
        int currentSpeed = input.nextInt();
        System.out.println("Please enter target speed"); // 20
        int targetSpeed = input.nextInt();
        int sec = 10;

        while (currentSpeed<=targetSpeed){
            //System.out.println(currentSpeed); // 6 - 16
            currentSpeed=currentSpeed+sec;
        }
        System.out.println("You need " + currentSpeed/sec + " sec to reach target speed.");
        // You need 2 sec to reach target speed.

    }
}
