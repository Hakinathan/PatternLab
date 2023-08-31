package be.nathan;

import be.nathan.model.enemy.Enemy;
import be.nathan.model.factory.EnemyFactory;
import be.nathan.model.factory.KnightFactory;
import be.nathan.model.factory.OrcFactory;

public class Application {
    public static void main(String[] args) {
        System.out.println("Welcome to enemy factory manager!");

        // This is the factory method pattern in action :)
        EnemyFactory knightFactory = new KnightFactory();
        Enemy enemy = knightFactory.createEnemy();
        enemy.attack();
        enemy.move();
        enemy.die();

        EnemyFactory orcFactory = new OrcFactory();
        Enemy orc = orcFactory.createEnemy();
        orc.attack();
        orc.move();
        orc.die();
    }
}