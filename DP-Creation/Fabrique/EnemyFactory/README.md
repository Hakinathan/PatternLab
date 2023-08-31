# Enemy factory

## Description
This is a simple project to demonstrate the use of the factory design pattern in java. It's just a training project.
The main goal of this project is to create many enemies using the factory design pattern.

## Structure
- `Enemy` is the interface that defines the methods that the enemy classes must implement. In our case, the methods are `attack()`, `move()` and `die()`.
- `Knight` and `Orc` are the classes that implement the `Enemy` interface. Each class implements the methods of the interface according to the type of enemy.
- `EnemyFactory` is the class that implements the factory design pattern.
- `KnightFactory` and `OrcFactory` are the classes that implement the `EnemyFactory` interface. Each class implements the `createEnemy()` method according to the type of enemy.
- `Application` is the class that contains the main method. In this class we create many enemies using the factory design pattern.

I hope this project helps you to understand the factory design pattern. If you have any questions, please let me know. Enjoy it! :)

## Resources
- Refactoring guru Ebook
- [Refactoring guru](https://refactoring.guru/design-patterns/factory-method) website