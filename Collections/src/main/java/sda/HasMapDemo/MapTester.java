package sda.HasMapDemo;

public class MapTester {
    public static void main(String[] args) {
        //Mapy
        Mapy mojaMapa = new Mapy();
        mojaMapa.addWord("piesek","puppy");
        mojaMapa.addWord("kotek","cat");
        mojaMapa.addWord("piesek","puppy");

        System.out.println(mojaMapa.dictionary.get("piesek"));
        System.out.println(mojaMapa.dictionary.get("kotek"));

        mojaMapa.modifyWord("piesek","daug");
        mojaMapa.modifyWord("kociatko","cat");
        System.out.println("piesek - "+mojaMapa.getWord("piesek"));
        System.out.println(mojaMapa.dictionary.get("piesek"));
        System.out.println(mojaMapa.dictionary.get("kociatko"));
        System.out.println(mojaMapa.dictionary.get("piesek"));
        mojaMapa.removeTrans("piesek");
        System.out.println(mojaMapa.dictionary.get("piesek"));
        mojaMapa.addWord("statek","ship");
        System.out.println(mojaMapa.getFullList());

        mojaMapa.addWord2("piesek","dog1","dog2");
        System.out.println(mojaMapa.dictionary2);
        System.out.println(mojaMapa.getWord2("piesek"));
        System.out.println(mojaMapa.dictionary);
        System.out.println("wyszukiwanie: ");
        mojaMapa.addWord("piesek1","dog1");
        mojaMapa.addWord("elopiesek1","dog2");
        mojaMapa.addWord("hehespiesesek1","dog3");

        System.out.println(mojaMapa.askSearch("ese"));

    }
}
