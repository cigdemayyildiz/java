package Mentoring.JavaRecap;

public class A03StringAndMethods {

    // String --> String is an object
    // Strings methods -->
    // substring(); --> it takes specific spot from the String
    // indexOf(); --> it returns int the index number
    // length(); --> it returns int the length
    // equals(); --> it returns boolean
    // equalsIgnoreCase(); --> it returns boolean but ignores the case
    // toUpperCase(); --> it returns String
    // toLowerCase(); --> it returns String
    // contains(); --> it returns boolean
    // startsWith(); --> it returns boolean
    // endsWith(); --> it returns boolean
    // charAt(); --> it returns char --> "" to make String
    // replace(); --> it returns String
    // concat(); --> it returns String
    // trim(); --> it returns String without any spaces before and after




    public static void main(String[] args) {
        String example = "Ahmet loves Java";
        example = example.substring(1);
        System.out.println(example); // hmet loves Java
        example = example.substring(1,9);
        System.out.println(example); // m

        int index = example.indexOf('h');
        System.out.println(index); // -1

        int size = example.length();
        System.out.println(size); // 1

        boolean isMatching = example.equals("met love");
        System.out.println(isMatching); // true

        example=example.replace('e','$');
        System.out.println(example); // m$t lov$







    }
}
