package Encapsulation;

public class CityTest {

    public static void main(String[] args) {

        City city = new City();

        city.setName("Chicago");
        System.out.println(city.getName());

        city.setPopulation(200_000);
        System.out.println(city.getPopulation());

        city.setEstablishmentYear(1967);
        System.out.println(city.getEstablishmentYear());
    }
}
