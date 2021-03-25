package sk.stuba.fei.uim.oop;

public class HodKockou {

    private static final int NUM_DICE = 2;

    private int[] dice = new int[NUM_DICE];


    public void hodkockou(int min,int max) {
        for (int i = 0; i < NUM_DICE; i++) {
            this.dice[i] = min + (int) (Math.random() * (max-min+1));
        }

    }

    public int getDice () {
        return dice[0];
    }

    public String toString () {
        return dice[0] + " " + dice[1];
    }
}
