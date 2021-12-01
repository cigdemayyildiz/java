package ArrayList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayListToArray {

    public static void main(String[] args) {

        ArrayList <String> cars = new ArrayList<>();
        cars.add("nissan");
        cars.add("toyota");
        cars.add("tofas");

        // How to convert ArrayList to array is by using 'toArray' method
        Object[] cars1 = cars.toArray();

        System.out.println(cars); // [nissan, toyota, tofas]
        System.out.println(Arrays.toString(cars1)); // [nissan, toyota, tofas]
        System.out.println(cars1[1]); // toyota
        System.out.println(cars1[2]); // tofas
        System.out.println(cars1[0]); // nissan

        List<Object> list1 = Arrays.asList(1,2,3,4); // basta listeyi olustururken istedigin kadar veri girebilirsin
        // ama size burada belirleniyor sonradan ekleme cikarma yapamiyorsun
        System.out.println(list1); // [1, 2, 3, 4]
//        list1.add(5); // yeni veri ekleyemezsin
//        System.out.println(list1); // UnsupportedOperationException
        list1.set(1,100); // ekleme cikarma yapamiyorsun ama degistirme yapabiliyorsun, sadece size ile oynayamiyorsun
        System.out.println(list1); // [1, 100, 3, 4]


    }
}
