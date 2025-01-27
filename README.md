# Board Game Simulator

## Overview

The **Board Game Simulator** is a project designed to simulate board game mechanics and gameplay. It allows users to set up, play, and test different board games, making it an excellent tool for game enthusiasts, developers, and designers to experiment with game logic and rules.

---

## Features

- **Game Mechanics Simulation:** Simulates various board game mechanics such as turns, dice rolls, and player interactions.
- **Customizable Rules:** Allows users to define and customize game rules.
- **Multi-Player Support:** Simulates games for multiple players.
- **Modular Design:** Built with flexibility to support different types of board games.

---

## Table of Contents

- [Overview](#overview)
- [Features](#features)
- [Installation](#installation)
- [Usage](#usage)
- [Examples](#examples)
- [Testing](#testing)
- [Contributing](#contributing)
- [License](#license)

---

## Installation

Follow these steps to set up and run the project locally:

### Prerequisites
- Python 3.8 or higher
- A virtual environment tool (`venv` or `virtualenv`)

### Steps

1. **Clone the Repository:**
   ```bash
   git clone https://github.com/JPabloA/board-game-simulator.git
   cd board-game-simulator
   ```

2. **Set Up a Virtual Environment:**
   ```bash
   python3 -m venv venv
   source venv/bin/activate  # On Windows: venv\Scripts\activate
   ```

3. **Install Dependencies:**
   ```bash
   pip install -r requirements.txt
   ```

4. **Run the Simulator:**
   ```bash
   python src/main.py
   ```

---

## Usage

1. Launch the simulator by running the main script:
   ```bash
   python src/main.py
   ```
2. Follow the prompts to set up a new game:
   - Choose the number of players.
   - Define game rules (or use default settings).
   - Start the game and take turns.

---

## Examples

### Example Game Session:
```plaintext
Welcome to the Board Game Simulator!
Enter the number of players: 2
Player 1's turn. Roll the dice (Press Enter): 🎲 You rolled a 5.
Player 2's turn. Roll the dice (Press Enter): 🎲 You rolled a 3.
...
Player 1 wins!
```

### Custom Rules Example:
Modify the `rules.json` file to create your own game rules:
```json
{
  "max_turns": 10,
  "win_condition": "first_to_50_points",
  "dice_sides": 6
}
```

---

## Testing

1. **Run Unit Tests:**
   ```bash
   python -m unittest discover tests/
   ```

2. **Run All Tests with Coverage:**
   ```bash
   pytest --cov=src
   ```

---

## Contributing

We welcome contributions to improve this project! Follow these steps to contribute:

1. **Fork the Repository:** Click the "Fork" button at the top-right corner of the repository page.
2. **Clone Your Fork:**
   ```bash
   git clone https://github.com/<your-username>/board-game-simulator.git
   cd board-game-simulator
   ```
3. **Create a Feature Branch:**
   ```bash
   git checkout -b feature/your-feature-name
   ```
4. **Commit Your Changes:**
   ```bash
   git add .
   git commit -m "Add description of your feature"
   ```
5. **Push Your Branch:**
   ```bash
   git push origin feature/your-feature-name
   ```
6. **Submit a Pull Request:** Go to your forked repository, click "Compare & pull request," and describe your changes.

---

## License

This project is licensed under the [MIT License](LICENSE). Feel free to use, modify, and distribute this project.

---

## Contact

For questions, suggestions, or feedback, feel free to open an issue in the repository or contact the repository owner.

---