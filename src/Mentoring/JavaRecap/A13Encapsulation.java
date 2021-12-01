package Mentoring.JavaRecap;

public class A13Encapsulation {

    // Possible interview question
    // What is Encapsulation?
    // Encapsulation is the way of restriction the data from the users or classes.
    // in the other words: limiting the users, classes to access the data
    // in the other other words: it is hiding the data from the users, classes..etc
    // Why do you need Encapsulation?
    // If Encapsulation is limiting the users how come still can use set and get?
    // How can you access data from Encapsulation?
    // You can access the data by using CONSTRUCTOR which initialize the instance variables
    // You can access the data by using GETTER and SETTER

    private String name = "Ahmet";
    private String secondName = "Mehmet";
    private int age = 12;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSecondName() {
        return secondName;
    }

    public void setSecondName(String secondName) {
        this.secondName = secondName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
