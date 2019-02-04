package sda.HashSetDemo;

public class Country {
    private String countryName;
    private String capitol;
    private double population;
    private Prezydent prezydent;

    Country(String CN, String CP, double Popul, Prezydent glowa){
        this.countryName = CN;
        this.capitol = CP;
        this.population = Popul;
        this.prezydent = glowa;
    }
    public void setPrezydent(Prezydent kukielka){
        this.prezydent = kukielka;
    }
    @Override
    public String toString() {
        return "Country{" +
                "countryName='" + countryName + '\'' +
                ", capitol='" + capitol + '\'' +
                ", population=" + population +
                ", prezydent=" + prezydent.getName() +

                '}';
    }

    public String getCountryName(){
     return    countryName;
    }
    public String getCountryCapital(){
        return    capitol;
    }
    public double getCountryPop(){
        return    population;
    }


}
