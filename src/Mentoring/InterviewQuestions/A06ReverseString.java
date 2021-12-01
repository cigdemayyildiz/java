package Mentoring.InterviewQuestions;

public class A06ReverseString {

    public static void main(String[] args) {

        // Write a Java program to reverse String

        // Using StringBuffer
        String word = "Hello Techtorial";
        StringBuffer stringBuffer = new StringBuffer(word);
        System.out.println(stringBuffer.reverse()); // lairothceT olleH

        //Using StringBuilder
        String word1 = "Hello Techtorial";
        StringBuilder stringBuilder = new StringBuilder(word1);
        System.out.println(stringBuilder.reverse()); // lairothceT olleH

        // Using charAt();
        String word2 = "Hello Techtorial";
        String reversed = "";
        for (int i=word2.length()-1; i>=0; i--){
            reversed = reversed + word2.charAt(i);
        }
        System.out.println(reversed); // lairothceT olleH


        // Using charArray();
        String word3 = "Hello Techtorial";
        String reversed1 = "";
        char[] array = word3.toCharArray();
        for (int i=array.length-1; i>=0; i--){
            reversed1 += array[i];
        }
        System.out.println(reversed1); // lairothceT olleH

        // Using substring();
        String word4 = "Hello Techtorial";
        String reversed2 = "";
        for (int i=word4.length(); i>=1; i--){
            reversed2+=word4.substring(i-1,i);
        }
        System.out.println(reversed2); // lairothceT olleH


        // Reverse a String one by one
        String str = "I love Java";
        String[] strarr = str.split(" ");
        for (int i=0; i<strarr.length; i++){
            String rever = "";
            for (int j=strarr[i].length()-1; j>=0; j--){
                rever+=strarr[i].charAt(j);
            }
            System.out.print(rever+" ");
        }

        // Reverse each word in a sentence



    }

}
