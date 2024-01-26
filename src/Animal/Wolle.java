package Animal;

public class Wolle implements Cloneable {
    private String farbe;
    private String material;

    public Wolle(String farbe){
        this(farbe, "Wolle");
    }
    public Wolle(String farbe, String material) {
        this.farbe = farbe;
        this.material = material;
    }

    public void info(){
        System.out.println("- Wolle -");
        System.out.println("Objekt: " + this);
        System.out.println("Farbe: " + farbe);
        System.out.println("Material: " + material);
    }

    public void setFarbe(String farbe) {
        this.farbe = farbe;
    }

    public Wolle clone(){
        return new Wolle(this.farbe, this.material);
    }
}
