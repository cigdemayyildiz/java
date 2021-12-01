package Projects;

import java.util.Scanner;

public class Project5 {

    public static void main(String[] args) {

        // TASK-1
        String str = " Job".trim();
        String reverse = "";
        for (int i=str.length()-1; i>=0; i--){
            reverse+=str.charAt(i);

        }System.out.println(reverse);


        //TASK-2
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter the min number");
        int minNumber = input.nextInt();
        System.out.println("Please enter the max number");
        int maxNumber = input.nextInt();

        System.out.println();

        int sum = 0;
        for (;minNumber<maxNumber;minNumber++){

            if (minNumber%2==0 && minNumber%7==0){
                System.out.println(minNumber);
            sum+=minNumber;
            }
            for (;minNumber>maxNumber;maxNumber++){
                if (maxNumber%2==0 && maxNumber%7==0) {
                    System.out.println(maxNumber);
                }
            }
        }
        System.out.println(sum);

        //TASK-3
        System.out.println("Please enter a number");
        int number = input.nextInt();

        int counter = 0;
        if (number<1){
            System.out.println("All numbers are bigger than 1, prime number");
        }else {
            for (int i=1; i<=number; i++){
                int remainder = number%i;
                if (remainder==0){
                    counter++;
                }
            }   if (counter==2){
                System.out.println(number+" is a prime number.");

            }else {
                System.out.println(number+ " is NOT a prime number.");
            }
        }


        //TASK-4
        System.out.println("Please enter a number between 0 to 10");
        int num = input.nextInt();

        for (int a = 1; a <= num ; a++){

            for (int b = 1; b <= a; b++){
                System.out.print(a);
            }
            System.out.println();
        }

        //TASK-5
        System.out.println("Please enter a number between 0 to 10");
        int numb = input.nextInt();

        for (int a = numb; a>=1; a--){
            for (int b=1; b<=a; b++){
                System.out.print(a);
            }
            System.out.println();

        }

        //TASK-6
        input.nextLine();
        System.out.println("Please enter a sentence");
        String sentence = input.nextLine();

        String store = "";
        for (int i=0; i<sentence.length();i++ ){
            if (store.indexOf(sentence.charAt(i))<0){
                store+=sentence.charAt(i);
            }
        }
        System.out.println(store);


        //TASK-7
        System.out.println("Please enter a sentence");
        String text = input.nextLine();

        for (int i = 0; i < text.length(); i++) {
            if (text.charAt(i)>='A' && text.charAt(i) <= 'Z'){
                if (i == 0){
                    System.out.print(text.charAt(i));
            }else {
                    System.out.print(" " + text.charAt(i));
                }
            }else{
                System.out.print(text.charAt(i));
            }
        }
    }
}
