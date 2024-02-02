package Monster;

import java.util.Map;

public class Monster {
    private int AC;
    private int HP;
    private Size size;
    private int speed;
    private Map<String, Integer> stats;
    private int baseDmg;

    public Monster() {
    }

    public Monster(int HP, Size size) {
        if (HP > 0) {
            this.HP = HP;
        } else {
            System.out.println("Negative HP not possible");
            this.HP = 1;
        }
        this.size = size;
    }

    protected Monster(Monster target) {
        if (target != null) {
            this.HP = target.HP;
            this.size = target.size;
        }
    }

    protected Monster clone() throws CloneNotSupportedException {
        return new Monster(this);
    }

    public void attack(AttackType type) {
        String modifierType = "";
        int modifier;

        switch (type) {
            case HEAVY -> modifierType = "STR";
            case LIGHT, RANGE -> modifierType = "DEX";
            case FINESSE -> modifierType = "MAX";
        }

        if (modifierType.equals("MAX")) {
            modifier = Math.max(stats.get("STR"), stats.get("DEX"));
            modifierType = (modifier == stats.get("STR")) ? "STR" : "DEX";

        } else {
            modifier = stats.get(modifierType);
        }

        //AC check und Damagetype zur simplifikation ausgelassen
        System.out.println(this.getClass() + " attacks with " + modifierType + " and deals " + (modifier + baseDmg) + " points of damage.");
    }

    public void setStats(int STR, int DEX, int CON, int INT, int WIS, int CHA) {
        if (STR >= 0 && STR <= 20) {
            stats.put("STR", STR);
        }
        if (DEX >= 0 && DEX <= 20) {
            stats.put("DEX", DEX);
        }
        if (CON >= 0 && CON <= 20) {
            stats.put("CON", CON);
        }
        if (INT >= 0 && INT <= 20) {
            stats.put("INT", INT);
        }
        if (WIS >= 0 && WIS <= 20) {
            stats.put("WIS", WIS);
        }
        if (CHA >= 0 && CHA <= 20) {
            stats.put("CHA", CHA);
        }
    }

    public void setAC(int AC) {
        this.AC = AC;
    }

    public void setHP(int HP) {
        this.HP = HP;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public void setBaseDmg(int baseDmg) {
        this.baseDmg = baseDmg;
    }
}
