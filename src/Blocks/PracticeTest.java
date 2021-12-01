package Blocks;

public class PracticeTest {

    public static void main(String[] args) {

        Practice obj1 = new Practice();

        Practice obj2 = new Practice();

        Practice obj3 = new Practice();

        Practice obj4 = new Practice();

        System.out.println(obj1.number);
        System.out.println(obj2.number);
        System.out.println(obj3.number);
        System.out.println(obj4.number);
        obj1.number = 99;
        System.out.println(obj1.number);
        System.out.println(obj2.number);
        System.out.println(obj3.number);
        System.out.println(obj4.number);

        System.out.println(obj1.id);


    }
}
