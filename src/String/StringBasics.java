package String;

public class StringBasics {

    public static void main(String[] args) {

        // String is a class
        // String has functions (methods, behavior)
        // Primitive data types don't have methods(functions, behavior)

        String text = "School";
        System.out.println(text); // School
        String name = new String(); // String object
        System.out.println(name); // henuz name e herhangi bir deger atamadigim icin bir sey print etmeyecek
        name = "Cigdem"; // sonradan da deger atayabilirsin
        System.out.println(name); // Cigdem
        String name1 = new String("John"); // atayacagin degeri parantez icine de yazabilirsin
        System.out.println(name1); // John

        text = text + " is Techtorial";
        System.out.println(text); // School is Techtorial.
        text += " Academy."; // you can add word with another word.
        System.out.println(text); // School is Techtorial Academy.
        // text -= "Academy"; --> compile time error you cannot use -, *, / or % with String.

        // placing one String before the other String
        // and combining them together is called String concatenation

        String word = name + text;
        System.out.println(word); // CigdemSchool is Techtorial Academy.
        System.out.println(word + "5"); // CigdemSchool is Techtorial Academy.5
        System.out.println(word); // CigdemSchool is Techtorial Academy.

        name = name + text;
        name += text;
        System.out.println(name); // CigdemSchool is Techtorial Academy.School is Techtorial Academy.

        String str = "Java";
        String str1 = "Selenium";
        String result = str + " " + str1;
        System.out.println(result); // Java Selenium
        System.out.println(str1 + " is next"); // Selenium is next
        System.out.println(str + " is first"); // Java is first
        System.out.println(result + str + str1); // Java SeleniumJavaSelenium

        str = str+5+6;
        System.out.println(str); // Java56

        str1 = str1+"5"+"6";
        System.out.println(str1); // Selenium56

        result = 5+6+result;
        System.out.println(result); // 11Java Selenium

        str = "Java";
        str = str+5*6; // islem onceligi oldugu icin String ile baslasa bile once carpma islemi sonra toplama islemini yapiyor
        System.out.println(str); // Java30

        System.out.println(str+15/3); // Java305

        str = "Java";
        str = str+5*6+2+5;
        System.out.println(str); // Java3025

        str = "Java";
        str = str+5+2*6;
        System.out.println(str); // Java512 --> first multiplication

        str = "Java";
        str.concat(" is cool");
        System.out.println(str); // Java print edecek, bir ust satirdaki concatenation i reassign etmedigim icin kayda almayacak

        str = str.concat(" is very easy."); // reassign
        System.out.println(str); // Java is very easy.
        str = str.toUpperCase(); // reassign
        System.out.println(str); // JAVA IS VERY EASY.
    }
}
