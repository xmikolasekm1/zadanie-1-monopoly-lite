package sk.stuba.fei.uim.oop;

public class PlatbaDane extends Policko{
    private int vyskaDane;

    public void setVyskaDane(int vyskaDane) {
        this.vyskaDane = vyskaDane;
    }

    public int getVyskaDane() {
        return vyskaDane;
    }

    @Override
    public void urobAkciu(Player hrac) {
        if (hrac.isAktivny()){
            System.out.println("Stojis na policku platba dane");
            System.out.println("Musis zaplatit dan vo vyske 400");
            hrac.setPeniaze(hrac.getPeniaze()-400);
        }
        super.urobAkciu(hrac);
    }
}
