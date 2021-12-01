package MAP;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.HashMap;

public class EmployeeTest {

    public static void main(String[] args) {

        Employee employee1 = new Employee("John", "Austin", 32);
        Employee employee2 = new Employee("David", "Chicago", 27);
        Employee employee3 = new Employee("Jenny", "New York", 38);
        Employee employee4 = new Employee("Michelle", "California", 21);

        HashMap<Long, Employee> employees = new HashMap();

        employees.put(employee1.id, employee1);
        employees.put(employee2.id, employee2);
        employees.put(employee3.id, employee3);
        employees.put(employee4.id, employee4);

        employee1.printNames(employees);
        employee1.printId(employees);

    }

}
