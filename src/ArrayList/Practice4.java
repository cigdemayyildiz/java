package ArrayList;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Practice4 {

    public static void main(String[] args) {

        ArrayList list1 = new ArrayList();

        ArrayList list2 = new ArrayList(3);

        ArrayList list3 = new ArrayList(list1);

        ArrayList <Integer> list4 = new ArrayList<>();

        ArrayList <Double> list5 = new ArrayList<Double>();


        // you can use this way to be able to create ArrayList
        List<Integer> list6 = new ArrayList<Integer>(); // List is an Interface (family) --> List ArrayList in uzerinde ArrayList in ebeveyni
                                                 // ArrayList is a Class
        List<Double> list7 = new ArrayList<>();
        List<Character> list8 = new ArrayList<>();
        List<Short> list9 = new ArrayList<Short>();
        List list10 = new ArrayList<Short>();

        // List<Integer> list7 = new List<Integer>(); --> you cannot create an object from interface which is List

    }
}
