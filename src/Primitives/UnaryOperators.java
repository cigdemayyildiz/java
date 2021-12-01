package Primitives;

public class UnaryOperators {

    public static void main(String[] args) {

        int studentNumber = 25;

        studentNumber=studentNumber+1;
        studentNumber+=1;
        studentNumber++;

        System.out.println(studentNumber); // 28

        ++studentNumber;
        System.out.println(studentNumber); // 29

        studentNumber--;
        System.out.println(studentNumber); // 28

        --studentNumber;
        System.out.println(studentNumber); // 27

        studentNumber--; studentNumber--; studentNumber--;
        System.out.println(studentNumber); // 24

        studentNumber++;
        studentNumber--;

        System.out.println(studentNumber++); // 24
        System.out.println(studentNumber); // 25
        System.out.println(++studentNumber); // 26

        System.out.println(studentNumber--); // 26
        studentNumber--; // 25
        --studentNumber; // 23
        System.out.println(--studentNumber); // 22
        System.out.println(studentNumber); // 22

        int a = studentNumber++ + studentNumber++ + 5; // 50
        a--; // 49
        a = studentNumber; // 24
        System.out.println(a--); // 24
    }
}
