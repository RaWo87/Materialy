package niedziela.bmw.zakladyProd;

public class SamochodSport extends Samochod{

   public SamochodSport() {
        moc = 500;
        liczbaDrzwi = 2;
        liczbaKol = 4;
    }
    public void setMoc(int moc){
       this.moc = moc;
    }
    public double getMoc(){
       return moc;
    }

        void tankuj(){
            System.out.println("tankuje duzo paliwa");
        }

        @Override
    public void jedz() {
            tankuj();
            zamykamDrzwi();
            zapnijPas();
            odpalamSilnik();
            super.jedz();
            System.out.println("szybko");
        }
}
