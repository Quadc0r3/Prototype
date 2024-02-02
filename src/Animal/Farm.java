package Animal;
import java.util.HashMap;
import java.util.Map;

public class Farm { //sozusagen die Farm der Tiere
    private Map<String, Animal> farm = new HashMap<>();

    public Farm() {
        //populate farm mit Templates/Prototypes
        Sheep dolly = new Sheep("Dolly", "blau");
        Sheep sally = new Sheep("Sally", "rot", "Baumwolle");
        Pig squealer = new Pig("Squealer", "Propaganda");
        WoolyPig wool_e = new WoolyPig("Wool-E", "gelb");

        farm.put(dolly.getName(), dolly);
        farm.put(sally.getName(), sally);
        farm.put(squealer.getName(), squealer);
        farm.put(wool_e.getName(), wool_e);
    }

    public Animal put(String name, Animal animal){
        farm.put(name, animal);
        return animal; //um mit dem hinzugefügten Tier etwas machen zu können
    }

    public Animal get(String name){
        return farm.get(name).clone();
    }

    public void info(){
        int bewohner = 0;
        System.out.println("\n+++ Farm INFO +++");
        for (Map.Entry<String, Animal> animalEntry : farm.entrySet()){
            bewohner++;
            System.out.println("["+bewohner+"] Name: " + animalEntry.getKey());
            System.out.println("   Klasse: " + animalEntry.getValue().getClass());
        }
        System.out.println("Bewohner: " + bewohner);
        System.out.println();
    }
}
