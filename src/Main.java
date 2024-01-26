import Animal.*;

import java.util.Scanner;

public class Main {
    private static Farm farmDerTiere;
    public static void main(String[] args) {
        farmDerTiere = new Farm();

        farmDerTiere.info();

        Scanner scanner = new Scanner(System.in);

        System.out.println("\n Welche Clone Methode?");
        System.out.println("[1] Shallow");
        System.out.println("[2] Deep");
        switch (scanner.nextInt()){
            case 1:
                shallow();
                break;
            case 2:
                deep();
                break;
            default:
                return;
        }
    }

    private static void deep(){
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

    private static void shallow(){
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
}