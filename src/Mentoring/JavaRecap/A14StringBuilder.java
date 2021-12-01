package Mentoring.JavaRecap;

public class A14StringBuilder {

    // Possible Interview Question
    // What is the difference between StringBuilder and StringBuffer?
    // They're similar but main different is synchronization which means in my mind is first come first serve
    // before it moves on the next action it completes the first one(one by one) WAIT TIME
    // StringBuffer and HashTable are both synchronized
    // StringBuffer execution is slower than StringBuilder because of this wait time.
    // What is the difference between String and StringBuilder?
    // String is immutable
    // StringBuilder is mutable
    // String and StringBuilder have some different methods

    public static void main(String[] args) {

        String name = new String("ahmet");
        String name1 = "mehmet";
        StringBuilder stringBuilder = new StringBuilder("mehmet");


    }

}
