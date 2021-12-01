package Homework7;

import java.util.Scanner;

public class Task4 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Please enter a String value"); // Success
        String value = input.nextLine();
        String str = "";

        for (int i=0, k=1; i<value.length(); i++, k++){
            str+="a";
            System.out.println(str+value.substring(k));
        }
    }
}
