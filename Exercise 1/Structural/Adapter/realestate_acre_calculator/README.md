## Adapter — Real Estate Acre Calculator

### Use Case
Real estate clients need land area in acres, but the existing calculator only works in square feet. Instead of rewriting the calculator, create an adapter that converts square feet to acres automatically.

### Participants (in this code)
- `SquareFeetCalculator` (existing class): Calculates area in square feet.
- `AcreageAdapter` (adapter): Converts square feet to acres (1 acre = 43,560 sq ft).
- `Land` (client): Uses the adapter to get acre measurements.
- `Estate` (client): Uses the adapter to get acre measurements.
- `Main` (driver): Demonstrates the adapter pattern in action.

### Compile & Run
cd "Exercise 1/Structural/Adapter/realestate_acre_calculator"
javac *.java
java Main

## Output
<img width="878" height="390" alt="image" src="https://github.com/user-attachments/assets/3037611f-f944-4986-b05e-2493352663e8" />
