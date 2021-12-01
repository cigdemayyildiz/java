package Mentoring.InterviewQuestions;

public class A02Swap {

    public static void main(String[] args) {

        // Write a program to swap 2 numbers without a temporary variable

        int a = 5;
        int b = 10;

        a = a+b; // 15
        b = a-b; // 5
        a = a-b; // 10
        System.out.println("a="+a);
        System.out.println("b="+b);

        // Write a program to swap 2 Strings without a temporary variable

        String x = "Hello";
        String y = "Techtorial";

        x = x+y; // HelloTechtorial
        y = x.substring(0,x.length()-y.length()); // Hello
        x = x.substring(y.length()); // Techtorial
        System.out.println("x="+x);
        System.out.println("y="+y);




    }
}
