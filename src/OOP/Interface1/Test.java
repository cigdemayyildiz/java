package OOP.Interface1;

public class Test {

    public static void main(String[] args) {

        Square square = new Square();
        square.smile();

        System.out.println(square.perimeter1(4));
        System.out.println(square.perimeter());

       //Shape shape = new Shape(){} --> you cannot create object from Interface

        Shape shape = new Square(); // Polymorphism
        // Shape sinifi tipinde shape adinda yeni bir Square object si olusturduk


        System.out.println(shape.SIDE);
        System.out.println(Shape.SIDE);

        System.out.println(square.SIDE);
        System.out.println(Square.SIDE);

        //square.SIDE = 4 --> you cannot reassign final variable

        Triangle triangle = new Triangle();
        triangle.height = 7;
        System.out.println(triangle.height);
        System.out.println(triangle.perimeter1(3));

        triangle.info();
        square.info();
        shape.info();

        triangle.info("abc");
        square.info("bca");
        shape.info("ggg");




    }

}
