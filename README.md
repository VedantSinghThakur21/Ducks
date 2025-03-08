# Strategy Pattern - Duck Behavior Simulation

## Overview
This project demonstrates the **Strategy Design Pattern** to simulate various behaviors of different types of ducks. The behaviors are encapsulated into separate interfaces and concrete classes, allowing dynamic changes without modifying the duck classes.

## Features
- Implements **FlyBehavior** and **SwimBehavior** interfaces.
- Concrete classes for different flying and swimming behaviors.
- Abstract `Duck` class with dynamically assigned behaviors.
- Four types of ducks: **MallardDuck, RedheadDuck, RubberDuck, DecoyDuck**.
- Follows **SOLID principles** and **Object-Oriented Programming** (OOP) best practices.

## Class Structure
### 1. **Interfaces**
- `FlyBehavior`: Defines the `fly()` method.
- `SwimBehavior`: Defines the `swim()` method.

### 2. **Concrete Fly Behaviors**
- `Fly`: Ducks that can fly.
- `NotFly`: Ducks that cannot fly.

### 3. **Concrete Swim Behaviors**
- `Swim`: Ducks that swim normally.
- `Float`: Ducks that float (e.g., Rubber Duck).
- `Drown`: Ducks that drown (e.g., Decoy Duck).

### 4. **Abstract Class**
- `Duck`: Contains a `FlyBehavior` and `SwimBehavior` object, which can be dynamically assigned.

### 5. **Concrete Duck Classes**
- `MallardDuck`: Can fly and swim.
- `RedheadDuck`: Can fly and swim.
- `RubberDuck`: Cannot fly but floats.
- `DecoyDuck`: Cannot fly and drowns.

## Installation & Execution
### Prerequisites:
- **Java JDK 11+**
- **IntelliJ IDEA (Professional Edition recommended for UML diagrams)**

### Steps to Run:
1. Clone the repository:
   ```sh
   git clone https://github.com/yourusername/StrategyPattern-Duck.git
   ```
2. Open the project in IntelliJ.
3. Compile and run `DuckSimulator.java`.
4. Observe the output for each duck's behavior.

## Output Example
```
I am a Mallard Duck
I can fly!
I am swimming!
----------------------
I am a Redhead Duck
I can fly!
I am swimming!
----------------------
I am a Rubber Duck
I cannot fly!
I am floating!
----------------------
I am a Decoy Duck
I cannot fly!
I am drowning!
----------------------
```


## Contribution Guidelines
1. Fork the repository.
2. Create a feature branch (`feature-new_behavior`).
3. Commit changes with descriptive messages.
4. Open a pull request for review.

## Repository Link
[GitHub Repository](https://github.com/yourusername/StrategyPattern-Duck)

## Author
- **Name:** Vedant Singh Thakur
- **PRN:** 23070126144
- **Batch:** AIML B3

