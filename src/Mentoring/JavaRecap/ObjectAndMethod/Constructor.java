package Mentoring.JavaRecap.ObjectAndMethod;

public class Constructor {

    // Possible Interview Question
    // What is Constructor and what do you do with it?
    // Constructor is a way of initializing instance variables/field. We have specific features fo the constructor like:
    //      It must have same name of the class
    //      It doesn't have return type
    //      Again we need it to initialize our instance variable
    // What is the difference between constructor and method?
    // Method has return type, may or may not have same or different reference name with the class name
    // Can you make the constructor private?
    // Yes we can make it private for the singleton pattern design(singleton is a special class that don't let you
    // create an object) If you make it private you cannot initialize it outside from class because you cannot reach it
    // out of the class
    // What is the difference between this, this(), super, super()?
    // this --> is a keyword to call the variables or methods which belong to the SAME CLASS
    // this(); --> is a method to call the constructor which belong to the same class
    //  ** this(); method must be at the first line of the chaining constructor
    // super --> is a keyword to call the variables or methods which belong to the PARENT CLASS
    // super(); --> is a method to call the constructor which belong to the PARENT CLASS
    //  ** super(); must be at the first line of the chaining constructor of parent
    // super(); goes close one
}
