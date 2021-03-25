package sk.stuba.fei.uim.oop;

public class Policia extends Policko{

    @Override
    public void urobAkciu(Player hrac) {
        if (hrac.isAktivny()){
            System.out.println("Stojis na  policku policia");
            System.out.println("Ides do vazenia");
            hrac.setPocetKolVoVazeni(2);
            hrac.setPozicia(6);
        }
        super.urobAkciu(hrac);
    }
}
