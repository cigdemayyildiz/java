package Encapsulation;

public class City {

    /*
    Encapsulation
    - hiding data

    - creating fields with private access modifiers
    - you need to create setter to set values
    - you need to create getter to get values
     */

    private String name;
    private int population, establishmentYear;


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPopulation(){
        return population;
    }

    public void setPopulation(int population){
        this.population = population;
    }

    public int getEstablishmentYear(){
        return establishmentYear;
    }

    public void setEstablishmentYear(int year){
        this.establishmentYear = year;
    }


}


