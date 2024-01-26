package Animal;

public class Wolle implements Cloneable {
    private String farbe;
    private String material;
    private double wachstum;

    public Wolle(String farbe, String material) {
        this.farbe = farbe;
        this.material = material;
        wachstum = 1d;
    }

    public void wachsen(){
        wachstum = Math.min(wachstum * 1.25, 1);
        System.out.println("Wolle ist zu " + wachstum * 100 + "% gewachsen.");
    }

    public void info(){
        System.out.println("Farbe: " + farbe);
        System.out.println("Material: " + material);
        System.out.println("Fülle: " + (wachstum * 100) + "%");
    }


    public void scheeren(){
        wachstum = 0;
    }

    @Override
    public Wolle clone() {
        try {
            Wolle clone = (Wolle) super.clone();
            // TODO: copy mutable state here, so the clone can't change the internals of the original
            return clone;
        } catch (CloneNotSupportedException e) {
            throw new AssertionError();
        }
    }
}
