# Java Learning System

A menu-driven Java fundamentals project for practicing object-oriented programming, data modeling, input handling, and small-scale console application design.

![Java](https://img.shields.io/badge/Java-17%2B-blue)
![Build](https://img.shields.io/badge/Build-Maven-C71A36)
![Interface](https://img.shields.io/badge/Interface-CLI-2F855A)

## Overview

`java-learning-system` brings several beginner-to-intermediate Java exercises under one interactive command-line application. Instead of treating each class as a standalone file, the project groups related concepts into small workflows such as customer-order relationships, course registration, salary calculation, and validation-focused object design.

The repository is useful for learning how core Java syntax translates into working programs with state, behavior, input validation, and reusable class design.

## System Perspective

## Demo

```text
=== Java Fundamentals Learning System ===
1. Core OOP module
2. Practice module
3. Exit

--- Core OOP Module ---
1. Customer -> Order workflow
2. Course registration system
3. Salary calculation
4. Back
```

## What This Project Covers

| Module | Focus | Examples |
| --- | --- | --- |
| Core OOP module | Relationships, encapsulation, state changes | `Customer`, `Order`, `Course`, `Salary` |
| Practice module | Input handling and basic class exercises | `Car`, `Exercise1`, `Halo` |
| Test drivers | Small runnable demos for each topic | `TestCustomerOrder`, `TestCourse`, `TestSalary`, `TestCar` |

## Features

- Interactive CLI launcher in `src/Main.java`
- Menu-based navigation between OOP and practice modules
- Customer and order workflow demonstrating object association
- Course registration flow with add/drop student behavior
- Salary calculator using basic business logic
- Car model with constructor defaults and validation rules
- Standalone demo classes for focused learning and experimentation

## Prerequisites

- Java 17 or newer
- Maven 3.x

## Getting Started

Clone the repository and compile the project from the root directory:

```bash
git clone <your-repository-url>
cd java-learning-system
mvn -q -DskipTests compile
```

## Common Commands

| Command | Purpose |
| --- | --- |
| `mvn -q -DskipTests compile` | Compile all Java sources |
| `mvn -q -DskipTests -Dexec.mainClass=Main exec:java` | Run the interactive learning system |
| `mvn -q -DskipTests -Dexec.mainClass=oop.TestCustomerOrder exec:java` | Run the customer/order association demo |
| `mvn -q -DskipTests -Dexec.mainClass=oop.TestCourse exec:java` | Run the course registration demo |
| `mvn -q -DskipTests -Dexec.mainClass=oop.TestSalary exec:java` | Run the salary calculation demo |
| `mvn -q -DskipTests -Dexec.mainClass=exercises.TestCar exec:java` | Run the car validation demo |

## Usage

Run the main application:

```bash
mvn -q -DskipTests -Dexec.mainClass=Main exec:java
```

The application starts with a top-level menu:

- `Core OOP module` for object-oriented workflows and class interaction
- `Practice module` for smaller exercises and validation examples
- `Exit` to close the application

## Example Learning Flows

### Customer -> Order Workflow

Create a customer, attach an order, and print the linked summary.

```text
Customer ID: 101
Customer name: Alif
Order number: 5001
Customer ID   : 101
Customer Name : Alif
Order Number  : 5001
```

### Course Registration System

Create a course, register students, remove a student, and inspect the roster.

```text
Course name: SE 101
Student name to register: Alif
Student name to register: Luqman
Student name to drop: Alif
Course: SE 101
Total students: 1
Roster:
- Luqman
```

### Car Validation Demo

The `Car` class demonstrates constructor defaults, setters, and defensive validation.

```text
=== Validation Demo ===
Blank brand rejected: Brand must not be blank
Null brand rejected: Brand must not be null
Negative age rejected: Age must be non-negative
```

## Project Structure

```text
java-learning-system/
├── pom.xml
├── README.md
├── src/
│   ├── Main.java
│   ├── exercises/
│   │   ├── Car.java
│   │   ├── Exercise1.java
│   │   ├── Halo.java
│   │   └── TestCar.java
│   └── oop/
│       ├── Course.java
│       ├── Customer.java
│       ├── Order.java
│       ├── Salary.java
│       ├── TestCourse.java
│       ├── TestCustomerOrder.java
│       ├── TestSalary.java
│       └── ...
└── target/
```

## How It Works

1. The user launches `Main` through Maven.
2. The CLI displays the main menu and routes the user into a learning module.
3. Each module creates or manipulates domain objects such as `Customer`, `Order`, `Course`, `Salary`, and `Car`.
4. Results are printed immediately so the user can observe object behavior and program flow.

## Technical Notes

- The project uses a Maven `pom.xml` with a custom `src` source directory instead of the default `src/main/java` layout.
- Java source and target compatibility are set to `17`.
- The `exec-maven-plugin` is used to run individual entry points from the command line.

## Contributing

Contributions that improve code clarity, learning value, validation, or project organization are appropriate.

Before opening a pull request:

1. Compile the project with `mvn -q -DskipTests compile`.
2. Run the relevant demo class or the main CLI flow.
3. Keep changes focused and easy to review.

## License

This repository does not currently include a `LICENSE` file. If you plan to share or distribute it publicly, add an explicit license first.
