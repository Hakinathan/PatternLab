package be.nathan.model.database;

public class SQLiteConnection implements DataBaseConnection {
    @Override
    public void connect() {
        System.out.println("Connecting to SQLite database...");
    }

    @Override
    public void query(String sql) {
        System.out.println("Executing SQLite query: " + sql);
    }

    @Override
    public void close() {
        System.out.println("Closing SQLite database connection...");
    }
}
