## Singleton - Shopping Cart

### Use Case
Using a single object throughout the Shopping for a user. The functionality of the object is to add products, remove products, add coupon, view history of operations perfomed by the user. 

### Participants

_Singleton Class (CartHistory) :_
* Ensures only one instance of the cart exists.
* Provides a global method to access this instance (getInstance()).
* Manages cart operations like adding, removing, and viewing items.

_Client Class (ShoppingCartApp)_
* Demonstrates the usage of the Singleton CartHistory.
* Accesses the cart through the Singleton instance and performs operations.
* Shows that all operations affect the same cart instance

### Compile & Run
cd "Exercise 1/Creational/Singleton/shoppingcart"
javac *.java
java ShoppingCartApp

### Output
<img width="428" height="718" alt="image" src="https://github.com/user-attachments/assets/50387f88-8455-495a-9aa5-ebf4496728e8" />
<img width="419" height="852" alt="image" src="https://github.com/user-attachments/assets/db1f64e7-f34d-4a14-8975-de1d996fc9b4" />
<img width="362" height="433" alt="image" src="https://github.com/user-attachments/assets/e8fe8671-ecb0-4440-8449-bae3527ae264" />
