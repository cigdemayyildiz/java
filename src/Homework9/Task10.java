package Homework9;

import java.util.Arrays;

public class Task10 {

    public static void main(String[] args) {

        int [] numbers = {4,4,5,12,6,7,12,7,1,1,2,2,3};
        System.out.println(Arrays.toString(numbers));
        String unique = "";
        for (int i = 0; i < numbers.length; i++) {
            int temp = 0;
            for (int j = i+1; j < numbers.length; j++) {
                if (numbers[i] > numbers[j]) {
                    temp = numbers[i];
                    numbers[i] = numbers[j];
                    numbers[j] = temp;
                }if (numbers[i] == numbers[j]){
                    unique += numbers[i];
                    break;
                    }
                }if (!unique.contains(numbers[i] + "")){
                System.out.print(numbers[i]);
            }
        }
        System.out.println();
        System.out.println(Arrays.toString(numbers));
    }
}
