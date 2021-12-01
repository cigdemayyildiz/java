package LinkedList;

import java.util.LinkedList;

public class LinkedListPractice {

    public static void main(String[] args) {

        // ArrayList
        // adding and removing element is slower
        // reaching to element is faster

        // LinkedList
        // adding and removing is faster
        // reaching to element is slower

        LinkedList <String> list = new LinkedList();

        list.add("Bob");
        list.add("Tom");
        list.add("John");
        System.out.println(list); // [Bob, Tom, John]

        list.add(1,"Ben");
        System.out.println(list); // [Bob, Ben, Tom, John]

        list.remove(2);
        System.out.println(list); // [Bob, Ben, John]

        System.out.println(list.get(2));

        list.element();

        System.out.println(list.element());
        System.out.println(list.element());



    }

}
