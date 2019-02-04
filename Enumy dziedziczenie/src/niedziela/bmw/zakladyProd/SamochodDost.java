package niedziela.bmw.zakladyProd;

public class SamochodDost extends Samochod{

SamochodDost(){
moc = 200;
liczbaDrzwi = 3;
liczbaKol = 6;
}

void laduje(){
    System.out.println("laduje towar");

}
    @Override
    public void jedz() {
        laduje();
        zamykamDrzwi();
        zapnijPas();
        odpalamSilnik();
        super.jedz();
        System.out.println("ciezko");
    }


}
