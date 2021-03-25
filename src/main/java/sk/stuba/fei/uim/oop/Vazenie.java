package sk.stuba.fei.uim.oop;

public class Vazenie extends Policko{
    private int pocetKol;
    private Player vazen=new Player();

    public int getPocetKol() {
        return pocetKol;
    }

    public void setPocetKol(int pocetKol) {
        this.pocetKol = pocetKol;
    }

    public Player getVazen() {
        return vazen;
    }

    public void setVazen(Player vazen) {
        this.vazen = vazen;
    }

    @Override
    public void urobAkciu(Player hrac) {
        if (hrac.isAktivny()){
            System.out.println("Stojis na policku vazenie");
        }
        super.urobAkciu(hrac);
    }
}
