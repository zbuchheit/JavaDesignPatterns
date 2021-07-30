# Design Patterns - Creational - Singleton Example

Simple example app for design patterns.

|          Singleton           |
| -----------------------------| 
| - singleton: Singleton       | 
| - Singleton()                | 
| + getInstance() : Singleton  |

Notes
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

