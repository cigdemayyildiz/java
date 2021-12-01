package String;

import java.util.Locale;

public class Methods {

    public static void main(String[] args) {

        // .concat()
        // it will take String value and add it to the initial String that you have
        String city = "Chicago";
        city.concat(" is very cold.");
        System.out.println(city); // Chicago --> String is immutable which means original value will not change unless you reassign it or create a new String variable.

        String newCity = city.concat(" is a very beautiful city.");
        System.out.println(city); // Chicago
        System.out.println(newCity); // Chicago is a very beautiful city.


        // .length(); --> it returns int
        // it will give you the count of letters/characters in given String
        int length = newCity.length();
        System.out.println(length); // 33

        System.out.println(newCity.length()); // 33

        String word = "Java";
        int length1 = word.length();
        System.out.println(length1); // 4


        // .charAt();
        // it will take an index number and return a character from that index/position
        String str = "Java";
        char ch = str.charAt(0);
        System.out.println(ch); // J
        char ch1 = str.charAt(1);
        System.out.println(ch1); // a
        char ch2 = str.charAt(2);
        System.out.println(ch2); // v
        char ch3 = str.charAt(3);
        System.out.println(ch3); // a
        // char ch4 = str.charAt(4); -->  exception (error) (IndexOutOfBoundException) because there is no 4th index

        System.out.println(city.charAt(0)); // C --> from Chicago
        System.out.println(city.charAt(3)); // c

        System.out.println("It is almost time to go home".charAt(6)); // a


        // .indexOf(); --> it returns int
        // it will take parameter as char or char sequence and it will return index number for it
        String name = "Diana";
        int index = name.indexOf('D');
        int index2 = name.indexOf("D");
        int index3 = name.indexOf("Di");

        System.out.println(index); // 0(zero)
        System.out.println(name.indexOf('D')); // 0(zero)
        System.out.println(index2); // 0(zero)
        System.out.println(name.indexOf("D")); // 0(zero)
        System.out.println(index3); // 0(zero)
        System.out.println(name.indexOf("Di")); // 0(zero) if you have more than one character in your indexOf method
        // it will take only first one's index number

        System.out.println(name.indexOf("ana")); // 2 --> D=0, i=1, a=2, n=3, a=4
        System.out.println(name.indexOf("anan")); // -1 --> there is no matching char sequence
        System.out.println(name.indexOf("tina")); // -1 --> there is no matching char sequence
        System.out.println(name.indexOf("k")); // -1 --> hata degil, bundan sonra yazdigin kodlari ekrana yazdirabilirsin
        // char da exception gordugun zaman o satirdan sonra yazdigin kodlari goremezsin, programin calismaz
        System.out.println("this is saturday morning");

        name.concat(" Bejan"); // you cannot print this till you reassign it
        System.out.println(name.concat(" Beijan")); // Diana Bejan
        System.out.println(name); // Diana

        name = name.concat(" Bejan"); // reassignment

        System.out.println(name.indexOf("a", 3)); // 4
        // virgulden sonraki kisim aramaya nereden baslayacagini belirlemek icin

        System.out.println(name.indexOf("B", name.indexOf(" "))); // 6
        // virgulden sonraki kisimda anlatilan bosluktan sonra B yi aramaya basla
        // virgulden sonraki kisim bir sayi verecek ve o sayidan sonrasinda B aranmaya baslanacak

        name = "Arzu Beril Sen";
        System.out.println(name.indexOf("S", name.indexOf(" "))); // 11
        // bosluktan sonraki "S" harfinin indexini bul
        System.out.println(name.indexOf("e", 7)); // 12
        // index numarasi 7 olan characterden saymaya basla ve "e" harfini bul
        System.out.println(name.indexOf("e", name.indexOf(" ")+name.indexOf(" "))); // 12
        System.out.println(name.indexOf("e", name.indexOf(" ")+3)); // 12

        name.indexOf(2); // values that you're giving inside of the method parentheses are called parameters
                         // some methods take no parameters, some of them take single parameter or multiple parameters
        name.length();   // no parameters
        name.charAt(3);  // single parameter
        name.indexOf("e",4); // you can pass either one or two parameters by separating with comma


        // .toUpperCase();
        // it will convert all String to upper case
        String string = "Selenium";
        string = string.toUpperCase();
        System.out.println(string); // SELENIUM


        // .toLowerCase();
        // it will convert all String to lower case
        string.toLowerCase();
        System.out.println(string); // SELENIUM --> bir ust satirdaki islemi kayda almadi reassign edilmedigi icin
        System.out.println(string.toLowerCase()); // selenium --> sout icinde metodu yazinca ayrica disarda reassign etmeye gerek yok
        System.out.println(string); // SELENIUM --> bu ilk olusturuldugu yerden ya da nerede reassign edildiyse
                                    // oradan buyuk hafle geliyor. sout icinde yapilan degisiklik reassignment sayilmiyor
        System.out.println(string.toUpperCase()); // SELENIUM

        string = string.toLowerCase(); // selenium
        String a = ""+string.charAt(0); // basina double quation koyarsan String e cevirmis gibi oluyorsun cunku String ile basliyor
        a = a.toUpperCase(); // S --> a = String'in(selenium) birinci karakteri/harfi, String'in sadece birinci harfi buyuk harf yapildi
        System.out.println(a.concat(string)); // Sselenium

        String b = (""+string.charAt(0)).toLowerCase(); // eger toLowerCase den oncesini paranteze alirsan o zaman
                                        // parantez icine aldigin kisim String oldugu icin metod uygulayabilirsin
        System.out.println(b); // s


        // .startsWith();  --> returns boolean
        // it will take String parameter and if the provided String matches with the beginning of the value,
        // it will return true, otherwise false.
        String word1 = "do whatever it takes";
        System.out.println(word1.startsWith("do")); // true
        boolean result = word1.startsWith("what"); // store etmek istersen boolean a store etmen gerekir
        System.out.println(result); // false
        System.out.println(word1.startsWith("do  ")); // false --> iki bosluk var do dan sonra

        System.out.println(word1.startsWith("do whatever it takes")); // true


        // .endsWith(); --> returns boolean
        word1.endsWith("s");
        System.out.println(word1.endsWith("s")); // true
        boolean result1 = word1.endsWith("do");
        System.out.println(result1); // false
        System.out.println(word1.endsWith("takes")); // true
        System.out.println(word1.endsWith("takes.")); // false
        System.out.println(word1.endsWith("take")); // false


        // .contains(); --> returns boolean
        // it will take String parameter and if the value is in the given String it will return true otherwise false
        String text = "Techtorial";
        boolean result2 = text.contains("Tech");
        System.out.println(result2); // true
        System.out.println(text.contains("ch")); // true
        System.out.println(text.contains("hc")); // false
        System.out.println(text.contains("t")); // true

        text = text + word1;

        System.out.println(text); // Techtorialdo whatever it takes
        System.out.println(text.contains("do")); // true
        System.out.println(text.contains("for")); // false
        System.out.println(text.contains("aldo")); // true
        System.out.println(text.contains("i")); // true
        System.out.println(text.contains("Techtorial do whatever it takes")); // false


        // .equals(); --> returns boolean
        // it will compare String values with each other, if they are exactly in some order or not
        String c = "John";
        String d = "John";
        String e = "JOHN";

        boolean result4 = c.equals(d);
        System.out.println(result4); // true
        System.out.println(c.equals("John")); // true
        System.out.println(c.equals(e)); // false


        // .equalsIgnoreCase(); --> returns boolean
        boolean resul5 = c.equalsIgnoreCase(d);
        System.out.println(resul5); // true

        System.out.println("Java is".equalsIgnoreCase("JAVA is")); // true
        System.out.println("Java is cool".equalsIgnoreCase("Java is")); // false


        // .replace();
        // it will replace original value with new one
        String str1 = "Java is cool";
        str1 = str1.replace("o", "$");
        System.out.println(str1); // Java is c$$l

        System.out.println(str1.replace("c$$l", "easy")); // Java is easy

        String text1 = "Tava";
        System.out.println(str1.replace("Java", text1)); // Tava is c$$l

        System.out.println("".replace("", "***")); // ***
        System.out.println(str1.replace("***", "???")); // Java is c$$l

        String star = "Star of the day is *";
        System.out.println(star.replace("***", "$$$")); // Star of the day is *
        // star variable inin icinde uc tane star olmadigi icin bir ust satirdaki islemin sonucu direkt star variable i olacak
        System.out.println(star.replace("*", "$$$")); // Star of the day is $$$


        // .trim();
        // it will remove the spaces before and after of the String not between spaces
        String text2 = "    It is Saturday    ";
        System.out.println(text2); //     It is Saturday
        text2 = text2.trim();
        System.out.println(text2); // It is Saturday --> before and after spaces are gone

        String task = "Do whatever it takes";
        System.out.println(task); // Do whatever it takes

        task = task.concat(" to learn Java");
        System.out.println(task); // Do whatever it takes to learn Java

        task = task.toUpperCase();
        System.out.println(task); // DO WHATEVER IT TAKES TO LEARN JAVA

        task = task.replace("JAVA", "JOB");
        System.out.println(task.replace("JAVA", "JOB")); // DO WHATEVER IT TAKES TO LEARN JOB
        System.out.println(task.contains("Chicago")); // false

        task = task.replace("LEARN", "GET");
        System.out.println(task); // DO WHATEVER IT TAKES TO GET JOB


        // .substring(); --> returns String
        // it will return the part of the String

        // T e c h t o r i a l
        // 0 1 2 3 4 5 6 7 8 9   --> index numbers of Techtorial (substring works with index numbers)
        // 1 2 3 4 5 6 7 8 9 10  --> length of Techtorial

        String x = "Techtorial";
        String part1 = x.substring(2); // 2 dahil sonrasini yazdiracak
        // when you pass single index number into the substring method it will take partial text starting from that
        // index and it will include that index's char
        System.out.println(part1); // chtorial

        System.out.println(x.substring(2,4)); // ch --> 2 dahil 4 dahil degil.
        // when you pass beginning and ending index numbers, it will start from beginning index which is included and
        // stop at ending index which is not included

        System.out.println(x.substring(0)); // Techtorial

        // print last three chars from String "I will do it SOON"
        String task2 = "I will do it SOON";
        System.out.println(task2.substring(task2.length()-3)); // OON

        String task3 = "ON";
        System.out.println(task3.substring(task3.length()-3));
        // when your String value doesn't have enough value to take substring, it will throw an exception (StringOutOfBoundException)

        System.out.println("This is all about String methods"); // you cannot see this print because of the exception on the above line
    }
}
