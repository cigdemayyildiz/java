package OOP.Inheritance;

public class Animal {


             /*
                you can have single level Inheritance
                you can have multi level of Inheritance
                you can have multiple Inheritance(extends more than one level)
                 - you cannot inherit from more than one parent to the same child
             */

    /*
                Method Overriding
        - method overriding has to happen in parent-child relationship
        - access modifiers have to be same or more accessible (if it's public it can be default, but it cannot be private)
        - return type has to be same or co-variant of the types (if it's int it can be int, but it cannot be long, short, byte)
          (but if return type is an object from parent class, child class can be same level object or bottom level object)
          when you change the implementation of the method in a child class(es) by keeping same name and parameters,
          it is called 'Method Overriding'.


          Method Overriding -vs- Method Overriding

          - overloading happens in the same classes, overriding can happen in parent-child relationship
          - overloading keeps the same name of the methods but changing the parameters
          - access modifiers and return types don't effect method overloading, but it does for overriding
     */


    String name = "Hippo", color;
    int age;

    public void sleep(){
        System.out.println("Animal is sleeping");
    }

    public void eat(){
        System.out.println("Animal is eating");
    }

}
