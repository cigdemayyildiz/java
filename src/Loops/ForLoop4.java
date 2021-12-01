package Loops;

public class ForLoop4 {

    public static void main(String[] args) {

        // String str = "aB*12345&*!d";
        // count and print out how many letters are there in the String
        // count and print out how many numbers are there in the String
        // count and print out how many other chars are there in the String
        // There are 3 letters in the String
        // There are 5 number in the String
        // There are 7 other symbols in the String

        String str = "aB*12345&*!d";
        int indexNumber = 0;
        int letterCount = 0;
        int numberCount = 0;
        int otherCount = 0;

        for (; indexNumber<str.length();indexNumber++){
            if (str.charAt(indexNumber)>='A' && str.charAt(indexNumber)<='Z' ||
                    str.charAt(indexNumber)>='a' && str.charAt(indexNumber)<='z')
                letterCount++;
            else if (str.charAt(indexNumber)>='0' && str.charAt(indexNumber)<='9'){
                numberCount++;
            }
            else {
                otherCount++;
            }
        }
        System.out.println("There are " + letterCount + " letters in the String");
        System.out.println("There are " + numberCount + " numbers in the String");
        System.out.println("There are " + otherCount + " chars in the String");

    }
}
