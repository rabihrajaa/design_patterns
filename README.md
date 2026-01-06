# Design Patterns Exercises

This project implements two exercises on design patterns as specified in the assignment.

## Exercise 1: Class Diagrams and Design Patterns

### Situation 1: Composite Pattern
**Design Pattern:** Composite  
**Description:** A figure can be a circle, rectangle, or a group of figures. This hierarchical structure is modeled using the Composite pattern.

**Class Diagram:**
```
Figure (Interface)
├── draw()

Circle (Leaf)
├── draw()

Rectangle (Leaf)
├── draw()

CompositeFigure (Composite)
├── addFigure(Figure)
├── removeFigure(Figure)
├── draw()  // Iterates over children and calls draw()
```

**Explanation:** The `Figure` interface defines the common `draw()` method. `Circle` and `Rectangle` are leaf nodes implementing the interface. `CompositeFigure` is a composite that can contain other figures and implements `draw()` by delegating to its children.

### Situation 2: Template Method and Factory Method Patterns
**Design Patterns:** Template Method, Factory Method  
**Description:** A plugin contains an algorithm skeleton with two variable parts. Developers implement the parts, and the client instantiates without knowing the concrete class.

**Class Diagram:**
```
Plugin (Abstract Class)
├── executeAlgorithm()  // Template method
├── partie1()  // Abstract
├── partie2()  // Abstract

PluginFactory (Interface)
├── createPlugin(): Plugin

ConcretePlugin (Concrete Class)
├── partie1()
├── partie2()

PluginFactoryImpl (Concrete Factory)
├── createPlugin(): Plugin
```

**Explanation:** `Plugin` defines the algorithm skeleton in `executeAlgorithm()`. `ConcretePlugin` implements the variable parts. `PluginFactory` allows instantiation without knowing the concrete class, implemented by `PluginFactoryImpl`.

### Situation 3: Decorator Pattern
**Design Pattern:** Decorator  
**Description:** Attach additional responsibilities to a component implementing `Traitement` without modifying its code, wrapping the execution before and after.

**Class Diagram:**
```
Traitement (Interface)
├── traitement()

Composant (Concrete Component)
├── traitement()

Decorator (Abstract Decorator)
├── traitement()  // Calls component.traitement()

ConcreteDecorator (Concrete Decorator)
├── traitement()  // Adds before/after logic
```

**Explanation:** `Traitement` defines the operation. `Composant` is the core implementation. `Decorator` wraps a `Traitement` and delegates, while `ConcreteDecorator` adds specific responsibilities before and after the call.

### Situation 4: Observer Pattern
**Design Pattern:** Observer  
**Description:** The `Joueur` class has a score that changes, and environment objects (Couloir, Camera, Gardien) are notified while maintaining loose coupling.

**Class Diagram:**
```
Subject (Interface)
├── attach(Observer)
├── detach(Observer)
├── notifyObservers()

Observer (Interface)
├── update(int score)

Joueur (Concrete Subject)
├── setScore(int)
├── getScore()
├── attach(Observer)
├── detach(Observer)
├── notifyObservers()

Couloir (Concrete Observer)
├── update(int score)

Camera (Concrete Observer)
├── update(int score)

Gardien (Concrete Observer)
├── update(int score)
```

**Explanation:** `Subject` defines the interface for attaching/detaching observers and notifying them. `Observer` defines the update method. `Joueur` implements `Subject` and notifies observers when score changes. The observer classes react to score updates.

## Exercise 2: Image Processing Framework

**Design Patterns Used:**
- Strategy (for Filter)
- Template Method (for Compressor)
- Adapter (for ImplNonStandard)

**Class Diagram:**
```
Filter (Interface)
├── filter(int[]): int[]

Compressor (Interface)
├── compress(int[]): int[]

AbstractCompressor (Abstract Class)
├── compress(int[])  // Template method
├── prepareData(int[])
├── performCompression(int[])  // Abstract
├── finalizeCompression(int[])

ImageProcessor (Context)
├── setFilter(Filter)
├── setCompressor(Compressor)
├── processImage(int[]): int[]

ImplNonStandard (Legacy Class)
├── appliquerFiltre(String, int[]): int[]

FilterAdapter (Adapter)
├── filter(int[]): int[]  // Adapts appliquerFiltre

ConcreteFilter (Concrete Strategy)
├── filter(int[]): int[]

ConcreteCompressor (Concrete Class)
├── performCompression(int[]): int[]
```

**Explanation:**
- **Strategy Pattern:** `Filter` interface allows dynamic switching of filter implementations at runtime.
- **Template Method:** `AbstractCompressor` defines the compression skeleton, delegating details to subclasses.
- **Adapter Pattern:** `FilterAdapter` adapts the legacy `ImplNonStandard` to the `Filter` interface.
- **Open/Closed Principle:** The framework is open for extension (new filters/compressors) but closed for modification.
- The application in `Main.java` uses reflection to instantiate user-specified classes dynamically.

### Running the Application
Compile and run `Main.java`. The application will prompt for:
- Filter class name (e.g., `rabih.rajaa.ex2.ConcreteFilter`)
- Compressor class name (e.g., `rabih.rajaa.ex2.ConcreteCompressor`)

It will then process a sample image array using the specified implementations.
