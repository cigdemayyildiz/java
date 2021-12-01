package Loops;

public class PalindromeWord {

    public static void main(String[] args) {

        String word = "Madam";
        String newWord = "";

        for (int a=word.length()-1; a>=0; a--) {
            newWord += word.charAt(a);
        }
        if (word.equalsIgnoreCase(newWord)){
            System.out.println(word+" is a palindrome word.");
        }
        else {
            System.out.println(word + " is NOT a palindrome word.");
        }
    }
}
