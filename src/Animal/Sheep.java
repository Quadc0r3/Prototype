package Animal;

public class Sheep implements Animal {
    private Wolle wolle;
    private String name;

    public Sheep(String name, String farbe) {
        this.name = name;
        this.wolle = new Wolle(farbe, "Baumwolle");
    }

    public Sheep(Wolle wolle, String name) {
        this.wolle = wolle.clone();
        this.name = name;
    }

    @Override
    public void info() {
        System.out.println("----------");
        System.out.println("Name: " + name);
        System.out.println("Klase: " + this.getClass());
        System.out.println("Wolle: " + wolle);
        wolle.info();
        System.out.println("----------");
    }

    public void setName(String name) {
        this.name = name;
    }

    public void rasieren() {
        wolle.scheeren();
        System.out.println(name + " ist rasiert.");
    }

    @Override
    public Sheep clone() {
        Sheep sheep;
        try {
            sheep = (Sheep) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new RuntimeException(e);
        }
        return sheep;
    }
}
