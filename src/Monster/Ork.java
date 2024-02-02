package Monster;

public class Ork extends Monster {
    private int tuskLen;

    private Ork(Ork target) {
        try {
            super.clone();
        } catch (CloneNotSupportedException e) {
            System.out.println("Orc not cloned");
        }
        this.tuskLen = target.tuskLen;
    }

    public Ork(int HP, int tuskLen){
        super(HP, Size.MEDIUM);
        this.tuskLen = tuskLen;
    }

    @Override
    public Monster clone() {
        return new Ork(this);
    }
}
