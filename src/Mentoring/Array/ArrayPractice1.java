package Mentoring.Array;

import java.util.Arrays;

public class ArrayPractice1 {

    public static void main(String[] args) {

        // int [] array = {5,8,23,18,56,7,6,93,63,51,43,78,4,93};
        // find the even and odd number array and get the difference between them (odd-even)

        int [] array = {5,8,23,18,56,7,6,93,63,51,43,78,4,93};
        int sumOfEven = 0;
        int sumOfOdd = 0;

        // i have to iterate the all numbers
        // i need to use loop

        for (int number : array){
            // i need to put a condition for even or odd number
            if (number%2==0){
                // System.out.println("This is an even number");
                sumOfEven+=number;
            }else {
                sumOfOdd+=number;
            }
        }
        System.out.println(sumOfOdd-sumOfEven);
    }
}
