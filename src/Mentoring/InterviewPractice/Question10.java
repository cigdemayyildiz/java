package Mentoring.InterviewPractice;

import java.util.Arrays;

public class Question10 {

    public static void main(String[] args) {

        // How to sort the array without the sort method?
        int [] array = {3,5,7,2,67,11,45};
        int temp;
        for (int i=0; i<array.length; i++){
            for (int j = i+1; j<array.length; j++) {
                if (array[i]>array[j]){
                    temp = array[i];
                    array[i] = array[j];
                    array[j] = temp;
                }
            }
        }
        System.out.println(Arrays.toString(array));
    }
}
