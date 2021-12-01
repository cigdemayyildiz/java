package Loops;

public class ReverseString {

    public static void main(String[] args) {

        String str = "Selenium";
        String store = "";

        for (int a = str.length()-1; a>=0; a--){
            store+=str.charAt(a);
            System.out.println(store);

        }System.out.print(store);

    }
}
