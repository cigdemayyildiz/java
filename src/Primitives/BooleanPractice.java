package Primitives;

public class BooleanPractice {

    public static void main(String[] args) {

        boolean isLightOn = true;

        boolean isBreakTime;

        isBreakTime = isLightOn;

        System.out.println(isLightOn); // true
        System.out.println(isBreakTime); // true

        boolean isClear = false;

        System.out.println(isClear); // false
        System.out.println(!isClear); // true

        // System.out.println(isBreakTime+isClear); it won't compile because boolean is like a String
        System.out.println("!!"+isBreakTime+isClear); // it is compile because you start the String

    }
}
