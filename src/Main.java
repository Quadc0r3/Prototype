import Auto.*;
import Animal.*;
public class Main {
    public static void main(String[] args) throws CloneNotSupportedException {
//        Motor motor = new Motor("General Motors",100,1.6);
//        Auto prototyp = new Auto(motor, Edition.TINY,4);
//        Auto neuesAuto = prototyp.clone();
//
//        compare(prototyp, neuesAuto);
//
//        neuesAuto.tuneMotor();

        Sheep prototyp = new Sheep("Dolly","Blau");
        Sheep clone = prototyp.clone();
        Animal clone2 = prototyp.clone();

        clone.setName("Dolly2");
        clone.info();
        clone2.info();

        clone.rasieren();

        clone.info();
        clone2.info();
    }

    public static void compare(Object obj1, Object obj2){
        System.out.println("+----------------------+");
        System.out.println("|       COMPARE        |");
        System.out.println("+----------------------+");
        System.out.println("Gleiche Referenz? \n - " + (obj1 == obj2) + " (" + obj1 + " - " + obj2 + ")");
        System.out.println("Gleiche Klasse? \n - " + (obj1.getClass() == obj2.getClass()) + " (" + obj1.getClass() + " - " + obj2.getClass() + ")");
//        System.out.println("Gleiche Eigenschaften? \n - " + (obj1.equals(obj2)) + " (" + obj1 + " - " + obj2 + ")");
    }
}