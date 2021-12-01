package Homework1;

public class Task5 {

    public static void main(String[] args) {

        int number = 12345;

        int lastDigit = number%10;
        number /= 10;

        int forthDigit = number%10;
        number /= 10;

        int thirdDigit = number%10;
        number /= 10;

        int secondDigit = number%10;
        number /= 10;

        int firstDigit = number%10;

        System.out.println(firstDigit + " " + secondDigit + " " + thirdDigit + " " + forthDigit + " " + lastDigit);
        // 1 2 3 4 5

    }
}
