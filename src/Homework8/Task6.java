package Homework8;

public class Task6 {

    public static void main(String[] args) {

        String word = "Civic";
        String newWord = "";

        for (int i=word.length()-1; i>=0; i-- ){
            newWord+=word.charAt(i);
        }if (word.equalsIgnoreCase(newWord)){
            System.out.println(newWord+" is a palindrome");
        }else {
            System.out.println(newWord+" is not a palindrome");
        }
        System.out.println();
    }
}
