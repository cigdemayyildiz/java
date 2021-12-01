package StringBuilder;

import java.util.Arrays;

public class Practice3 {

    public static void main(String[] args) {

        // create a method that takes StringBuilder Array as a parameter
        // this method will replace middle chars of each word with '$' if the word has odd number of letters
        // it will print out those words with their new versions


        StringBuilder [] builders = {new StringBuilder("David"),new StringBuilder("John"),new StringBuilder("Efe")};
        replaceChar(builders);

        String [] arr = {"bugun", "hava", "cok", "guzel"};
        System.out.println(Arrays.toString(arr));

        String arrstr = "";
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
        arr[0] = "dun";
        arr[3] = "guzeldi";
        System.out.println(Arrays.toString(arr));



    }

    public static void replaceChar(StringBuilder [] arr){
        for (int i = 0; i < arr.length; i++) {
            if (arr[i].length()%2==1){
                arr[i].replace(arr[i].length()/2,(arr[i].length()/2)+1,"$");
                System.out.println(arr[i]);
            }
        }

    }
}
