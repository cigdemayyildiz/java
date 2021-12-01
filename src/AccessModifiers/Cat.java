package AccessModifiers;

public class Cat extends Animal{


    public Cat(String name, String gender) {
        super(name, gender);
    }

    @Override
    public String toString() {
        return "Cat{" +
                "name='" + name + '\'' +
                ", gender='" + gender + '\'' +
                '}';
    }

    public static void main(String[] args) {

        Animal a = new Animal();
        a.name = "Bobby";
        a.age = 5;
        a.gender = "M";
        a.sleep();
        a.run();
        a.swim();
    }
}
