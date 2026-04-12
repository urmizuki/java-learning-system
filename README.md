# Java Fundamentals

Hands-on Java repository focused on building strong software engineering fundamentals through iterative practice, object-oriented modeling, and clean implementation habits.

## Engineering Focus

This codebase is my working lab for turning core Java theory into implementation decisions:

- **Object-oriented modeling** with classes that represent domain entities (`Customer`, `Order`, `Course`, `Salary`, `Car`)
- **Encapsulation practice** via private state, constructor design, getters/setters, and controlled mutation
- **Defensive programming** with input validation and explicit error handling (for example in `Car`)
- **Incremental design refinement** through small executable test drivers (`TestCourse`, `TestSalary`, `TestCustomerOrder`, `TestCar`)

## Repository Structure

```text
src/
  Main.java                  # top-level entry example
  oop/                       # OOP modeling and relationship exercises
  exercises/                 # focused Java practice problems
bin/                         # compiled output (ignored in git)
```

## Design & OOP Practice Highlights

1. **Association modeling**: `Customer` and `Order` model object relationships and constructor-overload usage.
2. **State + behavior cohesion**: `Salary` combines data (`hours`, `rate`) with business logic (`computeSalary`).
3. **Dynamic structure management**: `Course` grows internal storage and supports add/drop operations.
4. **Validation-first entities**: `Car` enforces non-null/non-blank brand and non-negative age constraints.

## Running the Project

From the repository root:

```bash
mkdir -p bin
javac -d bin src/oop/*.java src/exercises/*.java src/Main.java
```

Run selected demos:

```bash
java -cp bin labProgramming.TestCustomerOrder
java -cp bin labProgramming.TestCourse
java -cp bin labProgramming.TestSalary
java -cp bin selfExercise.TestCar
```

## Why This Repository Matters

This project reflects an engineering learning journey: not just writing Java syntax, but practicing how to model problems, enforce invariants, and evolve code in small, testable steps—the same mindset used in production software teams.
