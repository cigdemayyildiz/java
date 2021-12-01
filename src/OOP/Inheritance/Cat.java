package OOP.Inheritance;

public class Cat extends DomesticAnimal{

    @Override
    public Integer play() {
        System.out.println("Cat is playing");
        return 3;
    }
}
