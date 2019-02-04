public class Powtorka {
    private String imie;
    private boolean cointainsSpace;

    Powtorka(String imie) {
        this.imie = imie;
    }

    public void setImie(String imie) {
        if (imie == null) {
            System.out.println("Null");
            return;
        }else if(imie.trim().length() == 0) {
            System.out.println("blank space");
            return;

        }else {
            checkForSpace(imie);
            eraseSpace(imie);

        }
    }

    public String getImie() {
        System.out.println(imie);
        return imie;
    }

    private void eraseSpace(String imie) {
        this.imie = imie.replaceAll(" ", "");
    }

    private void checkForSpace(String imie) {
        imie = imie.trim();
        if (imie.contains(" ")) {
            cointainsSpace = true;
        } else cointainsSpace = false;
    }

}
