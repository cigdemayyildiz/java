package Mentoring.Employee;

import java.time.LocalDate;

public class Employee {

    String name;
    double salary;
    int workHours;
    int hireYear;

    public Employee(String empName, double empSalary, int empWorkHours, int empHireYear) {
        this.name = empName;
        this.salary = empSalary;
        this.workHours = empWorkHours;
        this.hireYear = empHireYear;
    }

    public double tax(){
        if (salary>1000)
            return salary*0.03;
            return 0;
    }

    public double bonus(){
        int extraHours = workHours-40;
        if (extraHours>0) {
            return extraHours * 30;
        }
        return 0;
    }

    public double raiseSalary(){
        LocalDate date = LocalDate.now();
        int year = date.getYear() - hireYear;
        if (year<10){
            return salary*0.05;
        }
        else if (9<year && year<20){
            return salary*0.01;
        }
        else{
            return salary*0.15;
        }
    }

    public void info(){
        System.out.println("Name: "+name);
        System.out.println("Salary: "+salary);
        System.out.println("Work Hours: "+workHours);
        System.out.println("Hire Year: "+hireYear);
        System.out.println("Tax: "+ tax());
        System.out.println("Bonus: "+ bonus());
        System.out.println("Raise of Salary: "+ raiseSalary());
        System.out.println("Salary with tax and bonus: "+ (salary - tax()+ bonus()));
        System.out.println("Total salary with the raise of salary: "+ (salary + raiseSalary()));
    }
}
