package Homework9;

import javax.naming.PartialResultException;
import java.util.Arrays;

public class Task4 {

    public static void main(String[] args) {

        int [] numbers = {3,2,8,9,1,5,4,3,7,8,5,9,9};
        System.out.println(Arrays.toString(numbers));

        String unique = "";
        Arrays.sort(numbers);
        for (int i=0; i<numbers.length; i++){
            boolean isUnique = true;
            for (int j=0; j<i; j++){
                if (numbers[i]==numbers[j]){
                    isUnique=false;
                }
            }if (isUnique){
                unique+=numbers[i];
            }
        }
        System.out.println(unique);
        System.out.println(unique.charAt(unique.length()-2));
        System.out.println();

        // second way

        int [] number = {3,2,8,9,1,5,4,3,7,8,5,9,9};
        int largest = number[0];
        int secondLargest = 0;

        for (int i = 0; i < number.length; i++) {
            if (number[i]>largest){
                secondLargest=largest;
                largest=number[i];
            } else if (number[i]>secondLargest&&number[i]!=largest){
                secondLargest=number[i];
            }
        }
        System.out.println(Arrays.toString(number));
        System.out.println(secondLargest);

    }
}
