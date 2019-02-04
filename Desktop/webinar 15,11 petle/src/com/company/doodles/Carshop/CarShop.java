package com.company.doodles.Carshop;

public class CarShop {
    public static void main(String[] args) {

          Car audi = new Car();
          audi.brand = "Audi";
          audi.model = "A4";
          audi.doors = 4;
          audi.carColor = "Czarny";
          audi.wheelsColor = "Srebrny";
          audi.tiresColor = "Czarny";

          String audiInfo = audi.brand+" "+audi.model
                  +"\n Drzwi:" +audi.doors
                  +"\n Kolor nadwozia: " + audi.carColor
                  +"\n Kolor felg: " + audi.wheelsColor
                  +"\n Kolor opon: " + audi.tiresColor;
          System.out.println("Wybrałeś następujący samochód: ");
          System.out.println(audiInfo);

          Car bmw = audi;
            bmw.brand = "BMW";

        String bmwInfo = bmw.brand+" "+bmw.model
                +"\n Drzwi:" +bmw.doors
                +"\n Kolor nadwozia: " + bmw.carColor
                +"\n Kolor felg: " + bmw.wheelsColor
                +"\n Kolor opon: " + bmw.tiresColor;
        System.out.println("Wybrałeś następujący samochód: ");
        System.out.println(bmwInfo);
        System.out.println(audi.brand);


    }
}
