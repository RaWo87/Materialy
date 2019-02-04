package com.company;

public enum Kalkulator {
    DODAWANIE("+", new Dodawanie()),
    ODEJMOWANIE("-", new Odejmowanie()),
    MNOZENIE("*", new Mnozenie()),
    DZIELENIE("/", new Dzielenie()),
    MODULO("%", new Modulo()),
    MIN("<", new Min()),
    MAX(">", new Max()),
    POWER("^", new Power());


    public String znak;
    public Operacja operacja;

    Kalkulator(String znak, Operacja operacja) {
        this.znak = znak;
        this.operacja = operacja;

    }

    static Operacja znajdzKalkulatorDlaZnaku(String znak) {
        for (Kalkulator item : Kalkulator.values()) {
            if (znak.equals(item.znak)) {
                return item.operacja;
            }
        }

        return new Dodawanie();
    }


}
