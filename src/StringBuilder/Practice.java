package StringBuilder;

import AccessModifiers.Animal;
import AccessModifiers.Cat;

import java.util.ArrayList;
import java.util.Arrays;

public class Practice {

    public static void main(String[] args) {

        String test = "Test";
        // String is immutable
        // eger reassign etmezsen ne kadar String methodu kullanirsan kullan en bastaki degeri gorursun

        test.concat(" is coming with Selenium Web Driver");
        System.out.println(test); // Test

        test = test.concat(" is coming with Selenium Web Driver");
        System.out.println(test); // Test is coming with Selenium Web Driver

        test.substring(test.indexOf("S"));
        System.out.println(test); // Test is coming with Selenium Web Driver

        test = test.substring(test.indexOf("S"));

        System.out.println(test); // Selenium Web Driver

        test.concat(" is a testing tool.");
        System.out.println(test); // Selenium Web Driver

        test = test.concat(" is a testing tool.");
        System.out.println(test); // Selenium Web Driver is a testing tool.

        StringBuilder builder = new StringBuilder("Test");
        System.out.println(builder); // Test

        StringBuilder builder1 = new StringBuilder();
        builder1.append(" is necessary"); // is necessary
        System.out.println(builder1);

        StringBuilder builder3 = new StringBuilder();
        builder3.append(builder.append(builder1)); // Test is necessary
        System.out.println(builder3);

        // append();
        builder3.append(3);
        System.out.println(builder3); // Test is necessary3

        // charAt();
        builder.charAt(0);
        System.out.println(builder.charAt(0)); // T

        // indexOf();
        builder3.indexOf("s");
        System.out.println(builder3.indexOf("s")); // 2

        // length();
        builder3.length();
        System.out.println(builder3.length()); // 18

        // last char
        System.out.println(builder3.charAt((builder3.length()-1))); // 3
        System.out.println(builder3.indexOf(""+builder3.charAt(builder3.length()-1))); // 17

        // replace();
        // replace(); methodunun reassing edilmis halini store etmeye gerek duymuyor
        builder3.replace(builder3.indexOf("s"),(builder3.indexOf("s")+1), "*"); // Te*t is necessary3
        System.out.println(builder3);


        // substring();
        String sub = builder3.substring(builder3.indexOf("*")); // bu islem icin String i reassign etmelisin
        // cunku substring methodunun return tipi String, StringBuilder degil
        System.out.println(sub); // *t is necessary3

        builder3.append(sub);
        System.out.println(builder3); // Te*t is necessary3*t is necessary3

        StringBuilder builder2 = new StringBuilder("Interview");

        // reverse();
        builder2.reverse();
        System.out.println(builder2); // hepsini tersten yazdiriyor
        builder2.reverse(); // weivretnI

        // insert();
        builder2.insert(1,"$$$"); // verdigin index numarasina ait field i degistiriyor
        System.out.println(builder2); // I$$$nterview
        int [] nums = {1,2,3};
        builder2.insert(builder2.indexOf("t"), Arrays.toString(nums));
        System.out.println(builder2); // I$$$n[1, 2, 3]terview

        builder2.insert(0, new Cat("Tom", "M"));
        System.out.println(builder2); // Cat{name='Tom', gender='M'}I$$$n[1, 2, 3]terview

        // delete();
        builder2.delete(0,builder2.indexOf("I"));
        System.out.println(builder2); // I$$$n[1, 2, 3]terview

        // deleteCharAt();
        builder2.deleteCharAt(5);
        System.out.println(builder2); // I$$$n1, 2, 3]terview

        int a = builder2.lastIndexOf("e");
        System.out.println(a); // 18

        builder2 = builder2.append("terview");
        System.out.println(builder2); // I$$$n1, 2, 3]terviewterview
        System.out.println(builder2.lastIndexOf("view")); // 23
    }
}
