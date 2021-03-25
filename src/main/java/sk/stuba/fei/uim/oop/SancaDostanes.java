package sk.stuba.fei.uim.oop;

public class SancaDostanes extends Policko{

    @Override
    public void urobAkciu(Player hrac) {
        System.out.println("Mas narodeniny! Dostavas 500");
        hrac.setPeniaze(hrac.getPeniaze()+500);
        System.out.println("Tvoj novy financny stav: "+hrac.getPeniaze());
        super.urobAkciu(hrac);
    }
}
