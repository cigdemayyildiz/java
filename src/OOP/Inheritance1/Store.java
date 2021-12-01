package OOP.Inheritance1;

public class Store {

    public static void main(String[] args) {

        Flower flower = new Flower("Lilly","Violet",8);

        Rose rose = new Rose();
        System.out.println(flower.color);
        System.out.println(rose.color);

        Rose rose1 = new Rose("Pink");
        System.out.println(rose1.color);
        System.out.println(rose.color);
        System.out.println(flower.color);

        Tulip tulip = new Tulip();
        System.out.println(tulip.color);
        System.out.println(tulip.name);

        tulip.color = "Green";
        System.out.println(tulip.color);

        Flower flower1 = new Flower();
        System.out.println(flower1.color);

        Tulip tulip1 = new Tulip();
        System.out.println(tulip1.color);

        Tulip tulip2 = new Tulip("tulip2","black",3.4);
        System.out.println(tulip2.name);
        System.out.println(tulip2.color);
        System.out.println(tulip2.height);


    }
}
