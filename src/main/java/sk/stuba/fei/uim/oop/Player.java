package sk.stuba.fei.uim.oop;

import java.util.ArrayList;

public class Player {
    private int PocetHracov;
    private int cisloHraca;
    private String meno;
    private int peniaze;
    private int pozicia;
    protected ArrayList<Player> hraci= new ArrayList<>();


    public ArrayList<Player> getHraci() {
        return hraci;
    }

    public int getCisloHraca() {
        return cisloHraca;
    }

    public String getMeno() {
        return meno;
    }

    public int getPocetHracov() {
        return PocetHracov;
    }

    public int getPeniaze() {
        return peniaze;
    }

    public int getPozicia() {
        return pozicia;
    }

    public Player() {
    }

    /*public ArrayList<Player> infoHraci(){
        PocetHracov=0;
        while (PocetHracov < 2 || PocetHracov > 4) {
            PocetHracov=ZKlavesnice.readInt("Zadaj pocet hracov (maximum 4 hraci)");
            this.PocetHracov=PocetHracov;
        }
        for (int i=0;i<PocetHracov;i++){
            String meno=ZKlavesnice.readString("Zadaj meno hraca");
            hraci.add(new Player((i+1),meno));
        }
        return hraci;
    }*/



    public Player(int PocetHracov){
        while (PocetHracov < 2 || PocetHracov > 4) {
            PocetHracov=ZKlavesnice.readInt("Zadaj pocet hracov (maximum 4 hraci)");
            this.PocetHracov=PocetHracov;
        }
        hraci=new ArrayList<>();
        for (int i=0;i<PocetHracov;i++){
            String meno=ZKlavesnice.readString("Zadaj meno hraca");
            this.hraci.add(new Player((i+1),meno));
        }
    }


    public Player(int cisloHraca, String meno) {
        this.cisloHraca=cisloHraca;
        this.meno=meno;
        this.peniaze=1500;
        this.pozicia=0;
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
