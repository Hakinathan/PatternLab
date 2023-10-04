package be.nathan;

import be.nathan.model.Clone;

public class Main {
    public static void main(String[] args) {
        Clone Rex = new Clone("Rex", "501", "Coruscant");

        Clone copy = Rex.clone();
        copy.setName("Copy");

        System.out.println(Rex.getName());
        System.out.println(copy.getName());
        System.out.println(Rex.getLegion());
        System.out.println(copy.getLegion());
    }
}