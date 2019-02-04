package niedziela.bmw;

import niedziela.bmw.elementyKonstr.elemWnetrza.Kierownica;
import niedziela.bmw.elementyKonstr.elemWnetrza.elementyElektroniczne.Radio;
import niedziela.bmw.elementyKonstr.nadwozie.Szyba;
import niedziela.bmw.elementyKonstr.podwozie.Resor;
import niedziela.bmw.zakladyProd.FabrykaAut;
import niedziela.bmw.zakladyProd.Samochod;
import niedziela.bmw.zakladyProd.SamochodSport;

public class BmwMain {
    public static void main(String[] args) {
        Radio sony = new Radio();
        Szyba przednia = new Szyba();
        Kierownica rajdowa = new Kierownica();
        Resor x2 = new Resor();
        FabrykaAut fabrykaMonachium = new FabrykaAut();

        fabrykaMonachium.createAuto(sony,przednia,rajdowa,x2);
        System.out.println(fabrykaMonachium.createAuto(sony,przednia,rajdowa,x2));

        SamochodSport bmw = new SamochodSport();
        SamochodSport mercedes = new SamochodSport();
        System.out.println(bmw.getMoc());
        bmw.setMoc(800);
        System.out.println(bmw.getMoc());



    }
}
