package Homework6;

import java.util.Scanner;

public class Task1 {

    public static void main(String[] args) {

        // TASK-1 -- Example 1

        Scanner input = new Scanner(System.in);
        System.out.println("Please enter first String value");
        String firstWord = input.nextLine(); // Cell
        System.out.println("Please enter second Sting value");
        String secondWord = input.nextLine();  // Phone

        String concat = firstWord.concat(secondWord);
        // System.out.println(concat);

        int firstWordLength = firstWord.length(); // 4
        int secondWordLength = secondWord.length(); // 5


        if (firstWordLength > secondWordLength){
            System.out.println(firstWord.substring(0, secondWordLength)+secondWord);
        }
        if (secondWordLength > firstWordLength){
            System.out.println(firstWord+secondWord.substring(0, firstWordLength)); // CellPhon
        }
        if (firstWordLength==secondWordLength){
            System.out.println(firstWord+secondWord);
        }

        // TASK-1 -- Example 2

        System.out.println("Please enter first String value"); // Cable
        String word1 = input.nextLine();
        System.out.println("Please enter second Sting value"); // Mic
        String word2 = input.nextLine();

        if (word1.length()>word2.length()){
            System.out.println(word1.substring(0, word2.length())+word2); // CabMic
        } else if (word2.length()>word1.length()){
            System.out.println(word1+word2.substring(0, word1.length())); // null
        }

    }
}
