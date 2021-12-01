package OOP.Interface1;

import java.util.Objects;

public interface Shape {

    /*
        interface keyword to create an interface
        cannot create an object from an interface
        interface methods are public and abstract by default
        methods cannot be private, protected and final
        variables in the interface are public and final

        you can declare default methods
            default isn't the access modifier in that case
        you can override default methods

        you can implement more than one Interfaces
        you must implement methods into the child class when you extended from interface
     */

    public final int SIDE = 5; // you have to give a value, you have to initialize it. it already know this variable is
                             // public and final, we don't have to declare public and final..


    // public abstract void area(){} // --> it cannot take body

    public abstract void area(); // it is public and abstract by default that's why we don't need to declare again

    void area1(); // bu sekilde de yazabiliriz cunku zaten default u public ve abstract

    int perimeter(); // bu da bir method yine access modifier ve abstract oldugunu belirtmedik cunku gerek yok

    Number perimeter1(int side); // Number class Integer, Double, Long, Byte, Short ve Float in parent class i
                        // Bu methodu child class da implement ederken Integer, Short vs kullanabiliriz cunku onlar
                        // Number class in child classlari yani covariant burada isleme giriyor. Primitive lerin
                        // covariantlari yok.

    Double perimeter2();

    default void info() { // buradaki default access modifier degil, normal bir method olusturmak icin bunu yazmak
        // zorundayiz, cunku normalde default public oldugu icin normal bir method olusturmak icin default demek gerek
        System.out.println("I am info about Shape Interface");
    }

    default void info(String name){ // overload edebiliyoruz, bunu alt siniflardan birine override da edebiliriz
        System.out.println("This is name of the Shape " + name);
    }

    default void smile(){
        System.out.println("Smiling");
    }
}
