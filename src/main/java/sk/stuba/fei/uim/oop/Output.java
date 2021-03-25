package sk.stuba.fei.uim.oop;

import java.util.ArrayList;
import java.util.Iterator;

public class Output {
    private int x = 0;
    private int y = 0;
    private Player hrac = new Player();
    private HodKockou hod = new HodKockou();
    private Policko pozicia = new Policko();
    private HraciaPlocha plocha = new HraciaPlocha();
    private Nehnutelnost budovy = new Nehnutelnost();



    public Output() {
    }

    public void vypis(ArrayList<Player> hraci, int PocetHracov) {
        System.out.println();
        System.out.println();
        System.out.println("Zacina Hra");

        while (true) {
            for (Player aktualnyHrac : hraci) {
                if (aktualnyHrac.isAktivny()) {
                    if (aktualnyHrac.getPocetKolVoVazeni() > 0) {
                        System.out.println("Na tahu je hrac" + aktualnyHrac.getCisloHraca() + ": " + aktualnyHrac.getMeno());
                        System.out.println("Stojis este pocet kol: " + aktualnyHrac.getPocetKolVoVazeni());
                        aktualnyHrac.setPocetKolVoVazeni(aktualnyHrac.getPocetKolVoVazeni() - 1);
                        char vstup = ZKlavesnice.readChar("Pre pokracovanie stlac enter");
                        System.out.println();
                    }
                    else {
                        if (hraci.size() == 1) {
                            System.out.println("VYHRAL HRAC" + aktualnyHrac.getCisloHraca() + ": " + aktualnyHrac.getMeno());
                            System.exit(0);
                        }

                        System.out.println("Na tahu je hrac" + aktualnyHrac.getCisloHraca() + ": " + aktualnyHrac.getMeno());
                        System.out.println("Financie hraca" + aktualnyHrac.getCisloHraca() + ": " + aktualnyHrac.getPeniaze());
                        System.out.println("Pozicia hraca" + aktualnyHrac.getCisloHraca() + ": " + aktualnyHrac.getPozicia());


                        hod.hodkockou(1,6);
                        System.out.println("Hodil si:" + hod.getDice());
                        aktualnyHrac.novaPozicia(hod.getDice());

                        if (aktualnyHrac.getPozicia() < 24) {
                            System.out.println("Tvoja nova pozicia je: " + aktualnyHrac.getPozicia());
                        }

                        if (aktualnyHrac.getPozicia() >= 24 || aktualnyHrac.getPozicia() == 0) {
                            aktualnyHrac.prechodStartom();
                        }

                        this.pozicia = plocha.getAktualnePolicko(aktualnyHrac.getPozicia() - 1);
                        this.pozicia.urobAkciu(aktualnyHrac);

                        if (hrac.vyherca(aktualnyHrac)) {
                            aktualnyHrac.setAktivny(false);
                            for (Policko pole: plocha.getHraciaPlochaPolicko()){
                                pole.urobAkciu(aktualnyHrac);
                            }
                        }

                        char vstup = ZKlavesnice.readChar("Pre pokracovanie stlac enter");
                        System.out.println();

                        int pocetAktivnych=hraci.size();
                        for (Player aktivniHraci: hraci){
                            if (!aktivniHraci.isAktivny()){
                                pocetAktivnych--;
                            }
                            if (pocetAktivnych==1){
                                for (Player vitaz: hraci){
                                    if (vitaz.isAktivny()){
                                        System.out.println("KONIEC HRY!");
                                        System.out.println("Vyhral hrac"+vitaz.getCisloHraca()+": "+vitaz.getMeno());
                                        System.exit(0);
                                    }

                                }
                            }
                        }
                    }
                }
            }
        }
    }


}
