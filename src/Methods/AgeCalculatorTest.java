package Methods;

public class AgeCalculatorTest {

    public static void main(String[] args) {

        AgeCalculator myAge = new AgeCalculator();
        myAge.ageCalculator(1983);

        int b = myAge.ageCalculator(); // int b = myAge.ageCalculator(); AgeCalculator class da methodu int parametresi
                            // ile olusturdugumuz icin int data type icine store edebiliyoruz
        // store ediyor olmak store edilmis bir deger ile ne yapabiliyorsak onu yapmamizi saglar. eger int b icine
        // stor edersek bunu conditionlarda vs kullanabiliriz.

        if (b == 25){
            System.out.println("You must be happy");
        }


//        public String ageCalculator (String name, int birthYear){
//
//            int currentYear = 2021;
//            int age = currentYear-birthYear;
//            //System.out.println(name+" your age is: "+age);
//            return ""+name+" your age is "+age;

        // yukaridaki bilgiler sayesinde asagidaki bilgilere ulasiliyor
        // yukaridaki bilgiler AgeCalculator class dan geliyor

        String x = myAge.ageCalculator("John", 1980);
        System.out.println(x);
    }
}
