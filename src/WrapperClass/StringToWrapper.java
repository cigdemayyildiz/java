package WrapperClass;

public class StringToWrapper {

    public static void main(String[] args) {

        /*
        To store them
        To be able to convert String to primitive wrapper classes, we need to use the method called valueOf.
        This method will take the parameter as an String value of wrapper object.
        We can not convert the Character String to wrapper object type.
         */

        String str = "54321";
        Integer in1 = Integer.valueOf(str); // valueOf methodu String tipindeki bir value yu object sekline ceviriyor
        System.out.println(in1); // 54321

        String str2 = "5.9";
        Float fl1 = Float.valueOf(str2);
        System.out.println(fl1); // 5.9
        Double db1 = Double.valueOf(str2);
        System.out.println(db1); // 5.9

        String str3 = "false";
        Boolean bl1 = Boolean.valueOf(str3);
        System.out.println(bl1); // false
        System.out.println(bl1 == false); // true
        System.out.println(bl1.equals(false)); // true
        System.out.println(bl1.equals(true)); // false

        String str4 = "c";
        // Character ch1 = Character.valueOf(str4); --> compile time error, you cannot convert String value to Character

    }
}
