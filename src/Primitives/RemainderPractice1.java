package Primitives;

public class RemainderPractice1 {

    public static void main(String[] args) {

        // 123 --> find the sum of the digits from given number

        int number = 123;

        int digit1 = number%10; // 3
        // to reach the last digit

        number = number/10;

        int digit2 = number%10; // 2

        number = number/10;

        int digit3 = number%10; // 1

        int sumOfDigits = digit1+digit2+digit3;

        System.out.println("The sum of digits = " + sumOfDigits); // The sum of digits = 6


    }
}
