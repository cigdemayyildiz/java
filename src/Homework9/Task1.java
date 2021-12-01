package Homework9;

import java.util.Arrays;
import java.util.Scanner;

public class Task1 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int [] givenNumber = {10,4,3,55,32,145,443,234,98,32};
        System.out.println(Arrays.toString(givenNumber));
        System.out.println("Please enter any number from above");
        int number = input.nextInt();

        for (int i = 0; i < givenNumber.length; i++) {
            if (givenNumber[i]==number){
                givenNumber[i] = 0;
            }
        }
        System.out.println(Arrays.toString(givenNumber));


    }
}
