package Homework8;

public class Task7 {

    public static void main(String[] args) {

        int lines = 4;
        int number = 1;

        for (int a = 1; a <= lines ; a++){

            for (int b = 1; b <= a; b++){
                System.out.print(number+" ");
                ++number;
            }
            System.out.println();
        }
    }
}
