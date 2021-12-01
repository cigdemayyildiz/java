package Array;

import java.util.Arrays;

public class SplitPractice2 {

    public static void main(String[] args) {

        // check if the month is 12 and print out --> it is correct month
        // \\.
        String date = "12.03.2021";

        String [] dates = date.split("\\.");

        System.out.println(Arrays.toString(dates));

        if (dates[0].equals("12")){
            System.out.println("it is correct month");
        }else {
            System.out.println("It is NOT correct month");
        }

        String date1 = "11/03/2021";

        String [] dates1 = date1.split("/");
        System.out.println(Arrays.toString(dates1));

        String text = "My \rfavorite \bcolor is \"blue\". \nHow about \fyou?\t \\"; // \t --> tab, \r --> cut before
        System.out.println(text);
    }
}
