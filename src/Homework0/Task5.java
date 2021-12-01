package Homework0;

public class Task5 {

    public static void main(String[] args) {

        // formula --> (32°F − 32) × 5/9 = 0°C

        double fahrenheit = 212;
        double celsius = (fahrenheit-32)*5/9;

        System.out.println(fahrenheit + " degree Fahrenheit is equal to " + celsius + " in Celsius.");
        // 212.0 degree Fahrenheit is equal to 100.0 in Celsius.
    }
}
