package Homework12;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.Date;
import java.util.Scanner;

public class TimeTest {

    public static void main(String[] args) {

        System.out.println("Welcome to the TimeTest class");

        Time time = new Time();
        Time date = new Time();
        Time dateAndTime = new Time();

        Scanner input = new Scanner(System.in);
        System.out.print("Please press 9 to see the instructions: ");
        int number = input.nextInt();

        do {
            if (number==9){
            } else{
                System.out.println("Please press 9");
                number = input.nextInt();
            }
        }while (number!=9);

        do {
            time.getInstructions(number);
            System.out.print("Which instruction do you want to choose?: ");
            int select = input.nextInt();
            switch (select){
                case 1:
                    time = new Time(12, 45,23);
                    time.printTime();
                    break;
                case 2:
                    date = new Time(7,2021);
                    date.printDate();
                    break;
                case 3:
                    dateAndTime = new Time(12,45,23,7,2021);
                    System.out.println(dateAndTime);
                    break;
                case 4:
                    System.out.println("Please enter the hour between 1 to 24 to create");
                    time.setHour(input.nextInt());
                    System.out.println("Please enter the minute between 0 to 60 to create");
                    time.setMinute(input.nextInt());
                    System.out.println("Please enter the second between 0 to 60 to create");
                    time.setSecond(input.nextInt());
                    time.printTime();
                    break;
                case 5:
                    System.out.println("Please enter the month between 1 to 12 to create");
                    date.setMonth(input.nextInt());
                    System.out.println("Please enter the year to create with this format /yyyy/");
                    date.setYear(input.nextInt());
                    date.printDate();
                    break;
                case 6:
                    time.amPm(6);
                    break;
                case 7:
                    date.season(7);
                    break;
                case 8:
                    System.out.println(dateAndTime);
            }
            System.out.println("Do you want to start again? Y/N");
        }while (input.next().equalsIgnoreCase("Y"));
    }
}
