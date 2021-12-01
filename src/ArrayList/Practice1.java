package ArrayList;

import java.util.ArrayList;

public class Practice1 {

    public static void main(String[] args) {

        /*
        ArrayList                               Array
         - size is dynamic                      - size is fixed
         - has methods                          - has no methods
         - stores object                        - has index
         - has indexing                         - store primitives and objects
         - you can store duplicates             - you can store duplicates
         - to use it, import is needed          - you can sort array by using sort() method
         - has insertion order
         */

        // ArrayList
        // adding and removing element is slower
        // reaching to element is faster

        // LinkedList
        // adding and removing is faster
        // reaching to element is slower

        ArrayList list1 = new ArrayList();

        ArrayList list2 = new ArrayList(3);

        ArrayList list3 = new ArrayList(list1);

        ArrayList <Integer> list4 = new ArrayList<>();

        ArrayList <Double> list5 = new ArrayList<Double>();

        System.out.println(list2); // []


        // add(); --> adding element
        list2.add(11);
        System.out.println(list2); // [11]
        list2.add(22);
        System.out.println(list2); // [11, 22]
        list2.add("white");
        System.out.println(list2); // [11, 22, white]
        list2.add(11);
        list2.add(null);
        System.out.println(list2); // [11, 22, white, 11]
        list2.add(2,44); // bu sekilde yazarsan ilk yazdigin sayi index icin ikincisi eklemek istedigin
        // element icin olacak, 2.index white oldugu icin onu itekleyip yerine gececek, ama white yine de icerde
        // kalacak onu silmeyecek.
        System.out.println(list2); // [11, 22, 44, white, 11]



        // size(); --> checking size of ArrayList
        int sizeOfList2 = list2.size();
        System.out.println(sizeOfList2); // 5

        //list2.add(6,66); // size 5 index 4 eger 6 index numara icin element olusturmak istersen bunu yapmaz
        // System.out.println(list2); // IndexOutOfBoundsException Index: 6, Size: 5

        list2.add(5,55); // bunu yazmadan once size 5 di ve bu da demek oluyor ki index number is 4,
        // eger bir sonraki index i olusturmak istiyorsan buna izin veriyor ama 6.indexi olusturmak istersen o zaman
        // izin vermiyor. hemen bir sonrakine izin veriyor.
        System.out.println(list2); // [11, 22, 44, white, 11, 55]


        // get(); --> getting which element you want from the ArrayList
        System.out.println(list2.get(3)); // white --> get(); methodu index 3 u cagiriyor

        // System.out.println(list2.get(10)); // IndexOutOfBoundsException: Index: 10, Size: 6

        System.out.println(list2.size()); // 6


        // remove(); --> deleting the elements
        list2.remove("white");
        System.out.println(list2); // [11, 22, 44, 11, 55]
        list2.remove(1);
        System.out.println(list2); // [11, 44, 11, 55]
        list2.remove("55"); // if the element isn't on the list nothing happens
        System.out.println(list2); // [11, 44, 11, 55]
        list2.remove((Integer)55); // listedeki elementlerden birini spesifik olarak silmek istiyorsan bunu kullanabilirsin
        System.out.println(list2); // [11, 44, 11]


        // addAll(); --> you can add a whole collection to the ArrayList
        list3.addAll(list2); // list2 icindeki her seyi ekle
        System.out.println("list3--> "+list3); // [11, 44, 11]
        list3.add(77);
        System.out.println("list3--> "+list3); // [11, 44, 11, 77]


        // removeAll(); --> you can remove a whole collection from to the ArrayList
        list3.removeAll(list2); // list2 ye ait olan tum elementleri sildi sadece kendine ait olan elementi tuttu
        System.out.println("list3--> "+list3); // [77]


        list3.add(88);
        list3.add(99);
        System.out.println("list3--> "+list3); // [77, 88, 99]


        // set(); --> updating elements
        list3.set(2,100); // 2 index numarali element i virgulden sonra yazdigim element ile degistir
        System.out.println(list3); // [77, 88, 100] --> 99 yerine 100 yazdi


        // you can use String methods --> String icin kullandigin methodlari kullanabilirsin

        System.out.println(list3.contains(88)); // true

        System.out.println(list3.get(0).toString().startsWith("x")); // false

        list3.set(0,"xxx"); // list3 un 0 index numarali elementini xxx olarak degistirdik

        System.out.println(list3.get(0).toString().startsWith("x")); // true

        System.out.println(list3.subList(1,3)); // 1 den 3 e kadar olan elementleri gosterecek substring() in Array hali


        // clear();

        list3.clear();
        System.out.println(list3); // []
        System.out.println(list3.size()); // 0
    }
}
