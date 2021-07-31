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

Pitfalls
* Immutable
* Inner Static Class
* Designed first
* Complexity


