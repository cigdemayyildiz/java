package MAP;

import java.util.HashMap;
import java.util.Random;

public class Employee {

    String name;
    String city;
    int age;
    long id;

    public Employee(String name, String city, int age) {
        this.name = name;
        this.city = city;
        this.age = age;
        this.id = generateId();
    }

    public int generateId() {
        Random random = new Random();
        int newId = 0;
        int digit;
        for (int i = 0; i < 6; i++) {
            digit = random.nextInt(10);
            newId+=digit;
            newId*=10;
        }
        return newId;
    }

    public static void printNames(HashMap<Long, Employee> map){
        for (Employee e : map.values()){
            System.out.println(e.name);
        }
    }

    public static void printId(HashMap<Long, Employee> map){
        System.out.println(map.keySet());
    }


}
