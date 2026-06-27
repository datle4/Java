# Java Learning

This repository contains my Java learning journey, focused on practicing core Java concepts through coding exercises.

## Repository Structure

```text
exercise/
├── hello-world/
├── two-fer/
├── jedliks-toy-car/
├── squeaky-clean/
└── ...
```

Each folder inside `exercise/` is a separate Java practice exercise.

## About This Repository

The main purpose of this repository is to improve my Java programming skills through hands-on practice.

Topics covered include:

* Java syntax
* Classes and methods
* Object-oriented programming
* Access modifiers
* Static and instance members
* Exception handling
* Unit testing
* Clean code habits
* Problem solving

Most exercises are from the Java track on Exercism.

## Exercise Folder Structure

A typical exercise folder contains:

```text
exercise/
└── hello-world/
    ├── src/
    │   ├── main/
    │   │   └── java/
    │   │       └── Greeter.java
    │   └── test/
    │       └── java/
    │           └── GreeterTest.java
    ├── build.gradle
    ├── gradlew
    ├── README.md
    ├── HELP.md
    └── HINTS.md
```

Explanation:

```text
src/main/java   -> solution code
src/test/java   -> test cases
build.gradle    -> Gradle configuration
README.md       -> exercise instructions
```

## How to Run Tests

Go to a specific exercise folder:

```bash
cd exercise/hello-world
```

Run the tests:

```bash
./gradlew test
```

If `gradlew` does not have permission to run on macOS or Linux, run:

```bash
chmod +x gradlew
./gradlew test
```

If the tests pass, Gradle will show:

```text
BUILD SUCCESSFUL
```

## How to Submit to Exercism

Inside the exercise folder, submit the solution file:

```bash
exercism submit src/main/java/Greeter.java
```

The solution file name depends on the exercise.

Examples:

```bash
exercism submit src/main/java/Greeter.java
exercism submit src/main/java/JedliksToyCar.java
exercism submit src/main/java/SqueakyClean.java
```

## Useful Exercism Commands

Download an exercise:

```bash
exercism download --exercise=hello-world --track=java
```

Download another exercise:

```bash
exercism download --exercise=jedliks-toy-car --track=java
```

Because this repository is already dedicated to Java learning, exercise folders are stored directly inside:

```text
exercises/
```

If Exercism downloads exercises into `exercise/java/`, move the exercise folder up one level:

```bash
mv exercises/java/hello-world exercises/
```

Then remove the empty `java` folder if needed:

```bash
rmdir exercises/java
```

## Git Workflow

After finishing or updating an exercise:

```bash
git status
git add .
git commit -m "Complete Java exercise"
git push
```

## Notes

This repository is mainly used for learning and practice.

The goal is not only to pass the tests, but also to understand the Java concepts behind each exercise.
