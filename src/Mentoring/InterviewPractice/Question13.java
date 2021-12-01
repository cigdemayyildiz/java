package Mentoring.InterviewPractice;

import java.util.Arrays;

public class Question13 {

    public static void main(String[] args) {

        // How to find the missing number in an array?

        int [] array = {0,4,2,3,6,5,8,9,7};
        System.out.println(Arrays.toString(array));
        Arrays.sort(array);
        System.out.println(Arrays.toString(array));

        for (int i=0; i< array.length; i++){
            if (array[i+1]!=array[i]+1){
                System.out.println(array[i]+1);
                break;
            }
        }



    }
}
