package be.nathan;

import be.nathan.model.database.DataBaseConnection;
import be.nathan.model.database.DatabaseType;
import be.nathan.model.factory.DatabaseFactory;
import be.nathan.model.factory.MongoDBFactory;
import be.nathan.model.factory.MySQLFactory;

/**
 * This is the main class of the application.
 * It will create a MySQL connection and a MongoDB connection.
 * The factory pattern is used to create the connections and hide the implementation details.
 */
public class Application {
    public static void main(String[] args) {
        System.out.println("Welcome to database factory manager!");

        // This is the factory method pattern in action :)
        DatabaseFactory mySQLFactory = new MySQLFactory();
        DataBaseConnection connection = mySQLFactory.createConnection();
        connection.connect();
        connection.query("SELECT * FROM zone 51 table WHERE aliens = 1");
        connection.close();

        DatabaseFactory mongoFactory = new MongoDBFactory();
        DataBaseConnection connection2 = mongoFactory.createConnection();
        connection2.connect();
        connection2.query("SELECT * FROM zone 51 table WHERE aliens = 1");
        connection2.close();

        // Better way to do it for me :
        DatabaseFactory SQLiteFactory = DatabaseFactory.getDatabaseFactory(DatabaseType.SQLITE);
        DataBaseConnection SQLiteConnection = SQLiteFactory.createConnection();
        SQLiteConnection.connect();
        SQLiteConnection.query("SELECT * FROM zone 51 table WHERE aliens = 1");
        SQLiteConnection.close();
    }
}