package be.nathan.model.factory;

import be.nathan.model.database.DataBaseConnection;
import be.nathan.model.database.MySQLConnection;

public class MySQLFactory extends DatabaseFactory {
    @Override
    public DataBaseConnection createConnection() {
        return new MySQLConnection();
    }
}
