package Methods;

import sun.nio.ch.Net;

public class Netflix {

    String accountName = "Cigdem";
    String userName;
    static int monthlyData = 200; // bu instance variable static oldugunda tum methodlar arasinda ortak kullanima acilir

    public void usage(int usingData){ // static method olusturmam lazim ki bir account altindaki tum userlar
                                            // bu data yi kullanabilsin, eger non-static olusturursam o zaman sadece
                                            // bu method icindeki userlar ulasabilir

        System.out.println(userName+" used "+usingData+" much data at this time.");
        monthlyData-=usingData; // eger methodu void yerine int olustursaydin return monthlyData-=usingData; yapman yeterli olacakti
        System.out.println("After "+userName+" using, your current data is "+monthlyData+".");
    }

    public static void main(String[] args) {

        Netflix user1 = new Netflix();
        user1.userName = "John";
        user1.usage(10);
        System.out.println(user1.monthlyData); // static bir instance variable i static bir methoda sadece isimle cagirabilirim.
        System.out.println(user1.userName); // userName instance variable i non-static oldugu icin direkt variable ismi
                                        // ile static bir method icine alamiyorum. object ile cagirabiliyorum.

        Netflix user2 = new Netflix();
        user2.userName = "Cigdem";
        user2.usage(30);


    }
}
