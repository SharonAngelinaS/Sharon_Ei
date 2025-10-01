## Creational Patterns

This folder contains two creational design pattern examples in Java: Factory and Singleton.

### Factory — Ride Booking System
- **Use Case**: Create different types of rides (Car, Bike, Auto) based on user selection without hardcoding creation logic in multiple places.
- **Brief Summary**: `RideFactory` encapsulates ride creation logic. Given a ride type, it returns the appropriate `Ride` implementation, centralizing creation rules and making it easy to add new ride types.

### Singleton — Shopping Cart System
- **Use Case**: Ensure only one global shopping cart exists throughout the application, maintaining consistent state across all users and operations.
- **Brief Summary**: `ShoppingCartApp` implements a singleton shopping cart that maintains a single global state. The cart tracks items and their quantities, with `CartHistory` recording all operations, ensuring consistent cart data across the entire application.
