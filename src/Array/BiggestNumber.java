package Array;

import java.util.Arrays;

public class BiggestNumber {

    public static void main(String[] args) {

        // create an array to store these numbers: 45, 5, 6, 47, 57, 8, 12,30
        // using loop print out only numbers they are greater than 10
        // find the biggest number from this array

        int [] numbers = {45, 5, 6, 47, 57, 8, 12, 30};
        int [] smallNumbers;

        for (int i=0;i<numbers.length;i++){
            if (numbers[i]>10){
                System.out.println(numbers[i]);
            }else {
                smallNumbers=numbers;
                System.out.println(smallNumbers[i]);
            }
        }

        System.out.println("**");

        int biggestNumber = numbers[0];

        for (int i=0; i<numbers.length; i++){
            if (numbers[i]>biggestNumber){
                biggestNumber=numbers[i];
            }
        }
        System.out.println("The biggest number is: "+biggestNumber);
        System.out.println();

        System.out.println(Arrays.toString(numbers));

        int smallestNumber = numbers[0];

        for (int i=0; i<numbers.length; i++){
            if (numbers[i]<smallestNumber){
                smallestNumber=numbers[i];
            }
        }
        System.out.println("The smallest number is: "+smallestNumber);
        System.out.println();

        Arrays.sort(numbers); // sort
        System.out.println(Arrays.toString(numbers));

        System.out.println(numbers[numbers.length-1]); // this is last element and also the biggest number since the array is sorted
        System.out.println(numbers[0]); // this is first element and also the smallest number since the array is sorted
    }
}
