package TernaryOperation;

import java.util.Scanner;

public class Practice3 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Please enter your last name");
        String lastName = input.nextLine().toUpperCase();

        String answer = 'A' <= lastName.charAt(0) && lastName.charAt(0) <= 'K' ?
                lastName.concat(" is the most popular last name") : lastName.concat(" is a well known last name");

        System.out.println(answer);
    }
}
