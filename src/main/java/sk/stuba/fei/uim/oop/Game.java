package sk.stuba.fei.uim.oop;

import java.util.ArrayList;

public class Game{
    int PocetHracov=0;
    protected ArrayList<Player> hraci = new ArrayList<>();
    private Output vypisanie=new Output();
    private Player novahra=new Player();
    //

    public int getPocetHracov() {
        return PocetHracov;
    }


    public Game() {

        Player hrac=new Player(PocetHracov);
        /*hraci= new ArrayList<Player>(novahra.infoHraci());
        for (Player p: hraci){
            System.out.println(p);
        }
        System.out.println(hraci.get(0).getMeno());*/
        vypisanie.vypis(PocetHracov);



    }
}
