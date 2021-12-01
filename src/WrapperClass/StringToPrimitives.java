package WrapperClass;

public class StringToPrimitives {

    public static void main(String[] args) {

        /*
        To store them
        To be able to convert String to primitive data type, we need to use the method which starting with the parse.
        This method will take the parameter as an String value of primitive.
        We can not convert the Character String to primitive data type.
         */

        String str1 = "123";

        // int i = str1;

        int i = Integer.parseInt(str1); // String i parse methodu ile primitive data sekline ceviriyoruz
        System.out.println(i+2); // 125 --> String icindeki degeri integer cinsine cevirdik

        double d = Double.parseDouble(str1);
        System.out.println(d*2); // 246.0

        long l = Long.parseLong(str1);
        System.out.println(l); // 123

        String str2 = "true";

        boolean b = Boolean.parseBoolean(str2);
        System.out.println(b); // true

        boolean b1 = Boolean.parseBoolean(str1);
        System.out.println(b1); // false

        boolean b2 = Boolean.parseBoolean("false");
        System.out.println(b2); // false

        String str3 = "A";
        // Character.parseCharacter(str3) // String cannot be convert to char, there is no parse method for Character

        int n = 8;
        System.out.println(n+2); // 10 --> 8 ile 2 yi topluyor cunku 8 de integer 2 de
        System.out.println(Integer.toString(n)+2); // 82 --> burada 8 i String olarak goruyor ve yanina islem String
        // ile basladigi icin yanindakini de String olarak algilayip ekliyor.

        double db = 2.5;
        System.out.println(db + 2); // 4.5
        System.out.println(Double.toString(db)+2); // 2.52
    }
}
