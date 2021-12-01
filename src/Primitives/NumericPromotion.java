package Primitives;

public class NumericPromotion {

    public static void main(String[] args) {

        byte b1 = 112;

        short sh1 = 3;

        // byte sum1 = b1 + sh1; --> b1 + sh1; it will not compile bc of the numeric promotion

        int sum1 = b1 + sh1; // java promotes smaller data types which are byte and short to int data type
        System.out.println(sum1);

        float fl1 = 2.3f;
        double db1 = 3.4;

        // float sum2 = fl1 + db1; --> compile time error you need to storage in a double data type variable

        System.out.println(fl1+db1);
        double sum2 = fl1+db1;
        System.out.println(sum2);

        // int product1 = sum1 * sum2; --> result is a decimal number that's why you cannot store it in an int data type
        double product1 = sum1 * sum2; // because you have a double value in your values
        System.out.println(product1);

        int i1 = 23;
        double db2 = i1; // you can store an int data type in a double data type

        // int i2 = db2;  you can not store a double data type in aa int data type

        // long l1 = db2; data type doesn't only mean capacity, you cannot store double type of value in a long data type


    }
}
