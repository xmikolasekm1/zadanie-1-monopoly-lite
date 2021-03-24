package sk.stuba.fei.uim.oop;

import java.util.ArrayList;

public class HraciaPlocha {
    private ArrayList<Policko> hraciaPlochaPolicko= new ArrayList<>(24);
    private Policko aktualnePolicko= new Policko();
    private Start start= new Start();
    private Nehnutelnost nehnutelnost1= new Nehnutelnost(300,"Cementarne",250);
    private Nehnutelnost nehnutelnost2= new Nehnutelnost(400, "Zeleznice",350);
    private Nehnutelnost nehnutelnost3= new Nehnutelnost(500, "Energeticke zavody",450);
    private Nehnutelnost nehnutelnost4= new Nehnutelnost(450, "Vodarne",400);
    private Nehnutelnost nehnutelnost5= new Nehnutelnost(350, "Zoo",300);
    private Nehnutelnost nehnutelnost6= new Nehnutelnost(550, "Kasino",500);
    private Nehnutelnost nehnutelnost7= new Nehnutelnost(250, "Kaviaren",200);
    private Nehnutelnost nehnutelnost8= new Nehnutelnost(150, "Pohrebnictvo",100);
    private Nehnutelnost nehnutelnost9= new Nehnutelnost(250, "Nemocnica",200);
    private Nehnutelnost nehnutelnost10= new Nehnutelnost(350, "Skola",300);
    private Nehnutelnost nehnutelnost11= new Nehnutelnost(550, "Mrakodrap",500);
    private Nehnutelnost nehnutelnost12= new Nehnutelnost(500, "Lekaren",450);
    private Nehnutelnost nehnutelnost13= new Nehnutelnost(600, "Letisko",550);
    private Nehnutelnost nehnutelnost14= new Nehnutelnost(350, "Hotel",300);
    private Nehnutelnost nehnutelnost15= new Nehnutelnost(550, "Pekaren",500);
    private Nehnutelnost nehnutelnost16= new Nehnutelnost(400, "Potraviny",350);
    private ArrayList<Nehnutelnost> budovy= new ArrayList<>(16);

    private Sanca sanca= new Sanca();
    private Policia policia= new Policia();
    private Vazenie vazenie= new Vazenie();
    private PlatbaDane platbaDane=new PlatbaDane();



    public HraciaPlocha() {
        this.hraciaPlochaPolicko.add(0, start);
        this.hraciaPlochaPolicko.add(1, nehnutelnost1);
        this.budovy.add(0,nehnutelnost1);
        this.hraciaPlochaPolicko.add(2, nehnutelnost2);
        this.budovy.add(1,nehnutelnost2);
        this.hraciaPlochaPolicko.add(3, sanca);
        this.hraciaPlochaPolicko.add(4, nehnutelnost3);
        this.budovy.add(2,nehnutelnost3);
        this.hraciaPlochaPolicko.add(5, nehnutelnost4);
        this.budovy.add(3,nehnutelnost4);
        this.hraciaPlochaPolicko.add(6, vazenie);
        this.hraciaPlochaPolicko.add(7, nehnutelnost5);
        this.hraciaPlochaPolicko.add(8, nehnutelnost6);
        this.hraciaPlochaPolicko.add(9, sanca);
        this.hraciaPlochaPolicko.add(10, nehnutelnost7);
        this.hraciaPlochaPolicko.add(11, nehnutelnost8);
        this.hraciaPlochaPolicko.add(12, platbaDane);
        this.hraciaPlochaPolicko.add(13, nehnutelnost9);
        this.hraciaPlochaPolicko.add(14, nehnutelnost10);
        this.hraciaPlochaPolicko.add(15, sanca);
        this.hraciaPlochaPolicko.add(16, nehnutelnost11);
        this.hraciaPlochaPolicko.add(17, nehnutelnost12);
        this.hraciaPlochaPolicko.add(18, policia);
        this.hraciaPlochaPolicko.add(19, nehnutelnost13);
        this.hraciaPlochaPolicko.add(20, nehnutelnost14);
        this.hraciaPlochaPolicko.add(21, sanca);
        this.hraciaPlochaPolicko.add(22, nehnutelnost15);
        this.hraciaPlochaPolicko.add(23, nehnutelnost16);
    }

    /*public ArrayList<Policko> getBudovy() {
        for (Policko plocha: hraciaPlochaPolicko){
            if (!plocha.equals(start) || !plocha.equals(sanca) || !plocha.equals(vazenie) || !plocha.equals(platbaDane) || !plocha.equals(policia)){
                int i=0;
                budovy.add(i, plocha);
                i++;
            }
        }
        return budovy;
    }*/

    public ArrayList<Policko> getHraciaPlochaPolicko() {
        return hraciaPlochaPolicko;
    }

    public Policko getAktualnePolicko(int pozicia) {
        return this.vratPolicko(pozicia);
    }

    public void setAktualnePolicko(Policko aktualnePolicko) {
        this.aktualnePolicko = aktualnePolicko;
    }

    public Policko vratPolicko(int pozicia){
        return this.hraciaPlochaPolicko.get(pozicia+1);
    }
}
