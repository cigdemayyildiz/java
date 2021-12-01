package Object;

public class AnimalTest extends Animal { // bunun anlami AnimalTest Animal class in alt sinifi

    public static void main(String[] args) {

        Animal cat = new Animal();

        System.out.println(cat.name); // null

        cat.name = "Tom";
        cat.age = 8;
        cat.color = "Gray";
        cat.legNumber = 4;
        cat.weight = 4.5;

        System.out.println(cat.name); // Bro
        System.out.println(cat.age);
        System.out.println(cat.color);
        System.out.println(cat.legNumber);
        System.out.println(cat.weight);

        // create a dog object and initialize each variable

        Animal dog = new Animal();

        dog.name = "Bob";
        dog.age = 6;
        dog.color = "White";
        dog.legNumber = 4;
        dog.weight = 9.5;

        System.out.println(dog.name);
        System.out.println(dog.age);
        System.out.println(dog.color);
        System.out.println(dog.legNumber);
        System.out.println(dog.weight);

        cat.run("down"); // Tom is running.
        dog.run("up"); // Bob is running.

        cat.sleep(); // Tom is sleeping.
        dog.sleep(); // Bob is sleeping.

        Animal bird = new Animal();

        bird.sleep(); // null is sleeping bc there is no name for bird

        System.out.println();

        cat.printInfo();
        cat.energy=100;
        cat.printInfo();
        cat.run("left");
        cat.printInfo();
        cat.run("right");
        cat.printInfo();
        cat.run("east");
        cat.printInfo();
        cat.sleep();
        cat.printInfo();

        System.out.println("==============");

        bird.energy=100;
        bird.sleep();
        bird.run("down");

        System.out.println(dog.equals(dog,cat)); // false



    }
}
