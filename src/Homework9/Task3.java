package Homework9;

import java.util.Arrays;
import java.util.Scanner;

public class Task3 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int [] numbers = new int[10];
        int lengthOfNumber = numbers.length;

        for (int i=0; i<numbers.length;i++){
            if (i<=numbers.length){
                System.out.println("Please enter the int number. You have " +lengthOfNumber+ " space in array:");
                int usersNumber = input.nextInt();
                numbers[i]=usersNumber;
                lengthOfNumber--;
            }
        }
        System.out.println(Arrays.toString(numbers));
    }
}
