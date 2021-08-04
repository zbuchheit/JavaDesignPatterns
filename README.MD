# Design Patterns - Creational - Singleton Example

Simple example app for design patterns.

|          Singleton           |
| -----------------------------| 
| - singleton: Singleton       | 
| - Singleton()                | 
| + getInstance() : Singleton  |

Notes
* used to guarantee one instance of an object in an application
* static in nature
* thread safe
* a private instance
* a private constructor
* no parameters required for construction
* getInstance() doesn't necessarily mean it is a singleton

Pitfalls
* Overuse
* Difficult to unit test
* If not careful, not thread-safe
* Can be confused for Factory

# Design Patterns - Creational - Builder Example

|          Builder           |
| ---------------------------|
| + buildPart()              |
    ↑                
|      ConcreteBuilder       |
| ---------------------------|
| + buildPart()              |
| + getResult()              |

Notes
* Handles complex constructors
* Large number of parameters
* Immutability

Examples
* StringBuilder
* DocumentBuilder
* LocaleBuilder

Pitfalls/Considerations
* Immutable
* Inner Static Class
* Designed first
* Complexity

# Design Patterns - Creational - Prototype Example

|          IPrototype           |
| ------------------------------| 
| + Clone()                     | 
| + DeepCopy()                  | 

Notes
* Clone
* Guarantee unique instance
* Great to help with performance issues associated with creation of lots of objects
* Lightweight Construction  
* Avoids keyword "new"
* Each instance is a copy, but unique
* Costly construction not handled by client
* Can do shallow(immediate properties) vs deep copy(object references)

Examples 
* Cloneable

Pitfalls
* Sometimes not clear when to use
* Typically have to use it with another pattern like registry
* Shallow VS Deep Copy

# Design Patterns - Creational - Factory Example

|          Factory           |
| ---------------------------|
| + factoryMethod(): Object  |
    ↑                
|      ConcreteBuilder       |
| ---------------------------|
| + factoryMethod(): Object  |

Notes
* Doesn't expose instantiation logic
* Defer to subclasses
* Common interface
* Specified by architecture, impelemented by user
* Solves complex creation
* Opposite of a Singleton

Example
* Calendar
* ResoureBundle
* NumberFormat

Pitfalls
* Complexity
* Creation in subclass
* Refactoring

# Design Patterns - Creational - Abstract Factory Example

|          AbstractFactory   |
| ---------------------------|
| + createProduct(): Object  |
    ↑                
|      ConcreteFactory       |
| ---------------------------|
| + concreteProduct(): Object|
    ↑                
|      ConcreteProduct       |
| ---------------------------|
|                            |

Notes
* Factory of Factories
* Factory of related objects
* Common Interface
* Defer to Subclasses
* Groups Factories together
* Factory is reponsible for lifecycle
* Common Interface
* Concrete Classes
* Parameterized create method
* Composition

Examples
* DocumentBuilder
* Frameworks

Pitfalls
* Complexity
* Runtime switch
* Pattern within a pattern
* Problem specific
* Starts as a Factory





