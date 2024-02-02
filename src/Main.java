import Animal.*;
import Monster.*;

import java.util.Scanner;

public class Main {
    private static Farm farmDerTiere;

    public static void main(String[] args) {
        farmDerTiere = new Farm();

        farmDerTiere.info();

        Scanner scanner = new Scanner(System.in);

        System.out.println("\n Welche Clone Methode?");
        System.out.println("- Mit Clonable -");
        System.out.println("[1] Shallow");
        System.out.println("[2] Deep");
        System.out.println("\n- selbs implementiert");
        System.out.println("[3] test");
        switch (scanner.nextInt()) {
            case 1:
                shallow();
                break;
            case 2:
                deep();
                break;
            case 3:
                deepMonster();
                break;
            case 4:
                shallowMonster();
                break;
            default:
                return;
        }
    }


    private static void deep() {
        WoolyPig a = (WoolyPig) farmDerTiere.get("Wool-E");
        WoolyPig b = (WoolyPig) farmDerTiere.get("Wool-E");
        b.setName("Wool-E 2");

        a.info();
        b.info();
        System.out.println();

        a.bemalen("rot");

        a.info();
        b.info();
    }

    private static void shallow() {
        Sheep a = (Sheep) farmDerTiere.get("Dolly");
        Sheep b = (Sheep) farmDerTiere.get("Dolly");
        b.setName("Dolly 2"); //primitive Datentypen werden nicht allgemein überschrieben

        a.info();
        b.info();
        System.out.println();

        a.bemalen("rot"); //Komplexe Datentypen schon

        a.info();
        b.info();

    }

    private static void deepMonster(){
        Ork o = new Ork(50,7);
        Nothic n = (Nothic) new Monster(45,Size.MEDIUM);
        n.setStats(14,16,16,13,10,8);

    }

    private static void shallowMonster() {

    }
}