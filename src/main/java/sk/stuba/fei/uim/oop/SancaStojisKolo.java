package sk.stuba.fei.uim.oop;

public class SancaStojisKolo extends Policko{

    @Override
    public void urobAkciu(Player hrac) {
        System.out.println("Stojis 1 kolo");
        hrac.setPocetKolVoVazeni(1);
        super.urobAkciu(hrac);
    }
}
