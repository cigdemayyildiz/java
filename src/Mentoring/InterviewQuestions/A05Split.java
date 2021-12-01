package Mentoring.InterviewQuestions;

public class A05Split {

    public static void main(String[] args) {

        // What is the return type of split(); method?
        String techtorial = "Techtorial interview preparation document";

        String[] words = techtorial.split(" "); // split with the spaces

        System.out.println(words.length); // 4

        for (String word : words){
            System.out.println(word);
        }
    }
}
