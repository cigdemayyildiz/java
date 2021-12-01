package Homework6;

public class Task3 {

    public static void main(String[] args) {

        String str1 = "xHi";
        String str2 = "Hxi";

        if (str1.charAt(0)=='x'){
            System.out.println(str1.substring(1)); // Hi
        }
        if (str2.charAt(1)=='x'){
            System.out.println(str2.substring(0,1).concat(str2.substring(2))); // Hi
        }

    }
}
