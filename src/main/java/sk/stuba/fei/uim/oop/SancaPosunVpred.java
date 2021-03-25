package sk.stuba.fei.uim.oop;

public class SancaPosunVpred extends Policko {

    @Override
    public void urobAkciu(Player hrac) {
        System.out.println("Posun si sa o 5 policok dopredu");
        hrac.setPozicia(hrac.getPozicia()+5);
        if (hrac.getPozicia()>24){
            hrac.prechodStartom();
        }
        System.out.println("Tvoja nova pozicia: "+hrac.getPozicia());
        super.urobAkciu(hrac);
    }
}
