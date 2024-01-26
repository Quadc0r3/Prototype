package Auto;

public class Motor {
    private String kennung;
    private int ps;
    private double hubraum;

    public Motor(String kennung, int ps, double hubraum) {
        this.kennung = kennung;
        this.ps = ps;
        this.hubraum = hubraum;
    }

    public void printInfo() {
        System.out.println("Auto.Motor: " + kennung);
        System.out.println("PS: " + ps);
        System.out.println("Hubraum: " + hubraum + " Liter");
    }

    public String getKennung() {
        return kennung;
    }

    public void setKennung(String kennung) {
        this.kennung = kennung;
    }

    public int getPs() {
        return ps;
    }

    public void setPs(int ps) {
        this.ps = ps;
    }

    public double getHubraum() {
        return hubraum;
    }

    public void setHubraum(double hubraum) {
        this.hubraum = hubraum;
    }

}
