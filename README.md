# Board Game Simulator

A simple Java-based board game simulator where two player compete to reach the finish line first. The game implements a classic race-style board game with dice rolls determinig player movement.


## Description

This project simulates a basic board game where:
* Two players compete.
* Players move by rolloing a six-sided dice.
* The game board has 100 spaces.
* The first player to reach or pass the 100 space wins.


## Getting started

### Prerequisites
* Java JDK 8 or higher.
* Any Java IDE or command line compiler.

### Installation (Bash)

1. Clone the repository 
   
    ```git clone https://github.com/<your-username>/OPP-practice.git```

2. Navigate to the project directory

    ```cd board-game-simulator```

3. Compile the Java files

    ```javac *.java```

4. Run the game

    ```java Main```


## Usage Examples
The game runs automatically after execution, displaying each player's moves:

```
Ronda 1
Ficha de color Rojo: 4
Ficha de color Amarillo: 2

Ronda 2
Ficha de color Rojo: 6
Ficha de color Amarillo: 1

.
.
.

Felicidades, la ficha de color Rojo es la ganadora del juego.

```

## Features
* Automated gameplay simulation.
* Turn-based movement system.
* Random dice-rolls.
* Round counter.
* Winner declaration.
* Support for two players.


## Project Structure
* Main.java: Entry point of the application.
* Tablero.java: Game board implementation.
* Ficha.java: Player piece implementation.
* Dado.java: Dice rolling mechanism.


## Contributing (Bash)
1. Fork the repository.
   
2. Create your feature branch.
   ```
    git checkout -b "feature/amazing-feature"
   ```

3. Commit your changes
    ```
    git commit -m "Add some amazing feature"
    ```

4. Push to the branch
   ```
   git push origin feature/amazing-Feature
   ```

5. Open a Pull Request


### Contribution Ideas
* Add support for more players.
* Implement special squares (Like snakes or ladders)
* Create a GUI.
* Add player names and statistics.
* Implement game state saving/loading.


## License
This project is licensed under the MIT License. Read more information in [LICENSE](/LICENSE).