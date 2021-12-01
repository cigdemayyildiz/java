package IfStatement;

import java.util.Scanner;

public class NestedIfPractice {

    public static void main(String[] args) {

        /*
        ask user for his/her city name
        if the city name is Chicago
        ask user "What is the school name?"
        if the school name is Techtorial
        print --> "You are lucky to be in the Batch10"
        if the school name is not Techtorial
        print --> "Please come and visit us"
        if the city name is not Chicago
        print --> "Please come to Chicago"
         */

        Scanner input = new Scanner(System.in);
        System.out.println("What is your city name?");
        String city = input.nextLine();

        if (city.equalsIgnoreCase("Chicago")){

            System.out.println("What is your school name?");
            String school = input.nextLine();

            if (school.equalsIgnoreCase("Techtorial")){
                System.out.println("You are lucky to be in the Batch10");
            }
            else {
                System.out.println("Please come and visit us");
            }
        }
        else {
            System.out.println("Please come to Chicago");
        }
    }
}
