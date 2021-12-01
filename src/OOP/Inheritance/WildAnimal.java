package OOP.Inheritance;

public class WildAnimal extends Animal{

    String name = "Croc";
    String color;
    int age;

    @Override // you don't have to put this information but you can
    public void sleep(){ // Overriding method from parent class
        System.out.println("Wild animal is sleeping");
    }


    public void eat(){
        System.out.println("Wild animal is eating");
    }

    Animal run(){
        System.out.println("Wild animal is running");

        return new Animal(); // it's returning an Animal object
    }


}
