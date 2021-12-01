package Primitives;

public class ArithmeticOperators {

    public static void main(String[] args) {

        // arithmetic operators are +, -, *, /, %

        int a = 9;

        int b = a+5; // this is number of people

        int carCount = b*2;

        System.out.println(carCount); // if each person has 2 cars

        int finalCarCount = carCount-10;

        System.out.println(finalCarCount);

        int numberOfRows = finalCarCount/3;

        System.out.println("I need this many rows to park all the cars: " + numberOfRows);

        double division = a/2d;

        System.out.println(division); // 4.5

        int division1 = a/2;

        System.out.println(division1);


    }
}
