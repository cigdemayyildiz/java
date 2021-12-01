package Array;

import java.util.Arrays;

public class SortingPractice {

    public static void main(String[] args) {

        // .sort() --> arranges the array from smaller to larger element
        int [] numbers = {45, 5, 6, 47, 57, 8, 12, 0, 30};

        System.out.println(Arrays.toString(numbers)); // [45, 5, 6, 47, 57, 8, 12, 0, 30]
        Arrays.sort(numbers); // sort method will put elements in ascending order(from smaller to larger)
        System.out.println(Arrays.toString(numbers)); // [0, 5, 6, 8, 12, 30, 45, 47, 57]

        String [] colors = {"red", "blue", "green", "yellow", "brown", "orange", "white", "purple", "gray", "pink", "violet", "black", "Aabc", "aABc","12","32"};
        System.out.println(Arrays.toString(colors)); // [red, blue, green, yellow, brown, orange, white, purple, gray, pink, violet, black]
        Arrays.sort(colors);
        System.out.println(Arrays.toString(colors)); // [black, blue, brown, gray, green, orange, pink, purple, red, violet, white, yellow]

        String [] str = {"aAbc".toUpperCase(), "AaBc".toUpperCase()};
        System.out.println(Arrays.toString(str));
        Arrays.sort(str);
        System.out.println(Arrays.toString(str));

        for (int i=0; i<colors.length; i++){
            colors[i] = colors[i].toUpperCase();
        }
        Arrays.sort(colors);
        System.out.println(Arrays.toString(colors));
    }
}
