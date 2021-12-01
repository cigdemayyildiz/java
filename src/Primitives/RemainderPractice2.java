package Primitives;

public class RemainderPractice2 {

    public static void main(String[] args) {

        // find the product of digits from a four digit given number (1111)
        // print the result as following:
        // "The product is ..."

        int number = 4356;

        int digit1 = number%10; // 6
        number = number/10;

        int digit2 = number%10; // 5
        number = number/10;

        int digit3 = number%10; // 3
        number = number/10;

        int digit4 = number%10; // 4

        int result = digit1*digit2*digit3*digit4;

        System.out.println("The product is " + result); // The product is 360
    }
}
