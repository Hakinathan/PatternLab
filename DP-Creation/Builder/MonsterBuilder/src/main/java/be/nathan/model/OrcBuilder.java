package be.nathan.model;

public class OrcBuilder implements MonsterBuilder {

    private int health;
    private int attack;
    private int defense;
    private int speed;
    private int level;
    private int xp;
    private int gold;

    @Override
    public void setHealth(int health) {
        this.health = health;
    }

    @Override
    public void setAttack(int attack) {
        this.attack = attack;
    }

    @Override
    public void setDefense(int defense) {
        this.defense = defense;
    }

    @Override
    public void setSpeed(int speed) {
        this.speed = speed;
    }

    @Override
    public void setLevel(int level) {
        this.level = level;
    }

    @Override
    public void setXp(int xp) {
        this.xp = xp;
    }

    @Override
    public void setGold(int gold) {
        this.gold = gold;
    }

    public Orc getResult(){
        return new Orc(health,attack,defense,speed,level,xp,gold);
    }
}
