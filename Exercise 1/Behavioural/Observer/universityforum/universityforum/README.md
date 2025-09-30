## Observer — University Forum

### Use Case
Students subscribe to a university forum. Whenever the forum posts a new update, all subscribed students should automatically be notified without the forum needing to know details about each student.

### Participants (in this code)
- `Subject` (interface): Contract for attach/detach/notify operations.
- `Observer` (interface): Contract for receiving updates.
- `Forum` (concrete Subject): Holds observers and notifies them on new posts.
- `Student` (concrete Observer): Receives forum updates and reacts (e.g., prints message).
- `Main` (driver): Demonstrates subscribing, posting, and notifications.

### Path
`Exercise 1/Behavioural/Observer/universityforum/universityforum`

### Compile & Run
cd "Exercise 1/Behavioural/Observer/universityforum/universityforum"
javac .java
java Main

### Output
<img width="578" height="379" alt="image" src="https://github.com/user-attachments/assets/14aac405-1824-4ebe-8f1f-e58d5230f875" />
<img width="426" height="144" alt="image" src="https://github.com/user-attachments/assets/de2bc2a1-46a8-48c2-a58d-5bea27b181d4" />
<img width="364" height="78" alt="image" src="https://github.com/user-attachments/assets/c6fd50e7-a958-42f2-8701-249ea6c68ad3" />
<img width="293" height="183" alt="image" src="https://github.com/user-attachments/assets/0f03bdef-cdb7-42dd-ae69-1c2a94336044" />
<img width="314" height="137" alt="image" src="https://github.com/user-attachments/assets/a21c0570-e9bf-4350-ae4a-fef8be6eaee8" />


