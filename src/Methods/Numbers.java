package Methods;

public class Numbers {

    	/*
	What is method in JAVA?
		- Scope of codes with the name and it can create the logic and implement and it will only run when you call it.
	How do we create a method?
		- First Access modifier (we will define if it is going to be static) -> return type -> name of method ->
		parenthesis (we can write parameters) -> curly braces
		if our type is not void we have to return data that we defined.
		Access Modifiers = public, protected
		public -> Accessible from everywhere in framework
		protected -> It is only accessible in same package unless you call from child class
		default -> It is only accessible in same package
		private -> It is only accessible in same class

	Static and Non-Static Methods
		-Static means it belongs to class and has same value for every objects.
		-When we are calling methods from outside of the class, we don't need to create an object. We can call by
		using class name.
		-Non-Static means it changes for every objects.
		-For non-static methods we can only call by creating and object.

		Inside static methods we cannot call non-static method or variables.

		If you are calling non-static method from a static method, you can only call static methods unless
		you create an object in the static method.

		If we are calling static method from a static method (if we are in same class we can call by just name)
		we can just use class name.
	 */

    /*
    SUMMARY
    Access modifier - return typpe -name (Parameter){
    }
    How many access modifier
    4
    **** public - protected - default - private ****
    Static And Non-Static
    ** Static belongs to class
    ** Non-static changes for every object
    Difference in calling static and non static method
    - For non-static we have to create an object
    - For static methods we can use class name or object (At the time which one is more convenient)
    Calling non-static methods or variables from static method
    We have to create an object even we are in same class
    Calling static method from a static method
    1- If we are in same class -> Just method name
    2- If we are in different class -> Class name
    Calling static or non static variables and methods from a non-static method
    1- We are in same class -> you can just call by method or variable name
    2- We are in different class -> If you are calling static use a class name to call
                                    If you are calling a non-static create an object and call
     */

    // Let's write a non-static method to find sum of two integer numbers
    public int findSum(int a, int b){
        return a+b;
    }

    // Let's write a static method to find division of two number
    public static int findDivision(int a, int b){
        return a/b;
    }
    // In the same class differences for static and non-static

    public static void main(String[] args) { // static icinde non-static cagiramazsin
        // main method is a static method so I should only be able to call static methods or variables

        // findSum(4,5);
        // For to call findSum method we need to create an object inside of the static method then we are able to call
        Numbers numbers = new Numbers(); // This object below is a bridge for us to call non-static findSum method
        numbers.findSum(4,5);
        // Can I call findDivision with numbers object?
        // If we are calling the static method in same class we cannot call by using object but we can call when
        // we are outside of the class

        // Since findDivision is a static method and I am in the same class I can call by using name

        findDivision(20,3);
        Numbers.findDivision(30,4);

    }

}
