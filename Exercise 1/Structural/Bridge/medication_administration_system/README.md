## Bridge — Medication Administration System

### Use Case (simple terms)
A hospital system needs to give different medications to different patient types. Instead of creating separate classes for every combination (Adult+PainRelief, Adult+Antibiotic, Child+PainRelief, Child+Antibiotic), use a bridge to separate patient types from medication types.

### Brief Summary
The `Patient` abstraction is separated from `Medicine` implementation through a bridge. `Adult` and `Child` patients can work with any `Medicine` type (`PainRelief` or `Antibiotic`), enabling flexible combinations without creating a class explosion. This allows independent variation of both patient types and medication types.

### Participants (in this code)
- `Patient` (abstraction): Defines the interface for patient types.
- `Adult`, `Child` (refined abstractions): Specific patient types with different medication needs.
- `Medicine` (implementor): Defines the interface for medication types.
- `PainRelief`, `Antibiotic` (concrete implementors): Specific medication implementations.
- `BridgeDriver` (client): Demonstrates the bridge pattern with various patient-medication combinations.

### Compile & Run
- cd "Exercise 1/Structural/Bridge/medication_administration_system"
- javac .java
- java BridgeDriver

### Output
<img width="743" height="643" alt="image" src="https://github.com/user-attachments/assets/032f630b-ee8d-45ee-bc7d-d36eaccb8335" />
