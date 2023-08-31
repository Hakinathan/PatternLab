package be.nathan.model.factory;

import be.nathan.model.enemy.Enemy;
import be.nathan.model.enemy.Knight;

public class KnightFactory extends EnemyFactory {
    @Override
    public Enemy createEnemy() {
        return new Knight();
    }
}
