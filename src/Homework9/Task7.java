package Homework9;

public class Task7 {

    public static void main(String[] args) {

        int [] numbers = {2,3,4,5,6,7,8};

            for (int i = 1; i < numbers.length; i++) {
                for (int j = 1; j < 10; j++) {
                    System.out.println(numbers[i]+" X "+j+" = "+numbers[i]*j);

                }System.out.println();
            }
    }
}
