package Homework2;

public class Task2 {

    public static void main(String[] args) {

        int result = 4*7+3-2*9%5/3-2;
        /*
        Pseudocode
        4*7+3-2*9%5/3-2
        28+3-2*9%5/3-2
        28+3-18%5/3-2
        28+15%5/3-2
        28+0/3-2
        28+0/1
        28+0
        28
         */
        System.out.println(result);

        int result1 = 12-3/3+4-2*2%4+12%3/3;
        /*
        Pseudocode
        12-3/3+4-2*2%4+12%3/3
        12-1+4-2*2%4+12%3/3
        12-1+4-4%4+12%3/3
        12-1+4-4%4+12%1
        12-1+4+12%1
        12-1+4
        11+4
        15
        */

        int number = 15%4;
        System.out.println(number);
    }
}
