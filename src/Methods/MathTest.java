package Methods;

public class MathTest {

    public static void main(String[] args) {

        Math total = new Math();

        total.sum(2,3);

        System.out.println();

        total.sum(5,25);

        System.out.println();

        total.operation("multiply",4,2);
        total.operation("add",4,6);
        total.operation("final",3,4);

        System.out.println();

        int x = total.sum1(1,3,6);
        System.out.println(x+25);
        // int w = total.sum(2,3)
        // void return type does not return any value,
        // that's why you cannot store the out come into any variable
    }
}
