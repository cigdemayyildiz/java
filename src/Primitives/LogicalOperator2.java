package Primitives;

public class LogicalOperator2 {

    public static void main(String[] args) {

        // There is an event for kids they must be older than 5 younger than 12
        // the other requirement is their height needs to be less than 46"

        int kidAge = 8;
        int kidHeight = 44;

        int minAge = 5;
        int maxAge = 12;
        int heightLimit = 46;

        boolean attend = (kidAge >= minAge && kidAge <= maxAge) && kidHeight >= heightLimit;
        System.out.println(attend); // false
    }
}
