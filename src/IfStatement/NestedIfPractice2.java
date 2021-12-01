package IfStatement;

import java.util.Scanner;

public class NestedIfPractice2 {

    public static void main(String[] args) {

        /*
        ask to candidate
        if she/he knows Java
            if yes --> ask if she/he knows Selenium
                if yes --> ask if she/he knows API
                    if yes --> ask if she/he knows SQL
                        if yes --> Congrats! You're hired!
        if Java is no --> print learn Java and come back
            if Selenium is no --> print we need someone who has Selenium knowledge
                if API is no --> print we need someone who knows API testing
                    if SQL if no --> print we need someone who has SQL knowledge
         */

        Scanner input = new Scanner(System.in);
        System.out.println("Do you know Java?  Yes/No");
        String java = input.nextLine();

        if (java.equalsIgnoreCase("yes")){
            System.out.println("Do you know Selenium?  Yes/No");
            String selenium = input.nextLine();

            if (selenium.equalsIgnoreCase("yes")){
                System.out.println("Do you know API Testing?  Yes/No");
                String api = input.nextLine();

                if (api.equalsIgnoreCase("yes")){
                    System.out.println("Do you have SQL knowledge?  Yes/No");
                    String sql = input.nextLine();

                    if (sql.equalsIgnoreCase("yes")){
                        System.out.println("Congrats! You're hired!");
                    }
                    else
                        System.out.println("We need someone who has SQL knowledge");
                }
                else
                    System.out.println("We need someone who knows API testing");
            }
            else
                System.out.println("We need someone who has Selenium knowledge");
        }
        else
            System.out.println("Please learn Java and come back");
    }
}
