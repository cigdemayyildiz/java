package Methods;

public class AgeCalculator {

    // create a method that will take one int parameter for your birth year
    // this method simply calculate and print your age

    public void ageCalculator(int birthYear){
        int currentYear = 2021;
        int age = currentYear-birthYear;
        System.out.println("Your age is: " + age);
    }
    // non-static method icin ayni class da da main method olusturarak object olusturup yapabilirsin
    // ya da yeni bir class da da non-static methoduna object olusturabilirsin
    // ikisi de ayni islemi yapiyor
    public static void main(String[] args) {
        AgeCalculator yourAge = new AgeCalculator();
        yourAge.ageCalculator(1980);
    }

    public int ageCalculator(){
        int age = 2021 - 2015;
        System.out.println("Your age is: " + age);
        return age;
    }


    // overload very first method by passing a String parameter
    // which is going to be name of the person
    // an print out the age of the person as:
    // ".... your age is ....."

    public String ageCalculator(String name, int birthYear){

        int currentYear = 2021;
        int age = currentYear-birthYear;
        //System.out.println(name+" your age is: "+age);
        return ""+name+" your age is "+age;

    }

}
