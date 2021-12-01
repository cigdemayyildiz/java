package OOP.Abstraction;

public abstract class SelfLearner extends Student{

    public void attend(){
        System.out.println("Free Attendance");
    }

    public void coffeeBreak(){
        System.out.println("It is always coffee break");
    }

    public abstract boolean nap();

    @Override
    public void study(){
        System.out.println("Self learner is studying");
    }

}
