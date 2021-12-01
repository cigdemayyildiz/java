package Homework1;

public class Task2 {

    public static void main(String[] args) {

        // Formula --> [weight (lb) / height (in) / height (in)] x 703

        double weightInPounds = 452;
        double heightInInches = 72;
        double bodyMessIndex = (weightInPounds/heightInInches/heightInInches)*703;
        System.out.println("Body Mess Index is " + bodyMessIndex); // Body Mess Index is 61.295524691358025
    }
}
