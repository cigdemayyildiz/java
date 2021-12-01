package Primitives;

public class DataTypes {

    public static void main(String[] args) {

        /*
        There are 8 different primitive data types
        byte, short, int, long, float, double --> these are for numbers
        char --> for single character
        boolean --> for true or false
         */

        byte number = 6;
        byte number1 = 127;
        // byte number2 = 129; --> compile time error

        short number3 = 129;
        short number4 = 31789;

        int number5 = 32_000; // you can use underscore (_) in between digits
        int number6 = 1_000_000;  // it is more understandable with the underscores, underscores will not effect the value

        long number7 = 341345;
        long number8 = 74_813_492_034_854l; // you should use 'l/L' at the end of long values

        float number9 = 2.3f; // you should use 'f/F' at the end of float values
        float number10 = 56; // 56 --> 56.0
        float number11 = 56.0f;

        double number12 = 2.1;
        double number13 = 89; // double data type can store int data types because it means 89 --> 89.0

        // most common primitive data type usages are int, double, long, boolean.
    }
}
