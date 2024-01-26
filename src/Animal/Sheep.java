package Animal;

public class Sheep extends Animal {
    private Wolle wolle;

    private Sheep(Sheep target) {
        super(target);
        if (target != null) {
            this.wolle = target.wolle;
        }
    }

    public Sheep(String name, String farbe) {
        this(name, farbe, "Wolle");
    }

    public Sheep(String name, String farbe, String wollenMaterial) {
        super(name);
        this.wolle = new Wolle(farbe, wollenMaterial);
    }

    @Override
    public void info() {
        super.info();
        wolle.info();
    }

    public void bemalen(String farbe) {
        wolle.setFarbe(farbe);
        System.out.println("-> " + super.getName() + " ist nun " + farbe + ".");
    }

    @Override
    public Animal clone() {
        System.out.println("-> Schaf wird geklont");
        return new Sheep(this);
    }
}
