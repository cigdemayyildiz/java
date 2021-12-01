package AccessModifiers;

public class AnimalTest {

    public static void main(String[] args) {

        Animal a = new Animal();

        a.name = "Bob";
        a.age = 8;
        a.gender = "F";

        a.run();
        a.swim();
        a.sleep();


    }

}
