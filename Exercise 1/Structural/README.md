## Structural Patterns

This folder contains two structural design pattern examples in Java: Adapter and Bridge.

### Adapter — Real Estate Acre Calculator
- **Use Case**: Convert square feet calculations to acres for real estate clients without modifying the existing `SquareFeetCalculator` class.
- **Brief Summary**: `AcreageAdapter` adapts the `SquareFeetCalculator` interface to provide results in acres for `Land` and `Estate` clients. This allows incompatible interfaces to work together without changing existing code.

### Bridge — Medication Administration System
- **Use Case**: Separate patient types (Adult, Child) from medication types (PainRelief, Antibiotic) to allow independent variation of both dimensions.
- **Brief Summary**: The `Patient` abstraction is separated from `Medicine` implementation through a bridge. `Adult` and `Child` patients can work with any `Medicine` type (`PainRelief` or `Antibiotic`), enabling flexible combinations without creating a class explosion.
