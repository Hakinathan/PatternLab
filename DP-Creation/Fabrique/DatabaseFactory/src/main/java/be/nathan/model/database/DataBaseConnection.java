package be.nathan.model.database;

/**
 * Interface for the database connection
 * This interface is implemented by the database connection classes
 * You can connect to the database, query the database and close the connection
 */
public interface DataBaseConnection {
    void connect();
    void query(String sql);
    void close();
}
