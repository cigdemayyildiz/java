package MAP;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Practice {

    public static void main(String[] args) {

        /*
        What is MAP?
         - Data structure type that we can store our key and value pairs?
         - Only allows us to store object values and keys
         - For primitive storage we need to use equivalent wrapper class for primitive data types

        How can we add items in the MAP?
         - put(); method
         We can add entries(Key and Value pairs) in the Map with this method.

        How do we create a MAP?
          Map capitalCities = new HashMap(); --> this will compile
                                                  data type would be an object (Eger herhangi bir ozellik belirtmeden <>
                                                  parantezleri kullanip icine store etmek istedigimiz data tiplerini
                                                  belirtmeden bir Map olusturursak hata vermeden calisir ama default
                                                  olarak sectigi Key and Value Object tipinde olur. Yani spesifik olarak
                                                  bir ozellik atanmamis olur(String, Integer etc))
         - For declaration of the map we don't need to use diamond brackets but using diamond brackets is always the best.

          Map<String,String> capitalCities = new HashMap<>();
            - Brackets on the right side of equivalent is not required after Java-8

          capitalCities.put("Norway","Oslo");
          System.out.println(capitalCities); --> {Norway=Oslo}

          capitalCities.put("Norway","Amsterdam");
          System.out.println(capitalCities); --> {Norway=Amsterdam}
          - When put method is used for already existing Key, it doesn't throw an error ar any compile time problem.
            It updates the value for the Key.

          capitalCities.put(null, "Ankara");
          System.out.println(capitalCities); --> {null=Ankara}
          - Inside the map we can have one null Key.

          capitalCities.put("US",null); --> {US,null}
          capitalCities.put("Turkey",null); --> {Turkey,null}
          - Even though Map only allows one null Key, we can have as many null value as we want.

          In which Class or Interface put method comes from?
           put(); method comes from Map Interface
           String is immutable but is mutable

         What is maximum entry number for HashMap?
          capitalCities.size(); --> size(); method returns an integer value so limitation for entry in a Map would be
          maximum integer number from Java.

          There is one method that makes the size long and we can go up to highest long value.

          If you want to find max value for int or long use wrapper class and called MAX_VALUE instance.
          int max = Integer.MAX_VALUE;
          System.out.println(max); --> 2_147_483_647

          long max = Long.MAX_VALUE;
          System.out.println(max); --> 9_223_372_036_854_775_807

         How can we access item from a Map?
          - We need to use our Key as a parameter and we can call Key with get(); method.

          capitalCities.get("Norway);
          System.out.println(capitalCities); --> Amsterdam

         If you want to access all values from the Map but you don't know the Keys. How can you get the values?
          If you want to only see the Key values on the screen;
            System.out.println(capitalCities.keySet()); --> bu sekilde yazdirdiginda bir Set listesi olarak ekranda
            gorursun, verilere teker teker ulasip uzerlerinde islem yapamazsin sadece goruntulersin.

          Set<String> keys = capitalCities.keySet();
          for(String key : keys){
            System.out.println(capitalCities.get(key)); --> This will print all the values form Map by one by
          } --> bu sekilde forEach loop ile teker teker her bir Key e ulasabilir uzerlerinde veri tipi ne ise o veri
          tipinin sahip oldugu methodlari kullanabilirsin. Veri tipi String se String in methodlarina ulasabilirsin,
          o Key ozelinde.

          // Print out all the Keys that has a value of empty String
          Set<String> keys = capitalCities.keySet();
          for(String key : keys){
              if(capitalCities.get(key).equals("")){
                System.out.println(key);
              }
          }

          // Store all the Keys in an ArrayList that has a value of empty String
           Set<String> keys = capitalCities.keySet();
           List<String> emptyKeys = new ArrayList();
          for(String key : keys){
              if(capitalCities.get(key).equals("")){
                System.out.println(key);
                emptyKeys.add(key);
              }
          }

         How do we remove items from Map?
         - remove(); --> take Key as a parameter and removes the entry.
         */

        // HashMap contains only unique keys
        // HashMap has one null key and
        // HashMap <String, ArrayList> map = new HashMap<>();
        // HashMap <String, Set> map = new HashMap<>();
        // HashMap <String, Set<String>> map = new HashMap<>();
        // HashMap <ArrayList, Set<String>> map = new HashMap<>();
        // HashMap <ArrayList<Integer>, Set<String>> map = new HashMap<>();
        // HashMap <ArrayList<Integer>, HashMap<String, Integer>> map = new HashMap<>();

        HashMap <Integer, String> map1 = new HashMap();

        map1.put(123, "Cigdem");
        map1.put(124, "John");
        map1.put(125, "Koray");
        map1.put(126, "Ozlem");

        System.out.println(map1); // {123=Cigdem, 124=John, 125=Koray, 126=Ozlem}

        map1.put(123, "Leyla"); // 123 value su olan key i reassing etti, yeniden ayni numaradan olusturmadi,
                                // olani degistirdi cunku key is unique

        System.out.println(map1); // {123=Leyla, 124=John, 125=Koray, 126=Ozlem}

        map1.put(127, "John"); // burada value dan iki tane olusturuyor cunku value bolumu unique degil
        System.out.println(map1); // {123=Leyla, 124=John, 125=Koray, 126=Ozlem, 127=John}

        map1.put(null, "Jenny");
        System.out.println(map1); // {null=Jenny, 123=Leyla, 124=John, 125=Koray, 126=Ozlem, 127=John}

        map1.put(null, "Alex");
        System.out.println(map1); // {null=Alex, 123=Leyla, 124=John, 125=Koray, 126=Ozlem, 127=John}

        map1.put(130, null);
        map1.put(135, null);
        System.out.println(map1); // {null=Alex, 130=null, 135=null, 123=Leyla, 124=John, 125=Koray, 126=Ozlem, 127=John}


        // get();
        System.out.println(map1.get(123)); // Leyla // get(); komutu ile hashMap icinden bir veriyi getirebilirsin.
        System.out.println(map1.get(null)); // Alex
        String nullValue = map1.get(null); // hashMap icinden getirdigin veriyi verinin tipi ne ise o data tipinde store edebilirsin.
        System.out.println(nullValue); // Alex
        System.out.println(nullValue.concat(" is a student.")); // Alex is a student.
        // String tipinde store edebildigin icin String e ait tum methodlari bu veri uzerinde kullanabilirsin.


        System.out.println(map1.values()); // [Alex, null, null, Leyla, John, Koray, Ozlem, John]

        System.out.println(map1.keySet()); // [null, 130, 135, 123, 124, 125, 126, 127]

        Set keysOfMap = map1.keySet(); // Set icine store etmelisin
        System.out.println(keysOfMap); // [null, 130, 135, 123, 124, 125, 126, 127]

       for (Object key : keysOfMap){
           System.out.println(map1.get(key));
       }

        // I want you to write a method takes Map<String,String> as a parameter
        // remove all the items that has an empty String value

        Map<String,String> map = new HashMap<>();
        map.put("T", "F");
        map.put("F", " ");
        System.out.println(removeItems(map));
    }

    public static Map<String,String> removeItems(Map<String,String> map){

        // we should see every value in this map
        // we need to check ones are empty then delete it
        Set<String> sets = map.keySet();
        for (String key : sets){
            String value = map.get(key);
            if (value.equals(" ")){
                map.remove(key);
            }
        }
       return map;
    }
}
