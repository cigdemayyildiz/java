package Blocks;

public class Practice {

    /*
        - static blocks:
                    - it runs as first thing in the class
                    - it runs only one time
                    - you can initialize static variables in the static blocks

         - instance blocks:
                    - it runs for every object
                    - it runs as many time as you can created object
                    - you can initialize instance variables in the instance blocks
     */

    int number;
    static int id;

// ikisi de object olusturuldugunda baska bir seye ihtiyac duymadan calisiyor
    {
        number = 10;
        System.out.println("Instance block");
    }

   static { // her zaman main method altinda cagrildiginda ilk sirada yazacak
        id = 25;
        System.out.println("Static block");
    }




}
