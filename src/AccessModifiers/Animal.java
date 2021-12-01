package AccessModifiers;

public class Animal {

    /*
    public --> anywhere in the project
    private --> only in the same class
    protected --> same package and sub-classes
    default --> only in the same package
    there is no key word as 'default', if you don't specify access modifier it is default.
     */

    public String name;
    private String color;
    protected String gender;
    int age;

    public Animal() {
    }

    public Animal(String name, String gender) {
        this.name = name;
        this.gender = gender;
    }

    public void sleep(){
        System.out.println(name+" is sleeping");
    }

    private void eat(){
        System.out.println(name+" is eating");
    }

    protected void run(){
        System.out.println(name+" is running");
    }

    void swim(){
        System.out.println(name+" is swimming");
    }

    public static void main(String[] args) {

        Animal a = new Animal();
        a.name = "Max";
        a.color = "White";
        a.eat();

    }
}
