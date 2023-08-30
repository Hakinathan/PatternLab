package be.nathan.model.database;

/**
 * MongoDB database connection class
 * This class implements the DataBaseConnection interface
 * This class is used to connect to a MongoDB database
 * @see be.nathan.model.database.DataBaseConnection
 */
public class MongoDBConnection implements DataBaseConnection{
    @Override
    public void connect() {
        System.out.println("Connecting to MongoDB database...");
    }

    @Override
    public void query(String sql) {
        System.out.println("Executing MongoDB query: " + sql);
    }

    @Override
    public void close() {
        System.out.println("Closing MongoDB database connection...");
    }
}
