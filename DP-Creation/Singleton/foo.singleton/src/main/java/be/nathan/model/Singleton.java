package be.nathan.model;

public class Singleton {
    private static Singleton instance = null;
    public String value;

    private Singleton() {
        value = "Foo";
    }

    public static Singleton getInstance() {
        if (instance == null) {
            instance = new Singleton();
        }
        return instance;
    }
}
