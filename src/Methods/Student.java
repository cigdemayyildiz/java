package Methods;

import java.util.Random;

public class Student {

    String nameOfStudent;
    String lastNameOfStudent;
    int ageOfStudent;

    public void information(){
        System.out.println("Student name is: "+nameOfStudent+"\nStudent last name is: "+lastNameOfStudent+"\nStudent age is: "+ageOfStudent);
    }
    public void sleep(String place){
        int hour = generateHour(); // eger asagida olusturdugun random methodu (generateHour) non-staticse
                                  // o zaman baska bir non-static methodun icine object siz cagirabiliyorsun
        System.out.println(nameOfStudent+" is sleeping "+place+" "+hour+" hours.");
    }
    public void study(){
        System.out.println(nameOfStudent+" is studying "+generateHour()+" hours."); // bu sekilde sout icine de
                                    // olusturdugun non-static bir methodu object olusturmadan cagirabiliyorsun
    }
    public void run(int hour){
        System.out.println(nameOfStudent+" is running "+hour+" hours.");
    }
    public int generateHour(){
        Random random = new Random();
        int hour = random.nextInt(8);
        return hour;
    }

    public static void main(String[] args) {

        Student student1 = new Student();
        student1.nameOfStudent = "John";
        student1.lastNameOfStudent = "Savedra";
        student1.ageOfStudent = 40;
        student1.information();

        student1.study(); // method olustururken non-static iki methodu yukarida birbirine bagladigimiz
                          // icin isi yukarida cozduk ve object kullanmadan direk ismi ile cagirabildik.
        student1.sleep("in the livingroom");
        student1.run(student1.generateHour()); // burada yukarida olusturdugumuz random(generateHour) methodunu
                                              // object ismi ile birlikte cagirdik.


    }
}
