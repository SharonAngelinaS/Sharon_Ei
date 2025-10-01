## Factory — Ride Booking System

### Use Case
A ride booking app needs to create different types of rides (Car, Bike, Auto) based on user selection. Instead of hardcoding `new CarRide()`, `new BikeRide()`, etc., use a factory to handle the creation logic in one place.

### Participants (in this code)
- `Ride` (interface): Common contract for all ride types.
- `CarRide`, `BikeRide`, `AutoRide` (concrete products): Specific ride implementations.
- `RideFactory` (factory): Creates rides based on input type.
- `Main` (client): Uses the factory to get rides and demonstrates booking.

### Compile & Run
cd "Exercise 1/Creational/Factory/ride_booking_system"
javac .java

### Output 
<img width="876" height="326" alt="image" src="https://github.com/user-attachments/assets/170fbd1e-3582-4959-b40e-9d561cb14ac4" />
<img width="764" height="676" alt="image" src="https://github.com/user-attachments/assets/e72c101e-651e-4e3d-92b2-e78b9bd059e6" />
