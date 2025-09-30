## Chain of Responsibility — University Email System

### Use Case
I have designed a system that takes incoming emails and searches for specific keywords to help determine which
university team the email should be routed to. 
| **Keywords**                                                                              | **University Team**   |
| ----------------------------------------------------------------------------------------- | --------------------- |
| `academic`, `exam`, `syllabus`, `results`                                                 | Academic Team         |
| `alumni`, `reunion`, `transcript`                                                         | Alumni Team           |
| `placement`, `internship`, `job`, `career`                                                | Placement Team        |
| `office`, `administration`, `certificate`, `fees` and *(anything else not matched above)* | Office Team (default) |

### Participants (in this code)
- `Handler` (interface): Defines `setNext(handler)` and `handle(request)` for chaining and processing.
- `AcademicHandler`: Handles academic-related emails; otherwise forwards to next.
- `OfficeHandler`: Handles general office/admin emails; otherwise forwards to next.
- `PlacementHandler`: Handles placement/career emails; otherwise forwards to next.
- `AlumniHandler`: Handles alumni-related emails; otherwise ends chain if unhandled.
- `MainEmailHandler`: Builds the chain (links handlers in order).
- `EmailApp`: Entry point; creates sample emails and sends them through the chain.

### How it flows
Email → `AcademicHandler` → `OfficeHandler` → `PlacementHandler` → `AlumniHandler` (stops where it’s handled).

### How to Run 

_From repo root _
cd "Exercise 1/Behavioural/Chain of responsibility/universityemailsystem"
javac *.java
java EmailApp

### Output
<img width="1065" height="354" alt="image" src="https://github.com/user-attachments/assets/aa1efa3c-756a-4d64-a736-c4048b84075e" />
