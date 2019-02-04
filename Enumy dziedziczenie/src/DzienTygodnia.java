public enum DzienTygodnia {

    PONIEDZIALEK(1, "poniedziałek","zhōu yī 周一","el lunes"),
    WTOREK(2, "wtorek","zhōu èr 周二","el martes"),
    SRODA(3, "środa","zhōu sān 周三","el miercoles"),
    CZWARTEK(4, "czwartek","zhōu sì 周四","el jueves"),
    PIATEK(5, "piątek","zhōu wŭ 周五","el viernes"),
    SOBOTA(6, "sobota","zhōu liù 周六","el sabado"),
    NIEDZIELA(7, "niedziela","zhōu rì 周日","el domingo");

    private int index;
    private String nazwaPL;
    private String nazwaCHN;
    private String nazwaESP;

    DzienTygodnia(int index, String nazwaPL, String nazwaCHN, String nazwaSPN){
        this.index = index;
        this.nazwaPL = nazwaPL;
        this.nazwaCHN = nazwaCHN;
        this.nazwaESP = nazwaESP;

    }
    public int getIndex(){
        return index;
    }
    public String getNazwePL(){
        return nazwaPL;
    }
    public String getNazweCHN(){
        return nazwaCHN;
    }
    public String getNazweESP(){
        return nazwaESP;
    }
    public void getChoosen(String jezyk){
        if(jezyk.equals("PL")){
            System.out.println(nazwaPL);
        }

        if(jezyk.equals("CHN")){
            System.out.println(nazwaCHN);
        }

        if(jezyk.equals("ESP")){
            System.out.println(nazwaESP);
        }

    }


}
