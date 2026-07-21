# Annotations

## Description

This project is part of the Java Backend specialization and focuses on learning and practicing Java annotations.

It covers the use of built-in annotations such as:

- `@Override`
- `@Deprecated`
- `@SuppressWarnings`

These annotations help improve code readability, maintenance, and developer experience.

---

# Level 1 - Exercise 1: Override

## Description

Create a class hierarchy representing different types of workers.

The project contains:

- `Worker`
- `OnlineWorker`
- `OnsiteWorker`

The parent class contains the attributes:

- `name`
- `surname`
- `hourlyRate`

and the method:

```java
calculateSalary()
```

The child classes override this method using the `@Override` annotation.

### Features

- ✅ Object-Oriented Programming
- ✅ Inheritance
- ✅ Method overriding with `@Override`
- ✅ Polymorphism
- ✅ Different salary calculations

### Salary Rules

**OnlineWorker**

Adds a fixed Internet flat rate to the salary.

**OnsiteWorker**

Adds a shared gasoline allowance to the salary.

---

# Level 1 - Exercise 2: Deprecated Methods

## Description

This exercise extends the previous worker hierarchy by adding obsolete methods.

Some methods in the child classes are marked as deprecated using the `@Deprecated` annotation.

These methods are then called from an external class while suppressing the generated warnings using `@SuppressWarnings`.

### Features

- ✅ Deprecated methods with `@Deprecated`
- ✅ Warning suppression with `@SuppressWarnings`
- ✅ Understanding obsolete API management
- ✅ External invocation of deprecated methods

---

## Example Output

```text
=== Salaries ===
Arnau salary: 3240.0
Paco salary: 4900.0

=== Deprecated methods ===
Using the old internet connection.
Using the old fuel reimbursement system.
```

---

# Technologies

- Java 21
- Maven
- IntelliJ IDEA
- Git & GitHub

---

# Installation & Execution

1. Clone the repository:

```bash
git clone https://github.com/ArnauCasals/Annotations.git
```

2. Open the project with IntelliJ IDEA.

3. Compile using Maven:

```bash
mvn clean compile
```

4. Run the corresponding `Main` class.

---

# Project Structure

```text
Annotations
├── README.md
├── pom.xml
└── src
    └── main
        └── java
            └── level1
                ├── exercise1
                │   ├── Main.java
                │   ├── Worker.java
                │   ├── OnlineWorker.java
                │   └── OnsiteWorker.java
                └── exercise2
                    ├── Main.java
                    ├── Worker.java
                    ├── OnlineWorker.java
                    └── OnsiteWorker.java
```

---

# Technical Notes

This project demonstrates:

- The use of Java annotations.
- Method overriding with `@Override`.
- How `@Deprecated` marks methods that should no longer be used.
- How `@SuppressWarnings("deprecation")` hides warnings when deprecated methods are intentionally called.
- Basic inheritance and polymorphism.