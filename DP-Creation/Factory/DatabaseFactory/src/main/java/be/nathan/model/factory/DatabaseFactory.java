package be.nathan.model.factory;

import be.nathan.model.database.DataBaseConnection;
import be.nathan.model.database.DatabaseType;

/**
 * This is the abstract factory class.
 * It will be extended by the concrete factories to return the correct connection.
 */
public abstract class DatabaseFactory {
    /**
     * This is the factory method.
     * It will be implemented by the concrete factories to return the correct connection.
     * @return the correct connection
     */
    public abstract DataBaseConnection createConnection();

    /**
     * Method to get the correct factory for the given database type.
     * @param databaseType MySQL, MongoDB or SQLite
     * @return the correct factory for the given database type or an exception if the type is unknown
     */
    public static DatabaseFactory getDatabaseFactory(DatabaseType databaseType) {
        return switch (databaseType) {
            case MYSQL -> new MySQLFactory();
            case MONGODB -> new MongoDBFactory();
            case SQLITE -> new SQLiteFactory();
        };
    }
}
