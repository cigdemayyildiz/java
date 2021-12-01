package Homework9;

import java.util.Arrays;

public class Task9 {

    public static void main(String[] args) {

        int[] numbers = {4, 4, 5, 12, 6, 7, 12, 7, 1, 1, 2, 2, 3};
        Arrays.sort(numbers);
        String unique = "";
        for (int i = 0; i < numbers.length; i++) {
            for (int j = i + 1; j < numbers.length; j++) {
                if (numbers[i] == numbers[j]) {
                    unique += numbers[i];
                    break;
                }
            }
            if (!unique.contains(numbers[i] + "")) {
                System.out.print(numbers[i]);
            }
        }
    }
}
