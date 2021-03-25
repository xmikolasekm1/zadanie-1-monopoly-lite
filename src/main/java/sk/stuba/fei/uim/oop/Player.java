package sk.stuba.fei.uim.oop;

import java.util.ArrayList;

public class Player {
    private int PocetHracov;
    private int cisloHraca;
    private String meno;
    private int peniaze;
    private int pozicia;
    private int pocetKolVoVazeni;
    private boolean aktivny;
    protected ArrayList<Player> hraci= new ArrayList<>();


    public boolean vyherca(Player hrac){
        if(hrac.getPeniaze()<0){
            System.out.println("Zbankrotoval si!!!");
            return true;
        }
        return false;
    }

    public void setPozicia(int pozicia) {
        this.pozicia = pozicia;
    }

    public ArrayList<Player> getHraci() {
        return hraci;
    }

    public int getCisloHraca() {
        return cisloHraca;
    }

    public void setPocetKolVoVazeni(int pocetKolVoVazeni) {
        this.pocetKolVoVazeni = pocetKolVoVazeni;
    }

    public int getPocetKolVoVazeni() {
        return pocetKolVoVazeni;
    }

    public void setPeniaze(int peniaze) {
        this.peniaze = peniaze;
    }

    public String getMeno() {
        return meno;
    }

    public int getPeniaze() {
        return peniaze;
    }

    public int getPozicia() {
        return pozicia;
    }

    public void novaPozicia(int hodKockou){
        this.pozicia+=hodKockou;
    }

    public void prechodStartom(){
        this.pozicia=pozicia%24;
        this.peniaze+=500;
        System.out.println("Presiel si startom!");
        System.out.println("Tvoj aktualny financny stav: " + peniaze);
    }

    public Player() { }

    public ArrayList<Player> infoHraci(){
        PocetHracov=0;
        while (PocetHracov < 2 || PocetHracov > 4) {
            PocetHracov=ZKlavesnice.readInt("Zadaj pocet hracov (maximum 4 hraci)");
            //this.PocetHracov=PocetHracov;
        }
        for (int i=0;i<PocetHracov;i++){
            String meno=ZKlavesnice.readString("Zadaj meno hraca");
            hraci.add(new Player((i+1),meno));
        }
        return hraci;
    }

    public int getPocetHracov() {
        return PocetHracov;
    }

    public boolean isAktivny() {
        return aktivny;
    }

    public void setAktivny(boolean aktivny) {
        this.aktivny = aktivny;
    }

    public Player(int cisloHraca, String meno) {
        this.cisloHraca=cisloHraca;
        this.meno=meno;
        this.peniaze=1500;
        this.pozicia=0;
        this.aktivny=true;
    }

    @Override
    public String toString() {
        return "Player{" +
                "cisloHraca=" + cisloHraca +
                ", meno='" + meno + '\'' +
                ", peniaze=" + peniaze +
                ", pozicia=" + pozicia +
                '}';
    }
}
