package sk.stuba.fei.uim.oop;

public class Sanca extends Policko {

    @Override
    public void urobAkciu(Player hrac) {
        if (hrac.isAktivny()){
            System.out.println("Stojis na policku sanca");
        }
        super.urobAkciu(hrac);
    }

}
