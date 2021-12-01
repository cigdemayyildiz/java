package IfStatement;

import java.util.Scanner;

public class DaysOfWeek1 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter first letter of the day");
        String letterOfDay = scanner.nextLine();

        if (letterOfDay.toLowerCase().contains("m")){
            System.out.println("It is Monday");
        }
        if (letterOfDay.toLowerCase().contains("t")){
            System.out.println("It is Tuesday or Thursday");
        }
        if (letterOfDay.toLowerCase().contains("w")){
            System.out.println("It is Wednesday");
        }
        if (letterOfDay.toLowerCase().contains("f")){
            System.out.println("It is Friday");
        }
        if (letterOfDay.toLowerCase().contains("s")){
            System.out.println("It is Saturday or Sunday");
        }
    }
}
