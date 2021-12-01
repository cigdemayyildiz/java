package Array;

public class Task1 {

    public static void main(String[] args) {

        String [] colors = {"Red", "Blue", "Green", "Yellow", "Brown", "Orange", "White", "Purple", "Gray", "Pink", "Violet", "Black"};

        // print out every element in reverse version
        for (String color: colors){
            String reverse = "";
            for (int i=color.length()-1; i>=0; i--){
                reverse+=color.charAt(i);
            }
            System.out.print(reverse+", ");
        }
    }
}
