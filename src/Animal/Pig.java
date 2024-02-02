package Animal;

public class Pig extends Animal{
    private String antromorphie;

    public Pig(String name, String antromorphie){
        super(name);
        this.antromorphie = antromorphie;
    }

    @Override
    public void info() {
        super.info();
        System.out.println("Antromorphie: " + antromorphie);
    }

//    @Override
//    public Animal clone() {
//        System.out.println("-> Schwein wird geklont.");
//        return super.clone();
//    }
}
