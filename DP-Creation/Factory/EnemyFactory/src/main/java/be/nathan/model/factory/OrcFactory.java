package be.nathan.model.factory;

import be.nathan.model.enemy.Enemy;
import be.nathan.model.enemy.Orc;

public class OrcFactory extends EnemyFactory{
    @Override
    public Enemy createEnemy() {
        return new Orc();
    }
}
