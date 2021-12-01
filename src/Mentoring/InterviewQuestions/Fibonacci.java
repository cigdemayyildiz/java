package Mentoring.InterviewQuestions;

public class Fibonacci {

    public static void main(String[] args) {

        // Write a Java program to print the first 10 numbers of Fibanacci Series
        int a = 0, b = 1, c;
        for (int i=0; i<10; i++){
            System.out.println(a+" ");
            c=a+b;
            a=b;
            b=c;
        }

    }
}
