package Array;

import java.util.Arrays;

public class MultidimensionalArray3 {

    public static void main(String[] args) {

        int [] ids = {3,4,2,34,56,7};

        int [][] multiDem= {{60123, 60124, 60125}, {9123, 9124, 9125}, {5123, 5124, 5125, 5126}};

        // multiDem[2][4] = 5234; --> ArrayIndexOutOfBoundsException since there is no 4th index it throws an expection
        System.out.println(Arrays.deepToString(multiDem));
        // [[60123, 60124, 60125], [9123, 9124, 9125], [5123, 5124, 5125, 5126]]

        int [][] multiDim = new int[1][5]; // bu yontemle yazdiginda kullanacagin alanlari onceden belirlemen gerekiyor
        System.out.println(Arrays.deepToString(multiDim)); // [[0, 0, 0, 0, 0]]

    }
}
