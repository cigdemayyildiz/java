package OOP.Abstraction;

public abstract class Student {

    /*
        ============ABSTRACTION============

    the purpose of 'abstraction' is to reduce complexity and increase efficiency.
    two ways to achieve abstraction which are by creating:

    - Abstract Classes
    - Interfaces

    ------------Abstract Classes ----------------:
    - Abstract class defines the method but implementation of the method will be in child class based on the need of
       development
    - must be created by using 'Abstract' keyword
    - methods should be defined with 'Abstract' keyword and first extending class(first child class)
      should implement the abstract methods
      *that regular child class is called 'Concrete' class
    - Abstract classes can be extended by Abstract classes and non-abstract classes
    - Abstract class can have abstractand non-abstract methods
    - Can not define method body for abstract methods
    - Abstract methods can not be private, static or final
     */

    String name;
    int age;

    // constructor olusturamazsin
    // bu siniftan object olusturamazsin

    public void study(){
        System.out.println("Student is studying");
    }

    public abstract void attend(); // govdesiz olusturuyoruz cunku abstract siniflardan method olusturulamadigi icin
    // implementationlari bu sinifa en yakin olan child class da yapiyoruz.

    public abstract void sleep();

    public abstract int studyTime(int hour);

    public void smile(){
        System.out.println("Student is smiling");
    }
}
