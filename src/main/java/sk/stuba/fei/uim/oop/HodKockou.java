package sk.stuba.fei.uim.oop;

public class HodKockou {

    private static final int NUM_DICE = 2;

    private int[] dice = new int[NUM_DICE];


    public void hodkockou() {
        for (int i = 0; i < NUM_DICE; i++) {
            this.dice[i] = 1 + (int) (Math.random() * 6);
        }

    }

    public int getDice () {
        return dice[0];
    }

    public int getTotal () {
        return (dice[0] + dice[1]);
    }

    public boolean isDouble () {
        return dice[0] == dice[1];
    }

    public String toString () {
        return dice[0] + " " + dice[1];
    }
}
