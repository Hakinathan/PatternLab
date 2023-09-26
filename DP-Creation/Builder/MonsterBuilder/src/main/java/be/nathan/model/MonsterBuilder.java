package be.nathan.model;

public interface MonsterBuilder {
    void setHealth(int health);
    void setAttack(int attack);
    void setDefense(int defense);
    void setSpeed(int speed);
    void setLevel(int level);
    void setXp(int xp);
    void setGold(int gold);

}
