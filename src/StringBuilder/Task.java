package StringBuilder;

public class Task {

    public static void main(String[] args) {

        // StringBuilder is mutable

        String string = "";

        // print upperCase letters by including this String in your coding

        for (char ch = 'A'; ch <= 'Z'; ch++){
            string+=ch + ", ";
        }
        System.out.println(string);
    }
}
