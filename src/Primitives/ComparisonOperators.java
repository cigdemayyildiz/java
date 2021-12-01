package Primitives;

public class ComparisonOperators {

    public static void main(String[] args) {

        // == --> equals

        int a = 3;
        int b = 4;
        int c = 4;

        System.out.println(a==b); // false
        System.out.println(b==c); // true
        System.out.println(a==c); // false
        System.out.println(!(a==b)); // true
        System.out.println(!(b==c)); // false


        // != --> not equals

        System.out.println(a!=b); // true
        System.out.println(c!=b); // false
        System.out.println(!(a!=b)); // false
        System.out.println(!(c!=b)); // true


        // > --> greater than

        System.out.println(a > b); // false
        System.out.println(b > c ); // false


        // < --> less than

        System.out.println(a < b); // true
        System.out.println(a < c); // true
        System.out.println(c < a); // false
        System.out.println(b < c); // false


        // >= --> grater than equal to

        System.out.println(a>=b); // false
        System.out.println(b>=c); // true


        // <= --> less than equal to

        System.out.println(a<=b); // true
        System.out.println(c<=b); // true
        System.out.println(c<=a); // false


    }
}
