package IfStatement;

import java.util.Scanner;

public class ElseIfPractice2 {

    public static void main(String[] args) {

         /*
        There is a course that user need to pass
        User got three test scores for this course
        To be able print/show users Letter grade
        -Ask User to provide those three test scores as integer between 0 to 100
        -find the average of the provided test scores
        -Based on the average score
        - if the average is 90 to 100 --> print 'Your average test score is <average> and letter grade is A'
        - if the average is 80 to 89 --> print 'Your average test score is <average> and letter grade is B'
        - if the average is 70 to 79 --> print 'Your average test score is <average> and letter grade is C'
        - if the average is 60 to 69 --> print 'Your average test score is <average> and letter grade is D'
        - if the average is less than 60 --> 'You need to take this course again!!'
         */

        Scanner input = new Scanner(System.in);
        System.out.println("Please enter your scores as an integer between 0 to 100:");
        double score1 = input.nextDouble(), score2 = input.nextDouble(), score3 = input.nextDouble();
        double average = (score1+score2+score3)/3;

        if (average>=90 && average<=100) {
            System.out.println("Your average test score is " + average + " and letter grade is A.");

        } else if (average>=80 && average<=89) {
            System.out.println("Your average test score is " + average + " and letter grade is B.");

        } else if (average>=70 && average<=79) {
            System.out.println("Your average test score is " + average + " and letter grade is C.");

        } else if (average>=60 && average<=69) {
            System.out.println("Your average test score is " + average + " and letter grade is D.");

        } else if (average>=0 && average<60){
            System.out.println("You need to take this course again!!");
        }
        else {
            System.out.println("Your entry is not correct.");
        }

        // second way

        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter your first test score between 0 to 100");
        int firstScore = scanner.nextInt();
        System.out.println("Please enter your second test score between 0 to 100");
        int secondScore = scanner.nextInt();
        System.out.println("Please enter your third test score between 0 to 100");
        int thirdScore = scanner.nextInt();

        int averageAll = (firstScore+secondScore+thirdScore)/3;

        if (averageAll >= 90 && averageAll <= 100){
            System.out.println("Your average test score is " + averageAll + " and letter grade is A.");
        }
        else if (averageAll >= 80 && averageAll < 90){
            System.out.println("Your average test score is " + averageAll + " and letter grade is B.");
        }
        else if (averageAll >= 70 && averageAll < 80){
            System.out.println("Your average test score is " + averageAll + " and letter grade is C.");
        }
        else if (averageAll >= 60 && averageAll < 70){
            System.out.println("Your average test score is " + averageAll + " and letter grade is D.");
        }
        else if (averageAll >=0 && averageAll < 60){
            System.out.println("You need to take this course again!!");
        }

    }
}
