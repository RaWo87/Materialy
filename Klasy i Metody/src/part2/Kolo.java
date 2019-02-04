package part2;

public class Kolo {
    private double cisnienie;
    private String name = "Debica";
    //setter
    void setPressure(double cisnienie){
        if (cisnienie>40){
            this.cisnienie = 40;
        }else if(cisnienie<0){
            this.cisnienie = 0;
        }else this.cisnienie = cisnienie;
    }
    //getter
    public double getPressure(){
        return cisnienie;
    }
    public String getName(){
        if(name =="Debica"){
            this.name = "Michelin";

        }
        return name;
    }

}
