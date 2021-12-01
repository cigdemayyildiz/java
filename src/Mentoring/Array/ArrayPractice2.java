package Mentoring.Array;

import Array.ForEachLoop;

import java.util.Arrays;

public class ArrayPractice2 {

    public static void main(String[] args) {

        // String name = "Hello Java is so cool";
        // print out each of the word one by one
        // reverse them
        // get first and last letter of each word

        String name = "Hello Java is so cool";
        String [] eachWord = name.split(" ");
        System.out.println(Arrays.toString(eachWord));

        for (String words: eachWord) {
            String reverse = "";
            for (int i = words.length()-1; i >= 0 ; i--) {
                reverse+=words.charAt(i);
            }

            //System.out.println(reverse + ", ");
            //System.out.println(reverse.charAt(0) + ", ");
            //System.out.println(reverse.charAt(reverse.length()-1));
        }
        System.out.println();

        for (int i=0; i<eachWord.length; i++){
            String reverse = "";
            for (int j = eachWord[i].length()-1; j>=0 ; j--) {
                reverse+=eachWord[i].charAt(j);
            }
            System.out.println(reverse);
        }


    }
}
