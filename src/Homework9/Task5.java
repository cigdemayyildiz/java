package Homework9;

import java.util.Arrays;

public class Task5 {

    public static void main(String[] args) {

        float [] fahrenheit ={74,68,101,72,24,96};
        System.out.println(Arrays.toString(fahrenheit));
        float [] celcius=fahrenheit;

            for (int i = 0; i < fahrenheit.length; i++) {
                fahrenheit[i] = (fahrenheit[i]-32) * 5/9;
            }
        System.out.println(Arrays.toString(celcius));

    }
}
