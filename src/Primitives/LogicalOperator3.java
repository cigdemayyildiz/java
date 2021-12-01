package Primitives;

public class LogicalOperator3 {

    public static void main(String[] args) {

        int attend = 95;
        int score = 70;
        int myAttend = 10;
        int myScore = 75;

        boolean passACourse = myAttend >= attend || myScore > score;
        System.out.println("Can I pass this course? --> " + passACourse);

    }
}
