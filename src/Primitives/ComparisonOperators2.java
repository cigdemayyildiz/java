package Primitives;

public class ComparisonOperators2 {

    public static void main(String[] args) {

        // ==, !=, >, <, >=, <= --> any comparison operator will return/gives true or false (boolean)

        int x = 10;
        int y = 10;
        int z = 65;

        boolean result1 = x == y; // true
        System.out.println(result1);

        char ch1 = 'A';
        char ch2 = 65;
        char ch3 = 66;

        boolean result2 = ch1 == ch2;
        System.out.println(result2); // true

        boolean result3 = z == ch2;
        System.out.println(result3); // true

        boolean result4 = z == ch3;
        System.out.println(result4); // false

        boolean result5 = x > y;
        System.out.println(result5); // false

        boolean result6 = x <= y;
        System.out.println(result6); // true

        boolean r7 = result1 == result2; // result1 is true and result2 is true
        System.out.println(r7); // true

        boolean r8 = result1 != result2; // iki boolean i karsilastirirken sadece esit ya da esit degil comparison operatorlerini kullanabilirsin. bir boolen bir digerinden buyuk mu kucuk mu diye karsilastiramazsin.
        System.out.println(r8); // false
    }
}
