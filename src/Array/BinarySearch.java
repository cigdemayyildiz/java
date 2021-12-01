package Array;

import java.util.Arrays;

public class BinarySearch {

    public static void main(String[] args) {

        // binary search will return index number if the element is present in the array
        // if the element is not in the array, it will return possible element position with negative sign
        // you need to sort the array before you apply binary search
        // it gives the possible for with -(negative sign front of it)

        int [] studentNumber = {100,10,15,20,30,35,50,-23};

        System.out.println(Arrays.toString(studentNumber)); // [100, 10, 15, 20, 30, 35, 50, -23]
        Arrays.sort(studentNumber);
        System.out.println(Arrays.toString(studentNumber)); // [-23, 10, 15, 20, 30, 35, 50, 100]

        System.out.println(Arrays.binarySearch(studentNumber, 35)); // 5 --> studentNumber's index number

        System.out.println(Arrays.binarySearch(studentNumber, 25)); // -5.element not the index number(start form 1 to count)

        System.out.println(Arrays.binarySearch(studentNumber, 150)); // -9
        System.out.println(Arrays.binarySearch(studentNumber, 111)); // -9
        System.out.println(Arrays.binarySearch(studentNumber, 49)); // -7


        String str = "Java";
        System.out.println(str.indexOf("a")); // 1
    }
}
