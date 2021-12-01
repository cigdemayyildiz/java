package OOP.Polymorphism;

public class ATM {

         /*
        to be able to have polymorphism, you need to have parent-child relation

        in siblings you can not have polymorphic relation

        1- Reference and data type of the object can be the same
        HashSet<> set1 = new HashSet<>();

        2- Reference can be interface
        Set<> set2 = new HashSet<>();

        3- Reference can be parent(super)
        Vehicle car = new Car();

        Dynamic Polymorphism: When you override method, Java decides which method to call at run time.
        Static Polymorphism: When you overload method, Java determines which method to call at compile time.

         */

    public void deposit(){
        System.out.println("You are depositing from the ATM");
    }

    public void withdraw(){
        System.out.println("You can withdraw of 3K from ATM");
    }

    public void balance(){
        System.out.println("You're showing your balance from ATM");
    }
}
