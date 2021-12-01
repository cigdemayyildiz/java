package Loops;

public class ForLoop2 {

    public static void main(String[] args) {

        // print out the letters from given String value
        // chicago
        // print out letters starting from end to beginning


        String word = "chicago";
        int length = 0;

        for (; length<word.length(); length++){
            System.out.print(word.charAt(length) + ", ");

        }

        System.out.println("-");
        for (int index = word.length()-1 ; index>=0 ;index--){
            System.out.print(word.charAt(index)+", ");
        }

        System.out.println("-");

        // print out only letter 'o' from this String
        String string = "Today is the day to practice for loop";
        int count =0;
        for (int i =0; i<string.length(); i++){
            if (string.charAt(i)=='o'){
                System.out.println(string.charAt(i) + " - " + i); // i--> index number
                count++;

            }
        }
        System.out.print("There are " + count + " letter 'o' in the String." );




    }
}
