package Array;

import java.util.Arrays;

public class SplitPractice {

    public static void main(String[] args) {

        // it is returning a string array
        // when you see the split method you should store it in a string
        // it cuts the String form given parameter
        // it comes from String class

        String str = "The fall season is coming";

        String [] words = str.split(" ");
        System.out.println(Arrays.toString(words)); // [The, fall, season, is, coming]
        System.out.println(words[0]);
        System.out.println(words[1]);
        System.out.println(words[2]);
        System.out.println(words[3]);
        System.out.println(words[4]);

        String [] words2 = str.split("a");
        System.out.println(Arrays.toString(words2)); // [The f, ll se, son is coming] it cut the a's
                                                    // a lari yok etti ve onlarin yerinde , goruyorum cunku iki tane
                                                    // a var ve o iki a nin oldugu yerlerden cumleyi kesip uce ayirdi.
                                                    // 3 elements, 2 index are there


    }
}
