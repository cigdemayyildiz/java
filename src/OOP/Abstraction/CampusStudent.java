package OOP.Abstraction;

public class CampusStudent extends Student{


    // it is Concrete class because it's implementing abstract classes methods

    CampusStudent(){}

    CampusStudent(String name){
        super.name = name;
    }

    @Override
    public void attend() {

    }

    @Override
    public void sleep() {

    }

    @Override
    public int studyTime(int hour) {
        return 8;
    }


}
