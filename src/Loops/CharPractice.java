package Loops;

public class CharPractice {

    public static void main(String[] args) {

        // print out alphabet in uppercase letters
        for (char ch = 'A'; ch<='Z'; ch++) {
            System.out.print(ch + ", ");
        }

        // print out alphabet in lowercase letters
        for (char ch = 'a'; ch <= 'z'; ch++){
            System.out.print(ch + ", ");
        }

        // print out alphabet in uppercase and lowercase letters
        for (char ch = 'A', ch1 = 'a'; ch<='Z' && ch1<='z'; ch++, ch1++){
            System.out.println("\n" + ch + ", ");
            System.out.println(ch1 + ", ");
        }

        // print out alphabet in one uppercase and one lowercase letters
        for (char ch = 'A', ch1 = 'b'; ch <= 'Z' && ch1 <= 'z'; ch+=2, ch1+=2){
            System.out.print(ch + "-");
            System.out.print(ch1 + "-");
        }
    }
}
