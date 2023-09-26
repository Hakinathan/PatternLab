package be.nathan.model;

public class Orc {
    private final int health;
    private final int attack;
    private final int defense;
    private final int speed;
    private final int level;
    private final int xp;
    private final int gold;

    public Orc(int health, int attack, int defense, int speed, int level, int xp, int gold) {
        this.health = health;
        this.attack = attack;
        this.defense = defense;
        this.speed = speed;
        this.level = level;
        this.xp = xp;
        this.gold = gold;
    }

    public int getHealth() {
        return health;
    }

    public int getAttack() {
        return attack;
    }

    public int getDefense() {
        return defense;
    }

    public int getSpeed() {
        return speed;
    }

    public int getLevel() {
        return level;
    }

    public int getXp() {
        return xp;
    }

    public int getGold() {
        return gold;
    }

    @Override
    public String toString() {
        return "Orc{" +
                "health=" + health +
                ", attack=" + attack +
                ", defense=" + defense +
                ", speed=" + speed +
                ", level=" + level +
                ", xp=" + xp +
                ", gold=" + gold +
                '}';
    }
}
