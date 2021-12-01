package MAP;

import java.util.*;

public class Student {

    public static void main(String[] args) {

        HashMap<String, String> student1 = new HashMap<>();
        student1.put("FirstName", "David");
        student1.put("LastName", "Pena");
        student1.put("City", "Chicago");
        student1.put("Gender","M");
        student1.put("Age", "25");

        HashMap<String, String> student2 = new HashMap<>();
        student2.put("FirstName","Jeremiah");
        student2.put("LastName", "Michaelson");
        student2.put("City", "HighPark");
        student2.put("Gender","M");
        student2.put("Age", "15");

        HashMap<String, String> student3 = new HashMap<>();
        student3.put("FirstName","Michael");
        student3.put("LastName", "White");
        student3.put("City", "Winnetka");
        student3.put("Gender","M");
        student3.put("Age", "35");

        HashMap<String, String> student4 = new HashMap<>();
        student4.put("FirstName","Sarah");
        student4.put("LastName", "Star");
        student4.put("City", "Chicago");
        student4.put("Gender","F");
        student4.put("Age", "29");

        List<HashMap<String, String>> students = new ArrayList();
        students.add(student1);
        students.add(student2);
        students.add(student3);
        students.add(student4);

        //System.out.println(students);

        for (int i = 0; i < students.size(); i++) {
            System.out.println(students.get(i)); // ArrayList
        }
        System.out.println();

        for (int i = 0; i < students.size(); i++) {
            System.out.println(students.get(i).entrySet()); // Set
        }
        System.out.println();

        // if student's age is less than 20, show their name

        for (HashMap<String, String> studen : students){
            int age = Integer.parseInt(studen.get("Age"));
            if (age<20){
                System.out.println(studen.get("FirstName"));
            }
        }

        for (int i = 0; i < students.size(); i++) {
            if (Integer.parseInt(students.get(i).get("Age")) < 20){
                System.out.println(students.get(i).get("FirstName"));
            }
        }

        System.out.println();

        // if student's city is 'Chicago' create an email address as 'name+Chicago@gmail.com'

        for (int i = 0; i < students.size(); i++) {
            if (students.get(i).get("City").equalsIgnoreCase("chicago")){
                System.out.println(students.get(i).get("FirstName").concat("Chicago@gmail.com"));
            }
        }

        System.out.println();

        students.forEach(item -> System.out.println(item));
        System.out.println();
        students.forEach(System.out::println);
    }
}
