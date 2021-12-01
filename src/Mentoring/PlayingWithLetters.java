package Mentoring;

import java.util.Scanner;

public class PlayingWithLetters {

    public static void main(String[] args) {

        // ask user to enter a String value with three word
        // 1. Print first letter of each word
        // 2. Print last letter of each word
        // 3. Print the sum of last letter of each word's index number
        // 4. Print the sum of first letter of each word's index number

        Scanner input = new Scanner(System.in);
        System.out.println("Please enter a String value with three word");
        String word = input.nextLine();
        String firstLetter = "";
        firstLetter+=word.charAt(0);
        String lastLetter = "";
        for (int i=0; i<word.length();i++){
            if (word.charAt(i)==' '){
                firstLetter+=word.charAt(i+1);
                lastLetter+=word.charAt(i-1);
            }
        }
        lastLetter+=word.charAt(word.length()-1);
        System.out.println(firstLetter);
        System.out.println(lastLetter);
    }
}
