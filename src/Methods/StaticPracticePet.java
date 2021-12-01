package Methods;

public class StaticPracticePet {

    /*
    STATIC key word

    - static keyword can be used for methods and instance variables
    - static keyword makes methods and variables belong to that class
    - each object will be sharing static variables and methods
    - local variables cannot be static
    - static methods can be called without objects
    - inside of a static method only static methods can be called without object
    - inside of non-static method both(static and non-static) methods can be called without object.
    - return type of the method should be right before the name of the method as a syntax rule

  -method signature
    --> int age(){} --> it will work
    --> static int age(){} --> it will work
    --> int static age(){} --> it won't work
     */

    String name;
    String color;
    int age;
    static int foodAmount = 20; // eger bu instance variable non-static olursa o zaman eat methodu calistirildiginda
    // foodAmount her kedi icin ayri ayri bir pound azalmayacak cumku
    // each object will be sharing static variables and methods, eger non-static olursa paylasamayacak objeler bu variable i
    // static int foodAmount = 20; basindaki statigi kaldirdiginda foodAmount u calistirdiginda iki kedi birden yemek yese
    // bile bir birim azalacak iki birim azalmayacak

    public void eat(){
        foodAmount -= 1; // kediler her yemek yediklerinde bir pound foodAmount azalacak
        System.out.println("Leftover food amount is: "+ foodAmount);
    }

    public static void run(){
        // static int a = 23; // bu sekilde local bir variable in basina static koyarak iki kirisik parantez
        // arasindayken (localken) onu static yapamazsin cunku local variables cannot be static
        //System.out.println(name+" is running."); // eger run method static olursa o zaman name variable i non-static
        // oldugu icin onu sout icinde bu sekilde kullanamazsin
        System.out.println("Cat is running");
    }

    public static void main(String[] args) {

        StaticPracticePet cat = new StaticPracticePet();
        cat.name = "Felix";
        cat.color = "White";
        cat.age = 3;
        // eger sout ile print etmek istiyorsam hepsini tek tek yazmak zorundayim
        // method olusturarak da print edebilirim
        cat.eat(); // Leftover food amount is: 19

        cat.run(); // eger ayni class daysan bu uc sekilde cagirabilirsin
        run();
        StaticPracticePet.run();


        StaticPracticePet cat1 = new StaticPracticePet();
        cat1.name = "Moorzik";
        cat1.color = "Black";
        cat1.age = 4;

        cat1.eat(); // Leftover food amount is: 18
        cat1.run();
    }
}
