package Methods;

import java.util.Scanner;

public class TechtorialStudentTest {

    public static void main(String[] args) {

        TechtorialStudent student1 = new TechtorialStudent(); // This object is coming from TechtiralStudent class
        TechtorialStudent student2 = new TechtorialStudent(); //
        // Static variables are same for every objects
        student1.setStudentName("David");
        student2.setStudentName("John");
        System.out.println(student1.studentName); // David
        System.out.println(student2.studentName); // John

        // I am going to call setSchoolName method and since it is a static method I can call
        // by using and object or class name

        // School name variable is a static variable
        // When was the last time you change the variable
        student1.setSchoolName("Techtorial");
        System.out.println(student2.schoolName); // Techtorial
        student2.setSchoolName("Tech School");
        System.out.println(student1.schoolName); // Tech School
        System.out.println(student2.schoolName); // Tech School
        TechtorialStudent.setSchoolAddress("2200 E Devon Avenue");
        System.out.println(student1.schoolAddress); // 2200 E Devon Avenue
        System.out.println(student2.schoolAddress); // 2200 E Devon Avenue
        // It doesn't matter how do we initialize the static variables
        // when we initialize it, the variable is going to be same for every object

        setStaticVariables("Techtorial", "2200 E Devon Avenue");
        // It doesn't matter how many student object we create, our address and school name is going to be same for every object
        TechtorialStudent student3 = new TechtorialStudent();
        System.out.println(student3.schoolAddress); //
    }

    public static void setStaticVariables(String schoolName, String schoolAddress){
        TechtorialStudent.setSchoolAddress(schoolAddress);
        TechtorialStudent.setSchoolName(schoolName);
    }
}
