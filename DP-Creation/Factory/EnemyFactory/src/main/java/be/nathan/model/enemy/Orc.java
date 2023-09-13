package be.nathan.model.enemy;

public class Orc implements Enemy {
    @Override
    public void attack() {
        System.out.println("Orc attack!");
    }

    @Override
    public void move() {
        System.out.println("Orc move!");
    }

    @Override
    public void die() {
        System.out.println("Orc die!");
    }
}
