package Mentoring.InterviewQuestions;

import java.util.Arrays;

public class A03SecondLargest {

    public static void main(String[] args) {

        // Write a Java program to find the second largest number in the Array
        int[] array = {12,13,12,15,0,-1};
        Arrays.sort(array); // [-1, 0, 12, 12, 13, 15]
        System.out.println(array[array.length-2]); // 13

        // Interview Solution
        int[] array1 = {100,300,200,450,350};
        int largest = array1[0];
        int secondLargest = 0;
        for (int i=0; i<array1.length; i++){
            if (array1[i]>largest){
                secondLargest=largest;
                largest=array1[i];
            }else if (array1[i]>secondLargest && array1[i]!=largest){
                secondLargest=array1[i];
            }
        }
        System.out.println("The largest number is " + largest + " and second largest number is " + secondLargest);
    }
}
