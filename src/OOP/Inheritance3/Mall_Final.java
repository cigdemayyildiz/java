package OOP.Inheritance3;

public class Mall_Final {

    public static void main(String[] args) {

        // classes, instance variable, methods can be final
        // if a method is final method, you cannot override that final method but you can overload it
        // if a variable is a final variable;
        //                                   you have to initialize it,
        //                                   you cannot reassign new value
        //                                   you should use capital letter for variable name
        // if a method is a final method;    you cannot override it
        // if a class is a final class;      you cannot extend final class


        Shirt shirt = new Shirt("L", 30);

        System.out.println(shirt.size);
        System.out.println(shirt.price);
        // shirt.COLOR = "Red"; --> you cannot reassign value for final variable

        TShirt tShirt = new TShirt();
        // tShirt.COLOR = "Black"; --> you cannot reassign value for final variable

        tShirt.color = "Orange";
        System.out.println(tShirt.color); // bu color TShirt sinifindan gelen

        TShirt tShirt1 = new TShirt();
        System.out.println(tShirt1.COLOR); // bu COLOR Shirt sinifindan geliyor

        System.out.println(tShirt1.color); // tShirt1 icin color tanimlamadigimiz icin null

    }

}
