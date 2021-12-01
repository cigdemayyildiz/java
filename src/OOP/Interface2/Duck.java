package OOP.Interface2;

public class Duck extends Animal implements Flyable, CanSwim{ // Interface2 icindeki Animal Classina Duck i child olarak
    // tanimladik, birden fazla Interface i bir sinifa tanimlayabiliyoruz ama birden fazla parent class i bir sinifin
    // parent i yapamiyoruz

    // you can implement more than one Interface but you must extend only one class by a child class

    @Override
    public void fly() {
        System.out.println("Duck is flying");
    }

    @Override
    public void eat() {
        System.out.println("Duck is eating");
    }

    @Override
    public void sleep() {
        System.out.println("Duck is sleeping");
    }

    @Override
    public void swim() {
        System.out.println("Duck is swimming");
    }

    public void info(){
        System.out.println("Duck info");
    }

}
