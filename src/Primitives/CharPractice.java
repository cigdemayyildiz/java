package Primitives;

public class CharPractice {

    public static void main(String[] args) {

        char firstLetter = 'A'; // value for a char data type needs to be in the single quotation mark ('A')

        System.out.println(firstLetter);

        char secondLetter = '6';
        System.out.println(secondLetter);

        char thirdLetter = '^'; // caret sign
        System.out.println(thirdLetter);

        char forthLetter = 66; // 66 --> B  ASCII table
        System.out.println(forthLetter);

        char fifthLetter = 65518;
        System.out.println(fifthLetter); // ￮

        double dbl = '?'; // single quotation mark always marks to ASCII table
        System.out.println(dbl); // 63.0 if you assign a symbol/character from ASCII table, it will print the number/value for it.

        int chr = 'C';
        System.out.println(chr); // 67

        int c = 'C', i = 'I', g = 'G', d = 'D', e = 'E', m = 'M';
        System.out.println(""+c+" "+i+" "+g+" "+d+" "+e+" "+m); // 67 73 71 68 69 77
        System.out.println(c+i+g+d+e+m); // 425

    }
}
