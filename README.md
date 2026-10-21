# 3 Java Fundamentals

Solutions to a set of Java exercises from the Lexicon course "Java Fundamentals". The repository is a single Maven project organized into packages by topic — core syntax, strings, and collections — with one class per exercise.

## Features

- Java fundamentals exercises covering variables, control flow, loops, methods, and strings
- A second fundamentals set focused on `String` manipulation (`StringBuilder`, `indexOf`, `substring`, character loops)
- Java Collections exercises (`ArrayList`, `HashSet`, `HashMap`)
- Optional/bonus collections challenges (list rotation, longest consecutive sequence, LRU cache, graph as adjacency list, and more)
- Each exercise is its own runnable class, selectable through a small factory (`Exercise.of(n)`)

## Tech stack

- Java 27
- Maven (no external dependencies)

## Getting started

### Prerequisites

- JDK 27
- Maven (or an IDE with built-in Maven support, e.g. IntelliJ IDEA)

### Installation

```bash
git clone https://github.com/IsaVII/Lex_3_Java_Fundamentals.git
cd Lex_3_Java_Fundamentals
mvn compile
```

### Running

Each package has its own abstract `Exercise` class with a static factory method `Exercise.of(int number)` that returns the matching exercise instance.

[`Main.java`](src/main/java/IsaVII/Main.java) runs one exercise from the `Collections` package:

```java
package IsaVII;

import IsaVII.Exercises.Collections.Exercise;

public class Main {
    void main() {
        // change the numbers to run different exercises
        // or open the exercise class and run it directly
        Exercise exercise = Exercise.of(17);
        exercise.run();
    }
}
```

To run a different exercise:

- Change the number passed to `Exercise.of(...)` in `Main.java`, or
- Point the import at a different package (`Fundamentals_1`, `Fundamentals_2`, or `Collections`), or
- Open any individual `Exercise_N.java` file and run its `main` method directly.

Each package's `Exercise.of(int)` factory only wires up the exercises that have been implemented so far in that topic; optional challenges (`Optional_1` ... `Optional_5` in `Collections`) are run directly rather than through the factory.

## Project structure

```text
3_Java_Fundamentals/
├── pom.xml
└── src/main/
    ├── java/IsaVII/
    │   ├── Main.java                     # Entry point, runs a selected exercise
    │   └── Exercises/
    │       ├── Fundamentals_1/           # Exercises 1-20: variables, loops, conditionals, basic methods
    │       ├── Fundamentals_2/           # Exercises 1-20: String handling (StringBuilder, substring, char loops)
    │       └── Collections/              # Exercises 1-17 + Optional_1-5: ArrayList, HashSet, HashMap, LRU cache, graphs
    └── resources/
        ├── Exercises.md                  # Assignment text for Fundamentals_1
        ├── Exercises-2.md                # Assignment text for Fundamentals_2
        ├── Collections-Exercises.md      # Assignment text for Collections exercises
        └── Collections-Optional-Challenges.md  # Assignment text for the optional collections challenges
```

The `.md` files under `src/main/resources` contain the original exercise descriptions and expected output, and are the source of truth for what each exercise class is meant to do.

## Author

Isa (IsaVII)
