package Animal;

public class WoolyPig extends Pig{
    private Wolle wolle;

    public WoolyPig(String name, String farbe){
        this(name,"-",farbe);
    }
    public WoolyPig(String name, String antromorphie, String farbe) {
        super(name, antromorphie);
        this.wolle = new Wolle(farbe);
    }

    public void bemalen(String farbe){
        wolle.setFarbe(farbe);
        System.out.println("-> " + super.getName() + " ist nun " + farbe + ".");
    }

    @Override
    public void info() {
        super.info();
        wolle.info();
    }

    @Override
    public WoolyPig clone() {
        System.out.println("-> Wollschwein wird geklont.");
        WoolyPig clone = (WoolyPig) super.clone();
        clone.wolle = wolle.clone();
        return clone;
    }
}
