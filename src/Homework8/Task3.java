package Homework8;

public class Task3 {

    public static void main(String[] args) {

        int givenNumber = 153;
        int number1 = 0;
        int digit = 0;
        int ttl = 0;

        number1=givenNumber;
        while (number1>0){
            digit=number1%10;
            ttl+=digit*digit*digit;
            number1/=10;
        }
        if (ttl==givenNumber){
            System.out.println(givenNumber + " is an Armstrong number");

        }else {
            System.out.println(givenNumber + " is Not an Armstrong number");
        }
        System.out.println();

    }
}
