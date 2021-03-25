package sk.stuba.fei.uim.oop;

import java.util.ArrayList;
import java.util.HashMap;

public class Sanca extends Policko {
    private ArrayList<Policko> polickoSanca = new ArrayList<>(5);
    private SancaPosunVpred posunVpred = new SancaPosunVpred();
    private SancaPosunVzad posunVzad = new SancaPosunVzad();
    private SancaZaplat zaplat = new SancaZaplat();
    private SancaDostanes dar = new SancaDostanes();
    private SancaStojisKolo stojisKolo = new SancaStojisKolo();
    private HodKockou hod = new HodKockou();
    private int[] balicekKariet= {0,2,4,3,1,2,0,3,4,1,2,1,3,0,4,0,1,2,3,4,4,3,2,1,0};
    private int typSance = 0;


    public Sanca() {
        this.polickoSanca.add(0, posunVpred);
        this.polickoSanca.add(1, posunVzad);
        this.polickoSanca.add(2, zaplat);
        this.polickoSanca.add(3, dar);
        this.polickoSanca.add(4, stojisKolo);

    }

    @Override
    public void urobAkciu(Player hrac) {
        if (hrac.isAktivny()) {
            System.out.println("Stojis na policku sanca");
            switch (balicekKariet[typSance]) {
                case 0:
                    posunVpred.urobAkciu(hrac);
                    break;
                case 1:
                    posunVzad.urobAkciu(hrac);
                    break;
                case 2:
                    zaplat.urobAkciu(hrac);
                    break;
                case 3:
                    dar.urobAkciu(hrac);
                    break;
                case 4:
                    stojisKolo.urobAkciu(hrac);
                    break;
            }
            if (typSance==24){
                typSance=0;
            }
            else {
                typSance++;
            }
        }
        super.urobAkciu(hrac);
    }

}
