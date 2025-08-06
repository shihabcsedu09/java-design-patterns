# Java Design Patterns

A comprehensive collection of **23 classic design patterns** implemented in Java with detailed documentation, examples, and educational resources.

## 🎯 Overview

This repository serves as a complete learning resource for Java design patterns. Each pattern is:
- ✅ **Fully implemented** with working code examples
- ✅ **Well-documented** with detailed explanations
- ✅ **Educational** with class diagrams and usage examples
- ✅ **Production-ready** with proper JavaDocs and comments

## 📚 Implemented Patterns

### 🏗️ Creational Patterns (5)
*Patterns that deal with object creation mechanisms*

- [**Factory Method**](src/main/java/creational/factory/README.md) - Create objects without specifying exact classes
- [**Singleton**](src/main/java/creational/singleton/README.md) - Ensure only one instance exists
- [**Abstract Factory**](src/main/java/creational/abstractfactory/README.md) - Create families of related objects
- [**Builder**](src/main/java/creational/builder/README.md) - Construct complex objects step by step
- [**Prototype**](src/main/java/creational/prototype/README.md) - Clone existing objects

### 🏛️ Structural Patterns (7)
*Patterns that deal with object composition and relationships*

- [**Decorator**](src/main/java/structural/decorator/README.md) - Add behavior to objects dynamically
- [**Adapter**](src/main/java/structural/adapter/README.md) - Make incompatible interfaces work together
- [**Bridge**](src/main/java/structural/bridge/README.md) - Split abstraction from implementation
- [**Composite**](src/main/java/structural/composite/README.md) - Treat individual and composite objects uniformly
- [**Facade**](src/main/java/structural/facade/README.md) - Provide simplified interface to complex subsystem
- [**Flyweight**](src/main/java/structural/flyweight/README.md) - Share common parts of state between objects
- [**Proxy**](src/main/java/structural/proxy/README.md) - Provide substitute or placeholder for another object

### 🎭 Behavioral Patterns (11)
*Patterns that deal with communication between objects*

- [**Chain of Responsibility**](src/main/java/behavioral/chainofresponsibility/README.md) - Pass requests along handler chain
- [**Command**](src/main/java/behavioral/command/README.md) - Encapsulate request as object
- [**Interpreter**](src/main/java/behavioral/interpreter/README.md) - Define grammar representation and interpreter
- [**Iterator**](src/main/java/behavioral/iterator/README.md) - Access collection elements without exposing structure
- [**Mediator**](src/main/java/behavioral/mediator/README.md) - Reduce coupling between components
- [**Memento**](src/main/java/behavioral/memento/README.md) - Save and restore object state
- [**Observer**](src/main/java/behavioral/observer/README.md) - Notify multiple objects about events
- [**State**](src/main/java/behavioral/state/README.md) - Alter object behavior when state changes
- [**Strategy**](src/main/java/behavioral/strategy/README.md) - Define family of algorithms
- [**Template Method**](src/main/java/behavioral/templatemethod/README.md) - Define algorithm skeleton in method
- [**Visitor**](src/main/java/behavioral/visitor/README.md) - Separate algorithms from objects

## 🚀 Getting Started

### Prerequisites
- Java 8 or higher
- Maven (for building)

### Quick Start
```bash
# Clone the repository
git clone https://github.com/shihabcsedu09/java-design-patterns.git

# Navigate to the project
cd java-design-patterns

# Build the project
mvn compile
```

## 📖 How to Use

1. **Browse Patterns**: Each pattern has its own folder under `src/main/java/`
2. **Read Documentation**: Every pattern includes a detailed README with:
   - Pattern explanation and purpose
   - Implementation details
   - Class diagrams (Mermaid)
   - Usage examples
   - When to use guidance
3. **Run Examples**: Each pattern has a main `App.java` file demonstrating usage
4. **Study Code**: Well-commented code with JavaDoc for learning

## 🎓 Learning Path

### Beginner Level
Start with these fundamental patterns:
1. **Singleton** - Basic object creation control
2. **Factory Method** - Simple object creation
3. **Observer** - Event handling
4. **Strategy** - Algorithm selection

### Intermediate Level
Move to more complex patterns:
1. **Decorator** - Dynamic behavior addition
2. **Command** - Request encapsulation
3. **State** - State-dependent behavior
4. **Template Method** - Algorithm structure

### Advanced Level
Explore sophisticated patterns:
1. **Visitor** - Operation separation
2. **Interpreter** - Language interpretation
3. **Mediator** - Complex communication
4. **Flyweight** - Memory optimization

## 🛠️ Project Structure

```
src/main/java/
├── creational/          # Object creation patterns
├── structural/          # Object composition patterns
└── behavioral/          # Communication patterns
    ├── pattern-name/
    │   ├── App.java     # Main demonstration
    │   ├── README.md    # Pattern documentation
    │   └── ...          # Pattern-specific classes
```

## 📝 Contributing

We welcome contributions! Here's how you can help:

1. **Report Issues**: Found a bug or have a suggestion? Open an issue
2. **Add Patterns**: Implement additional design patterns
3. **Improve Documentation**: Enhance READMEs or add more examples
4. **Code Quality**: Suggest improvements to existing implementations

### Contribution Guidelines
- Follow existing code style and structure
- Add comprehensive documentation for new patterns
- Include class diagrams and usage examples
- Test your implementations thoroughly

## 📄 License

This project is open source and available under the [MIT License](LICENSE).

## 🙏 Acknowledgments

- Inspired by the Gang of Four (GoF) design patterns
- Built for educational purposes and learning
- Community-driven improvements and feedback

---

**Happy Learning! 🎉**

*Master the art of software design with these proven patterns.*



