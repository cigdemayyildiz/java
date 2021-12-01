package Constructor;

public class Employee {

    /*
    Constructor
    - you need constructor to be able to create object
    - you need constructor to be able to initialize instance variables
    ways to initialize instance variables;
    1- give a default value
    2- create an object and initialize
    3- with the help of method
    4- with the help of constructor
    constructor syntax
    - constructor has to be have same name with the class name
    - constructor can NOT be static, synchronized or abstract
    - constructor can NOT have a return type (void, primitive, String, Object)
    - constructor has access modifier (public, protected, default, private)
     */

    String name;
    int age;
    int employeeId;
    String gender;
    String companyName = "Techtorial"; // default initialize (1st way to initialize variables)

    public int setEmployeeId(int id){ // create a method (3rd way to initialize variables)
        employeeId = id;
        return employeeId;
    }

    public void info() {
        System.out.println("Name is: "+name+"\nAge is: "+age+"\nEmployee ID: "+employeeId+"\nGender is: "+gender+"\nCompany name is: "+companyName);
    }

    public Employee(){ // create a constructor (4th way to initialize variables)
    // constructor i method olusturmak icin olusturuyoruz ve bir tane bos default olmasi acisindan olusturuyoruz basta sonra digerlerini olustuyoruz.
    }
    public Employee(String newGender){ // you can create more than one constructor with same name but different parameter
        gender = newGender;
    }
}
