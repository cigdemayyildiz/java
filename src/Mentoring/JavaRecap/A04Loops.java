package Mentoring.JavaRecap;

import java.util.Scanner;

public class A04Loops {

    public static void main(String[] args) {

        // Loop is defined as a cycle it means the action repeats unless condition is true

        // do-while
        // while
        // for
        // for each

        int x = 6;
        int y = 7;

        do {
            System.out.println("Hello");
            y--;
        }while (y>x);


        int choice;
        do {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Please enter the number \n1)Enter\n2)Exit");
            choice=scanner.nextInt();
        }while (choice!=2);


        // *Interview
        // For this kind of question I really want to use While Loop
        // sum of digit and multiplication of the digit
        // 21 // 720
        int number = 123456;
        int digit;
        int sum = 0;

        while (number>0){
            digit = number%10;
            sum += digit;
            number /= 10;
        }
        System.out.println(sum); // 21


        int number1 = 123456;
        int digit1;
        int multiplication = 1;

        while (number1>0){
            digit1 = number1%10;
            multiplication *= digit1;
            number1 /= 10;
        }
        System.out.println(multiplication);



        // *Interview
        // String word = "Please reverse me";
        String word = "Please reverse me";
        String reversed = "";
        for (int i=word.length()-1; i>=0; i--){
            reversed=reversed+word.charAt(i);
        }
        System.out.println(reversed);

        // second way
        StringBuilder stringBuilder = new StringBuilder(word);
        System.out.println(stringBuilder.reverse());



        // *** Interview
        // Nested Loop
        // find the duplicate letters
        // output : e,s,r
        String word1 = "Please reverse me";
        String result = "";
        boolean isMatching;
        for (int i = 0; i < word1.length(); i++) {
            isMatching = false;
            for (int j = i+1; j < word1.length(); j++) {
                if (word1.charAt(i)==word1.charAt(j)){

                    isMatching = true;
                }
            }if (isMatching&&!result.contains(""+word1.charAt(i))&&word1.charAt(i)!=' '){
                result+=word.charAt(i);

            }
        }
        System.out.println(result);





    }
}
