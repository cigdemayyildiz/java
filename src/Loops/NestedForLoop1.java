package Loops;

public class NestedForLoop1 {

    public static void main(String[] args) {

        for (int a = 1; a<=3; a++){
            for (char ch = 'A'; ch <= 'C'; ch++){
                System.out.println(""+a+ch);
            }
            System.out.println("**");
        }
    }
}
