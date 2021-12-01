package Mentoring.InterviewPractice;

public class Question7 {

    public static void main(String[] args) {

        // Write a java program to check whether a given number is PRIME or not

        int number = 29;
        boolean flag = false;
        for (int i=2; i<number; i++){ // asal sayi yanliz 1'e ve kendisine bolunebilen sayi, o yuzden donguye 2'den
                                     // basliyoruz
            if (number%i==0){
                flag = true;
                break;
            }
        }if (flag){
            System.out.println(number+" is NOT prime");
        }else {
            System.out.println(number+" is prime");
        }
    }
}
