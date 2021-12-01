package Constructor;

public class EmployeeTest {

    public static void main(String[] args) {

        Employee employee1 = new Employee(); // create an object (2nd way to initialize variables)
        employee1.name = "Zack";
        employee1.age = 26;

        employee1.setEmployeeId(11);
        System.out.println(employee1.employeeId);

        Employee employee2 = new Employee("female");
        System.out.println(employee2.gender);

        System.out.println(employee1); // Constructor.Employee@5cad8086 --> hashcode

        employee1.info();
        System.out.println();
        employee2.info();

    }
}
