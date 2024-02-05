package be.nathan;

import be.nathan.model.Singleton;

public class Main {
    public static void main(String[] args) {
        Singleton singleton = Singleton.getInstance();
        Singleton anotherSingleton = Singleton.getInstance();

        System.out.println(singleton.value);
        System.out.println(anotherSingleton.value);
    }
}