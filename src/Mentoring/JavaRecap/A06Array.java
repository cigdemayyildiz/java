package Mentoring.JavaRecap;

import javax.print.event.PrintEvent;
import java.util.Arrays;

public class A06Array {

    public static void main(String[] args) {

        // Array --> fixed size you have to define the size at the beginning
        // It doesn't have methods

        int [] numbers = new int[3];
        numbers[0] = 1;
        System.out.println(numbers); // hashCode
        System.out.println(Arrays.toString(numbers)); // [1, 0, 0]

        int [] numbers2 = {1,2,3,4,5,6,7,8,9};
        int sum = 0;
        for (int num : numbers2){
            sum+=num;
        }
        System.out.println(sum);

        // print out each of the word and reverse them
        String name = "Hi guys how are you";
        String result = " ";
        char ch[]= name.toCharArray();
        for (int i = name.length() - 1; i >= 0; i--) {
            result+=ch[i];
        }
        System.out.println(result);

        String name1 = "Hi guys how are you";
        String [] split = name1.split(" ");
        for (int i = split.length-1; i >=0 ; i--) {
            String reverse = "";
            for (int j = split[i].length()-1; j >=0 ; j--) {
                reverse+=split[i].charAt(j);
            }
            System.out.print(reverse + " ");
        }
    }
}
