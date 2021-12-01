package Mentoring;

import java.util.Scanner;

public class ReverseStringOrNumber {

    public static void main(String[] args) {

        // ask user to input some words and sout the reverse of the words.
        // String words = "Hello! My name is Cigdem";

        // step1: Read the question carefully and understand what it asks for
        // step2: Start making my logic
        // step3: I need to ask user to input some words
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter a String");
        String words = input.nextLine();
        // step4: I need to reach out every single letter to but how?
        String reverse = "";
        for (int i = words.length()-1; i>=0; i--){
            reverse+=words.charAt(i);
        }
        System.out.println(reverse);

        // step5: I need to start from last not from beginning but how?
        // step6: I need to show them on console I think I know that


//        for (int i=0;i<words.length();i++){
//            System.out.print(words.charAt(i));
//        }

        for (int i=words.length()-1;i>=0;i--){
            System.out.print(words.charAt(i));
        }
    }
}
