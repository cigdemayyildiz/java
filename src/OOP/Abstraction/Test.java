package OOP.Abstraction;

public class Test {

    public static void main(String[] args) {

        // Student student = new Student(); --> you cannot create an object from abstraction class
        // SelfLearner selfLearner = new SelfLearner(); --> you cannot create an object from abstraction class

        CampusStudent campusStudent = new CampusStudent();
        campusStudent.study();
        campusStudent.sleep();
        campusStudent.attend();
        campusStudent.studyTime(8);
        campusStudent.smile();
        System.out.println(campusStudent.name);
        campusStudent.name = "ahmet";
        System.out.println(campusStudent.name);
        Student campusStudent1 = new CampusStudent("mehmet");
        System.out.println(campusStudent1.name);

        OnlineStudents onlineStudents = new OnlineStudents();
        onlineStudents.studyTime(8);
    }
}
