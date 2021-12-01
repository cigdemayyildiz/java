package Mentoring;

public class StringReverse {

    // without using inbuilt method and creating a new String variable write a method to reverse a String

    public static String reverseString(String str){

        for (int i = str.length()-1; i <= 0; i--) {

            // I should reassign
            str+=str.charAt(i);
            // I am going to have the word and reversed version

        }
        // if I remove the first portion
        return str.substring(str.length()/2);
    }

    public static void main(String[] args) {

        System.out.println(reverseString("Techtorial")); // orial

    }

}
