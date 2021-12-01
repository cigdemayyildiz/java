package Array;

import java.util.Arrays;

public class ForEachLoop {

    public static void main(String[] args) {

        // it starts from first element and goes all the way to the end of given array

        String [] colors = {"red", "blue", "green", "yellow", "brown", "orange", "white", "purple", "gray", "pink", "violet", "black"};

        // for each loop --> it will start from beginning of the array and go to the end of it

        Arrays.sort(colors);
        for (String color: colors){
//            if (color.equalsIgnoreCase("red"))
//                continue;
            System.out.println(color);
        }

        int [] ids = {9,5,8,23,45,12,50,30,100,11};
        Arrays.sort(ids);
        for (int id: ids){
            if (id>=50)
            System.out.println(id);
        }

        char [] characters = {'g','1','$','*','A','H', '[', 5};
        //Arrays.sort(characters);
        for (char ch: characters){
            if (ch>='A' && ch<='Z' || ch>='a' && ch<='z'){
                System.out.println(ch);
            }
        }
        System.out.println();

        // print letters and numbers
        for (char ch: characters){

            if (Character.isAlphabetic(ch) || Character.isDigit(ch)){
                System.out.println(ch);
            }
        }
        System.out.println();

        // print all other symbols
        for (char ch: characters){

            if (!(Character.isAlphabetic(ch) || Character.isDigit(ch))){
                System.out.println(ch);
            }
        }
    }
}
