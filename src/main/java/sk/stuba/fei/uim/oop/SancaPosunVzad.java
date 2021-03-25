package sk.stuba.fei.uim.oop;

public class SancaPosunVzad extends Policko{

    @Override
    public void urobAkciu(Player hrac) {
        System.out.println("Posun si sa o 5 policok dozadu");
        hrac.setPozicia(hrac.getPozicia()-5);
        if (hrac.getPozicia()<0){
            hrac.setPozicia(24+hrac.getPozicia());
        }
        System.out.println("Tvoja nova pozicia: "+hrac.getPozicia());
        super.urobAkciu(hrac);
    }
}
