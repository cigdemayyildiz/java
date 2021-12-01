package Mentoring.JavaRecap.ObjectAndMethod;

public class GarbageCollection {

    // Possible Interview Question:
    // What is Garbage Collector and where it is coming from?
    // Garbage collector is the way of cleaning unused or useless data in the class.
    // It is coming from System class
    // System.gc();
    // How can you prove that gc is working?
    // You need to override the finalize(); method from the object to see that gc is working
    // How can you make the object garbage?
    // you can make the object by assigning Null value
    // int a = 5; int b = 6; int c = 7;  a=b; where is the 5 --> it becomes the garbage
    // Can you call gc many times? (OCA)
    // You can only call 1 time
    // System.gc(); it is automatically doing it already, you don't need to call it but sometimes we want to see
    // if useless data is delete or not.
}
