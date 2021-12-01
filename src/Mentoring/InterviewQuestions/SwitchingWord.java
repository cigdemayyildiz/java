package Mentoring.InterviewQuestions;

import java.util.Arrays;

public class SwitchingWord {

    public static void main(String[] args) {

        // switch the pairs
        String[] array={"four", "flowers", "sun", "eleven", "cloud", "better", "git"};

        for (int i = 0; i < array.length-1; i++) {
            String temp = array[i];
            array[i]=array[i+1];
            array[i+1]=temp;
            i++;
        }
        System.out.println(Arrays.toString(array));

        String[] array3={"2", "1", "4", "3", "6", "5", "7"};

        for (int i = 0; i < array3.length-1; i+=2) {

            String temp = array3[i];
            array3[i]=array3[i+1];
            array3[i+1]=temp;
        }
        System.out.println(Arrays.toString(array3));
    }
}
