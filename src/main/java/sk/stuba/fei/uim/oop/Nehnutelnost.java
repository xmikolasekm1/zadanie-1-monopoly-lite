package sk.stuba.fei.uim.oop;

public class Nehnutelnost extends Policko {
    private String nazovNehnutelnosti;
    private int cenaNehnutelnosti;
    private int stojne;
    private boolean jeVlastnena;
    private Player vlastnik = new Player();

    public Nehnutelnost() {
    }

    public Nehnutelnost(int cenaNehnutelnosti, String nazovNehnutelnosti, int stojne) {
        this.nazovNehnutelnosti = nazovNehnutelnosti;
        this.cenaNehnutelnosti = cenaNehnutelnosti;
        this.stojne = stojne;
        jeVlastnena = false;
        vlastnik = null;
    }

    public void setJeVlastnena(boolean jeVlastnena) {
        this.jeVlastnena = jeVlastnena;
    }

    public void kupaNehnutelnosti(Player hrac) {
        if (vlastnik == null) {
            System.out.println("Chces kupit nehnutelnost " + nazovNehnutelnosti + "? Cena je: " + this.cenaNehnutelnosti);
            if (hrac.getPeniaze() < cenaNehnutelnosti) {
                System.out.println("Nemas dostatok financii na kúpu nehnutelnosti");
            } else {
                System.out.println("Zadaj ano/nie :");
                if (ZKlavesnice.readBoolean()) {
                    setVlastnik(hrac);
                    System.out.println("Nehnutelnost vlastni: " + hrac.getMeno());
                    hrac.setPeniaze(hrac.getPeniaze() - cenaNehnutelnosti);
                }
            }
        } else if (vlastnik == hrac) {
            System.out.println("Vlastnis tuto nehnutelnost " + nazovNehnutelnosti);
        } else {
            System.out.println("Nehnutelnost " + nazovNehnutelnosti + " uz vlasti hrac " + vlastnik.getMeno());
            System.out.println("Zaplat stojne! Stojne je: " + this.stojne);
            hrac.setPeniaze(hrac.getPeniaze() - this.stojne);
            vlastnik.setPeniaze(vlastnik.getPeniaze() + this.stojne);

        }
    }

    @Override
    public void urobAkciu(Player hrac) {
        if (!hrac.isAktivny()){
            if (this.getVlastnik()!=null && this.getVlastnik().equals(hrac)) {
                this.setVlastnik(null);
                this.setJeVlastnena(false);
            }
        }
        else {
            System.out.println("Stojis na  policku nehnutelnost");
            kupaNehnutelnosti(hrac);
        }
        super.urobAkciu(hrac);
    }


    public void addStojne(int stojne) {
        this.stojne = stojne;
    }

    public void setVlastnik(Player vlastnik) {
        this.vlastnik = vlastnik;
        jeVlastnena = true;
    }

    public void setCenaNehnutelnosti(int cenaNehnutelnosti) {
        this.cenaNehnutelnosti = cenaNehnutelnosti;
    }

    public int getCenaNehnutelnosti() {
        return cenaNehnutelnosti;
    }

    public int getStojne() {
        return stojne;
    }

    public Player getVlastnik() {
        return vlastnik;
    }
}
