package Mentoring.InterviewPractice;

import java.util.Arrays;

public class Question12 {

    public static void main(String[] args) {

        // How to reverse the array?
        int[] array = {3, 6, 9, 33, 66, 11, 28, 567, 987};

        int[] reversed = new int[9];
        for (int i = array.length-1; i >= 0; i--) {
            reversed[array.length-i-1] = array[i];
        }
        System.out.println(Arrays.toString(reversed));
    }
}
