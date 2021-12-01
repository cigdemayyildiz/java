package Array;

import java.util.Arrays;

public class ArrayPractice5 {

    public static void main(String[] args) {

        // Another way to create array
        int [] zipCodes = {1234, 4321, 5678, 9867};

        System.out.println(zipCodes.length); // 4
        System.out.println(zipCodes[0]); // 1234

        System.out.println(Arrays.toString(zipCodes));

        zipCodes[1]=9999;
        System.out.println(Arrays.toString(zipCodes));
        System.out.println();

        Object [] objects = {1, "Cigdem", "red", 3.2, 'G', null, false };
        System.out.println(Arrays.toString(objects));

        System.out.println();

        for (int i=0; i<objects.length;i++){
            System.out.println(objects[i]);
        }
        System.out.println();

        boolean [] conditions = {true, false, false, false, true, true, 5==5, 5!=5};
        System.out.println(Arrays.toString(conditions));

        System.out.println();

        char [] characters = {'a', 'b', 'c', 'd', 'Z', 'Y', '&', '$', '*', '7', '4', 69};
        System.out.println(Arrays.toString(characters));

        System.out.println();

        int [] chars = {'A'};
        System.out.println(Arrays.toString(chars)); // 65
    }
}
