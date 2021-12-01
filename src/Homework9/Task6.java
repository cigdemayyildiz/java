package Homework9;

import java.util.Arrays;

public class Task6 {

    public static void main(String[] args) {

        int [] numbers = {3,7,5,12,64,77};

        for (int i = 0; i < numbers.length; i++) {
            numbers[i]=numbers[i]* numbers[i];
        }
        System.out.println(Arrays.toString(numbers));



    }
}
