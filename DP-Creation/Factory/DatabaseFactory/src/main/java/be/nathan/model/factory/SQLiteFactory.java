package be.nathan.model.factory;

import be.nathan.model.database.DataBaseConnection;
import be.nathan.model.database.SQLiteConnection;

public class SQLiteFactory extends DatabaseFactory {
    @Override
    public DataBaseConnection createConnection() {
        return new SQLiteConnection();
    }
}
