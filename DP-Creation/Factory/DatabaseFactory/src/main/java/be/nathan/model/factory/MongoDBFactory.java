package be.nathan.model.factory;

import be.nathan.model.database.DataBaseConnection;
import be.nathan.model.database.MongoDBConnection;

/**
 * This is a concrete factory class.
 * She will return a MongoDB connection without exposing the logic.
 */
public class MongoDBFactory extends DatabaseFactory{
    @Override
    public DataBaseConnection createConnection() {
        return new MongoDBConnection();
    }
}
