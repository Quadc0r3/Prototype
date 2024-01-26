package Auto;

import java.util.Objects;

public class Auto implements Cloneable{
    private Motor motor;
    private Edition edition;
    private final int anzahlSitze;

    public Auto(Motor motor, Edition edition, int anzahlSitze) {
        this.motor = motor;
        this.edition = edition;
        this.anzahlSitze = anzahlSitze;
    }

    public void printInfo(){
        System.out.println("----------");
        System.out.println(anzahlSitze + "-Sitzer PKW, der Auto.Edition " + edition);
        System.out.println("Motorisierung: " + motor);
        motor.printInfo();
        System.out.println("----------");
    }

    public void tuneMotor(){
        motor.setHubraum(3);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Auto auto)) return false;
        return anzahlSitze == auto.anzahlSitze && Objects.equals(motor, auto.motor) && edition == auto.edition;
    }

    @Override
    public int hashCode() {
        return Objects.hash(motor, edition, anzahlSitze);
    }

    @Override
    public Auto clone() throws CloneNotSupportedException{
        try {
            return (Auto) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new AssertionError();
        }
    }
}
