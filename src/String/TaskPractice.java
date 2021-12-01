package String;

import java.util.Scanner;

public class TaskPractice {

    public static void main(String[] args) {
        /*
         TASK: get a string from User via scanner and:
         - print:
         - first char
         - last char
         - index of second matching letter 'c'
         - length of string
         - index of x
        */

        Scanner input = new Scanner(System.in);
        System.out.println("Please enter a word"); // Chicago
        String word = input.nextLine();
        System.out.println(word.charAt(0)); // C
        System.out.println(word.charAt(word.length()-1)); // o
        System.out.println(word.indexOf("c", word.indexOf("c")+1)); // -1
        System.out.println(word.indexOf("c", 0)); // 3
        System.out.println(word.length()); // 7
        System.out.println(word.indexOf("x")); // -1
    }
}
