package niedziela.bmw.zakladyProd;

public class Samochod {
     int liczbaKol;
     int liczbaDrzwi;
     double moc;

    void zapnijPas(){
        System.out.println("zapinam pasy");
    }

    public void zamykamDrzwi(){
        System.out.println("zamykam "+liczbaDrzwi+" drzwi");
    }
    public void odpalamSilnik(){
        System.out.println("odpalam silnik o mocy "+moc+"km");
    }
    public void jedz(){

        System.out.println("to jade "+ getClass().getSimpleName());

    }


}
