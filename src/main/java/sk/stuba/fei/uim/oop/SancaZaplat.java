package sk.stuba.fei.uim.oop;

public class SancaZaplat extends Policko{


    @Override
    public void urobAkciu(Player hrac) {
        System.out.println("Pokazilo sa ti auto! Musis zaplatit 450");
        hrac.setPeniaze(hrac.getPeniaze()-450);
        System.out.println("Tvoj aktualny financny stav: "+hrac.getPeniaze());
        super.urobAkciu(hrac);
    }
}
