import Animal.*;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Farm farmDerTiere = new Farm();

        farmDerTiere.info();

        Sheep a = (Sheep) farmDerTiere.get("Dolly");
        Animal b = farmDerTiere.get("Squealer");
        Animal c = farmDerTiere.get("Dolly");
        WoolyPig d = (WoolyPig) farmDerTiere.get("Wool-E");
        WoolyPig e = (WoolyPig) farmDerTiere.get("Wool-E");

        a.info();
        b.info();
        c.info();
        d.info();
        e.info();

        a.setName("Dolly 2");
        a.bemalen("grün");
        d.bemalen("pink");
        e.bemalen("lila");

        a.info();
        b.info();
        c.info();
        d.info();
        e.info();
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