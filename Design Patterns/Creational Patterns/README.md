
# Understanding Creational Design Patterns: Building Objects Effectively

This repository contains examples of various design patterns implemented in Java. Each pattern has its own separate directory containing the Java source files and a `Client.java` file to demonstrate its usage. Below are the patterns covered in this repository:
- Factory Method Pattern
- Abstract Factory Pattern
- Singleton Pattern
- Prototype Pattern
- Builder Pattern
- Object Pool Pattern
- Lazy Initialization Pattern

## Prerequisites
Java Development Kit (JDK) 8 or higher

## How to Use
1. Clone the repository to your local machine:
```
git clone <repository_url>
```
2. Navigate to the directory of the pattern you want to test:
```
cd <pattern_directory>
```
3. Compile the Java files:
```
javac *.java
```
4. Run the `Client` class to see the pattern in action:
```
java Client
```
## Examples
### Factory Method Pattern
The **Factory Method Pattern** provides an interface for creating objects but allows subclasses to decide which class to instantiate. This pattern promotes loose coupling and encapsulation.

- Directory: `Factory Method Pattern`

### Abstract Factory Pattern
The **Abstract Factory Pattern** provides an interface for creating families of related or dependent objects without specifying their concrete classes. It is used to create object hierarchies where the products are designed to work together.

- Directory: `Abstract Factory Pattern`

### Singleton Pattern
The **Singleton Pattern** ensures that a class has only one instance and provides a global access point to that instance. It is often used for creating shared resources and managing global state.

- Directory: `Singleton Pattern`

### Prototype Pattern
The **Prototype Pattern** allows creating new objects by copying an existing object, known as the prototype. This pattern is useful when the cost of creating a new instance is expensive, and it is more efficient to clone an existing instance.

- Directory: `Prototype Pattern`

### Builder Pattern
The **Builder Pattern** separates the construction of a complex object from its representation, allowing the same construction process to create different representations. It simplifies the object creation process and enhances the readability of code.

- Directory: `Builder Pattern`

### Object Pool Pattern
The **Object Pool Pattern** manages a pool of reusable objects, which can be acquired and released as needed. This pattern helps to reduce the overhead of creating and destroying objects frequently, particularly in resource-intensive applications.

- Directory: `Object Pool Pattern`

### Lazy Initialization Pattern
The **Lazy Initialization Pattern** defers the creation of an object until it is first needed. It ensures that the object is created only when it is required, thereby optimizing memory usage and improving application startup time.

- Directory: `Lazy Initialization Pattern`

## Feedback
If you have any suggestions or improvements, feel free to open an issue or submit a pull request. Your feedback is highly appreciated!

Enjoy exploring the world of design patterns in Java!
