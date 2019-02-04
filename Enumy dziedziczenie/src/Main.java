import niedziela.TextUtilities;
import niedziela.bmw.zakladyProd.SamochodDost;
import niedziela.bmw.zakladyProd.SamochodSport;

public class Main {

    public static void main(String[] args) {
        Powtorka sprImie = new Powtorka("Andzej maciej kasia");
        sprImie.setImie("Andzej maciej");
        sprImie.getImie();
        sprImie.setImie("      k o t e k       ");
        sprImie.getImie();

        A obiektA = new A();
        B obiektB = new B(8);
        SamochodDost vw = new SamochodDost();

        SamochodSport audi = new SamochodSport();
        audi.jedz();
        audi.zamykamDrzwi();
        System.out.println(audi.liczbaDrzwi);
        vw.jedz();
        System.out.println(vw.moc);
        audi.jedz();
vw.jedz();
        System.out.println(        TextUtilities.isEmpty(null));

    }
}
