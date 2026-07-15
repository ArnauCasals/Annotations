# Annotations

**Description:**
This project is part of the Java Backend specialization and focuses on learning and practicing Java annotations. It covers the use of built-in annotations such as `@Override`, `@Deprecated`, and `@SuppressWarnings`, helping to improve code readability, maintenance, and developer experience.

---

## 📌 Exercise Statement

### Level 1 - Exercise 1: Override and Deprecated

Create a class hierarchy with the following classes:

* `Worker`
* `OnlineWorker`
* `OnsiteWorker`

The `Worker` class contains the attributes `name`, `surname`, and `hourlyRate`, as well as the method `calculateSalary()`.

The child classes override this method using the `@Override` annotation:

* **OnlineWorker:** Adds a fixed Internet flat rate to the salary.
* **OnsiteWorker:** Adds a shared gasoline allowance to the salary.

Additionally:

* Mark obsolete methods in the child classes using `@Deprecated`.
* Invoke these deprecated methods from the `Main` class.
* Suppress deprecation warnings using `@SuppressWarnings("deprecation")`.

---

## ✨ Features

* Object-Oriented Programming (OOP)
* Inheritance
* Method overriding with `@Override`
* Deprecated methods with `@Deprecated`
* Warning suppression with `@SuppressWarnings`
* Salary calculation for different worker types
* Console demonstration

---

## 🛠 Technologies

* Java 26
* Maven
* IntelliJ IDEA
* Git & GitHub

---

## 🚀 Installation & Execution

1. Clone the repository:

```bash
git clone https://github.com/ArnauCasals/Annotations.git
```

2. Open the project with IntelliJ IDEA.

3. Build the project using Maven.

4. Run the `Main` class located in:

```text
src/main/java/level1/exercise1/Main.java
```

---

## 📂 Project Structure

```text
Annotations
├── README.md
├── pom.xml
└── src
    ├── main
    │   ├── java
    │   │   ├── level1
    │   │   │   ├── exercise1
    │   │   │   │   ├── Main.java
    │   │   │   │   ├── Worker.java
    │   │   │   │   ├── OnlineWorker.java
    │   │   │   │   └── OnsiteWorker.java
    │   │   │   └── exercise2
    │   │   │       ├── Main.java
    │   │   │       ├── Worker.java
    │   │   │       ├── OnlineWorker.java
    │   │   │       └── OnsiteWorker.java
    │   │   └── org
    │   │       └── example
    │   │           └── Main.java
    │   └── resources
    └── test
        └── java

```

---

## 📸 Demo

Example output:

```text
=== Salaries ===
Arnau salary: 3240.0
Paco salary: 4900.0

=== Deprecated methods ===
Using the old internet connection.
Using the old fuel reimbursement system.
```

---

## 🧩 Technical Notes

This project demonstrates:

* Method overriding using inheritance.
* Java built-in annotations.
* The purpose of marking obsolete methods with `@Deprecated`.
* How to suppress compiler warnings with `@SuppressWarnings`.
* Basic polymorphism through a worker class hierarchy.
