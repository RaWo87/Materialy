package SDA;

import java.time.LocalDate;

public class wDay implements Comparable<wDay>{
   private int hTemp,lTemp,mTemp;
    private LocalDate dzien;

    public wDay(String dzien,int hTemp, int mTemp, int lTemp) {
        this.hTemp = hTemp;
        this.lTemp = lTemp;
        this.mTemp = mTemp;
        this.dzien = dayFormatter(dzien);
    }
    public LocalDate dayFormatter(String data) {
        // 1/2/1948
        String[] date = data.split("/");
        Integer month = Integer.parseInt(date[0]);
        Integer day= Integer.parseInt(date[1]);
        Integer year= Integer.parseInt(date[2]);
        LocalDate out = LocalDate.of(year,month,day);

        return out;
    }

    @Override
    public String toString() {
        return  "\nnajwyzsza t= "  + hTemp +
                "\nnajnizsza t= "  + lTemp +
                "\nsrednia t= "    + mTemp +
                "\ndzien: "     + dzien;
    }

    public int gethTemp() {
        return hTemp;
    }

    public void sethTemp(int hTemp) {
        this.hTemp = hTemp;
    }

    public int getlTemp() {
        return lTemp;
    }

    public void setlTemp(int lTemp) {
        this.lTemp = lTemp;
    }

    public int getmTemp() {
        return mTemp;
    }

    public void setmTemp(int mTemp) {
        this.mTemp = mTemp;
    }

    public LocalDate getDzien() {
        return dzien;
    }



    @Override
    public int compareTo(wDay o) {
        return (this.getDzien().isAfter(o.getDzien())? 1:this.getDzien().equals(o.getDzien())? 0:-1);
    }
}
