package Array;

import java.util.Arrays;

public class MultidimensionalArray {

    public static void main(String[] args) {

        // int [][] numbers = new int [3][2] --> it means I have two dimensional array
                                    // ilk koseli parantez ikinci koseli parantezi kapsar
                                    // 3 kutu var ve her kutu icinde iki element var

        // int [] [] [] numbers = new int [1] [2] [3] --> bir buyuk kutu icinde iki kucuk kutu ve her iki kutu icinde uc kucuk kutu

        int [][] numbers = new int [3][4];

        numbers[0][0] = 11;
        numbers[0][1] = 22;
        numbers[0][2] = 33;
        numbers[0][3] = 44;
        numbers[2][3] = 99;
       // numbers[3][0] = 111; // ArrayIndexOutOfBoundsException

        System.out.println(numbers[0][0]); // 11
        System.out.println(numbers[0][3]); // 22
        System.out.println(numbers[2][3]); // 99

        System.out.println(Arrays.toString(numbers)); // .toString() method will print out hash code for multidimensional array

        System.out.println(Arrays.deepToString(numbers)); // [[11, 22, 33, 44], [0, 0, 0, 0], [0, 0, 0, 99]]

        for (int i = 0; i < numbers.length; i++) {

            for (int j = 0; j < numbers[i].length; j++) {

                System.out.print(numbers[i][j]+" ");

            }

        }


    }
}
