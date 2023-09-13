package be.nathan.model.enemy;

public class Knight implements Enemy {
    @Override
    public void attack() {
        System.out.println("Knight attack!");
    }

    @Override
    public void move() {
        System.out.println("Knight move!");
    }

    @Override
    public void die() {
        System.out.println("Knight die!");
    }
}
