# Database factory

## Description
This is a simple project to demonstrate the use of the factory design pattern in java. It's just a training project.
The main goal of this project is to create and use a database connection using the factory design pattern.

## Structure
- `DatabaseConnection` is the interface that defines the methods that the database connection classes must implement. In our case, the methods are `connect()`, `query()` and `close()`.
- `DatabaseConnectionType` is an enum that defines the types of database connections that we can create. In our case, we have `MySQL`, `MongoDB` and `SQLite`.
- `MongoDBConnection`, `MySQLConnection` and `SQLiteConnection` are the classes that implement the `DatabaseConnection` interface. Each class implements the methods of the interface according to the type of database connection.
- `DatabaseFactory` is the class that implements the factory design pattern.
- `MySQLFactory`, `MongoDBFactory` and `SQLiteFactory` are the classes that implement the `DatabaseFactory` interface. Each class implements the `createConnection()` method according to the type of database connection.
- `Application` is the class that contains the main method. In this class we create a database connection using the factory design pattern.

I hope this project helps you to understand the factory design pattern. If you have any questions, please let me know. Enjoy it! :)

## Resources
- Refactoring guru Ebook
- [Refactoring guru](https://refactoring.guru/design-patterns/factory-method) website