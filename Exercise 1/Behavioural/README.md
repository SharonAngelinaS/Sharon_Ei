## Behavioral Patterns

This folder contains
* Chain of Responsibility
* Observer.

### _Chain of Responsibility — University Email System_
- **Use Case**: Route incoming emails to the correct university department (Academic, Office, Placement, Alumni) without hardcoding the decision logic in a single place.
- **Brief Summary**: A request (email) is passed along a chain of handlers (`AcademicHandler` → `OfficeHandler` → `PlacementHandler` → `AlumniHandler`). Each handler either processes the email or forwards it to the next handler.


### _Observer — University Forum_ 
- **Use Case**: Notify subscribed students when a forum posts a new update without the forum needing to know concrete subscriber details.
- **Brief Summary**: `Forum` (Subject) maintains a list of `Student` observers. When new posts are added, all observers are notified via a standard interface.

