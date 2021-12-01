package Loops;

public class CountLetters {

    public static void main(String[] args) {

        String sentence = "I want to solve this question by myself this time";

        int index = 0;
        int count = 0;

        while(index<sentence.length()){
            if (sentence.charAt(index) =='i' || sentence.charAt(index) == 'I'){
                count++;
            } index++;
        }
        System.out.println("There are " + count + " 'i' is in the given sentence.");

    }
}
