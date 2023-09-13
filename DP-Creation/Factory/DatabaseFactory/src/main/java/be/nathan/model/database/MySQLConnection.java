package be.nathan.model.database;

/**
 * MySQL database connection class
 * This class implements the DataBaseConnection interface
 * This class is used to connect to a MySQL database
 * @see be.nathan.model.database.DataBaseConnection
 */
public class MySQLConnection implements DataBaseConnection{
    @Override
    public void connect() {
        System.out.println("Connecting to MySQL database...");
    }

    @Override
    public void query(String sql) {
        System.out.println("Executing MySQL query: " + sql);
    }

    @Override
    public void close() {
        System.out.println("Closing MySQL database connection...");
    }
}
