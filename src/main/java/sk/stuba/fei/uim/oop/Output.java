package sk.stuba.fei.uim.oop;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class Output {
    private Player hrac= new Player();
    protected ArrayList<Player> infoHraci=new ArrayList<>();
    public Output() {
    }

    public void vypis(int PocetHracov){
        //int pocet=getPocetHracov();
        System.out.println("Mame "+PocetHracov+" hracov v hre");
        infoHraci= new ArrayList<>(hrac.getHraci());
        for (Player i:infoHraci){
            System.out.println(i);
        }
    }
}
