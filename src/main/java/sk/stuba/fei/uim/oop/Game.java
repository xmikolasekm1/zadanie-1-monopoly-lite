package sk.stuba.fei.uim.oop;

import java.util.ArrayList;

public class Game{
    int PocetHracov=0;
    protected ArrayList<Player> hraci;
    private Output vypisanie=new Output();
    private Player novahra=new Player();
    //

    public int getPocetHracov() {
        return PocetHracov;
    }


    public Game() {

        Player hrac=new Player();
        hraci=hrac.infoHraci();

        vypisanie.vypis(hraci,PocetHracov);



    }
}
