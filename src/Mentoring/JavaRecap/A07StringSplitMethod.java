package Mentoring.JavaRecap;

import java.util.Arrays;

public class A07StringSplitMethod {

    public static void main(String[] args) {

        // Split method comes from String object
        // The main reason people are using split method to split the words from the space

        String sentence = "Today is a beautiful day to recap Java with you guys";
        String [] split = sentence.split(" ");
        System.out.println(Arrays.toString(split));
        System.out.println(split.length);

        int sum = 0;
        for (String sp : split){
            System.out.print(sp.length() +"="+ sp+ " ");
        }


    }
}
