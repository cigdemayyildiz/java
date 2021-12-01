package OOP.Inheritance;

public class Zoo {

    public static void main(String[] args) {

        Animal animal = new Animal();
        System.out.println(animal.color); // null

        System.out.println();
        WildAnimal wildAnimal = new WildAnimal();
        System.out.println(wildAnimal.color); // null

        System.out.println();
        Cat cat = new Cat();
        System.out.println(cat.color); // null
        System.out.println();

        animal.color = "brown";
        System.out.println(animal.color); // brown
        System.out.println(cat.color); // null
        Animal animal1 = new Animal();
        System.out.println(animal1.color); // null
        System.out.println(wildAnimal.color); // null

        System.out.println(animal.name); // Hippo
        System.out.println(wildAnimal.name); // Croc
        System.out.println(cat.name); // Hippo

        Lion lion = new Lion();
        System.out.println(lion.name); // Croc

        cat.name = "Tom";
        System.out.println(cat.name); // Tom


        DomesticAnimal domesticAnimal = new DomesticAnimal();
        System.out.println(domesticAnimal.name); // Hippo --> it's coming from Animal(parent) class
        domesticAnimal.name = "Rex";
        System.out.println(domesticAnimal.name); // Rex


        animal.eat(); // Animal is eating
        lion.eat(); // Lion is eating --> Animal class da var olan bir methodu Lion sinifinda override ettigimiz icin bu
        // sinifin artik kendine ait bir methodu var ve bu verileri o methoddan aliyor
        wildAnimal.eat(); // WildAnimal is eating

        lion.run(); // Lion is running
        wildAnimal.run(); // Wild animal is running

        // cat.run(); --> run methodu WildAnimal class da oldugu icin cat sinifi buna ulasamaz

        lion.roar(); // Lion is roaring

        cat.play();
    }
}
