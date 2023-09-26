package be.nathan.model;

public class MonsterDirector {
    public void constructOrc(MonsterBuilder builder){
        builder.setHealth(100);
        builder.setAttack(10);
        builder.setDefense(10);
        builder.setSpeed(10);
        builder.setLevel(1);
        builder.setXp(10);
        builder.setGold(10);
    }
}
