package Object;

public class Animal { // Animal class a child class of Object class

    String name; // it is default if you add protect before String name --> access modifier
    int age; // you can make default or public or protect if you want to change its accessibility
    double weight;
    int legNumber;
    String color;
    double energy;

    public void run (String destination) {
        // public --> access modifier
        // void --> return type
        // run  --> name of the method
        // (String destination) --> parameter(s)
        // {} --> body creaters

        energy-=10;
        System.out.println(name+" is running to "+destination+".");

    }

    public void sleep () {
        energy=100;
        System.out.println(name+" is sleeping.");
    }

    // create 'printInfo() method to print out all information about the animal'

    public void printInfo () {

        System.out.println("Animal name is "+name);
        System.out.println("Animal age is "+age);
        System.out.println("Animal weight is "+weight);
        System.out.println("Animal leg number "+legNumber);
        System.out.println("Animal's energy is "+energy);
    }

    // If you want to change business logic in equals method in object class for our current object we can override
    // the equals method.
    // We need to say same animal if weight, name and age are same
    public boolean equals(Animal cat, Animal dog){
        boolean isAnimalSame = cat.age == dog.age && cat.name.equals(dog.name) && cat.weight==dog.weight;
        return isAnimalSame;
    }




    /*
    --instance Variables--
    instance variables are in the class but out of other blocks / scope / methods
    instance variables are belong to object. they are in the class but out of blocks
    instance variables can have access modifiers (public, protected, private, default)
    instance variables will have default values if you don't initialize
    instance variables take default values if they are not initialized

    Objects can have variables -instance variables- to define their features

    --local variables--
    they are inside of block
    local variables cannot take access modifiers
    local variables need to be initialized
    local variables are not reachable out of block

    Method Signature is name of the method and parameters

    public void printInfo(int number){  // int number is a parameter
        // code
    }

    */
    // Scanner input = new Scanner(System.in);
    // Scanner objesi olusturmak istiyorsan Scanner class kullanman gerekir.
    // Random number = new Random();
    // Random objesi olusturmak icin Random class kullanmalisin
    // String str = new String();
    // String objesi olusturmak icin String class kullanmalisin.
    // if start capital letter it means it is a class
    // methods start lower case and methods are in the classes exp: String class has a lot of methods

    // class isimleri her zaman buyuk harfle baslar

    // class is a blueprint of object --> blueprint - gen, genetik
    // class is building block

    // class Car {} --> it is way to create a class
    // public class {} --> public means everybody can access this class
}


