package Homework1;

public class Task1 {

    public static void main(String[] args) {

        int minutes = 3456789;
        int hours = minutes/60;
        int days = hours/24;
        int years = days/365;

        System.out.println(minutes + " minutes is approximately " + years + " years and " + days%365 + " days.");
        // 3456789 minutes is approximately 6 years and 210 days.

    }
}
