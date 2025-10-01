## Exercise 2 : Astronaut Daily Schedule Organizer Programming Exercise

### Functionalities (simple words)
- Create tasks with start time, duration, and description
- Validate times (format HH:MM, business hours, non-negative duration)
- Detect overlapping tasks and warn about conflicts
- List all scheduled tasks
- Remove tasks
- Centralized, single schedule shared across the app
- Automatic notifications to observers when conflicts occur

### Participants (in this code)
- `Singleton/ScheduleManager` (Singleton): Holds the master task list, adds/removes tasks, checks conflicts, notifies observers
- `Singleton/Task` (Entity): A scheduled item with start, duration, and description
- `Singleton/TimeValidator` (Singleton): Validates time format and business rules
- `factory/TaskFactory` (Factory): Creates `Task` objects from user inputs
- `Observer/Observer` (Interface): Contract for components that want updates
- `Observer/ConflictNotifier` (Observer): Listens for conflicts and prints warnings
- `app/Main` (App): Main to run the entire project

### Output
Positive Test Cases : 
1. <img width="398" height="297" alt="image" src="https://github.com/user-attachments/assets/ea33bd02-7a20-44d8-958f-56e85dc95405" />
2. <img width="425" height="307" alt="image" src="https://github.com/user-attachments/assets/ad74bee1-95f2-4acb-9343-f523b9a27209" />
3. <img width="400" height="233" alt="image" src="https://github.com/user-attachments/assets/3acb0301-9a85-402e-8a56-0a5f6c86238b" />
4.<img width="497" height="236" alt="image" src="https://github.com/user-attachments/assets/7420c436-1477-444a-883a-47fdfd31066b" />
5. <img width="465" height="301" alt="image" src="https://github.com/user-attachments/assets/107dfabe-d0ef-47ec-9499-6a03425e0aa0" />

Negative Test Cases : 
1. <img width="741" height="301" alt="image" src="https://github.com/user-attachments/assets/0618fb78-af5a-4919-9082-efba27fed0e2" />
2. <img width="515" height="229" alt="image" src="https://github.com/user-attachments/assets/a0cb30dc-0112-4b34-b45d-ddc7e5c8400b" />
3.<img width="443" height="299" alt="image" src="https://github.com/user-attachments/assets/338b94b4-fa5f-458e-bd02-61a37e20f683" />
4.<img width="757" height="298" alt="image" src="https://github.com/user-attachments/assets/3f700c23-7e85-4e1c-a9f9-f15ef1866810" />
5.<img width="362" height="243" alt="image" src="https://github.com/user-attachments/assets/759200ce-6af5-4d63-9c6f-a5978ef6f232" />

Additional Feature : 
<img width="547" height="517" alt="image" src="https://github.com/user-attachments/assets/a69b9a7a-565f-4fb9-bf3f-11b087c21f27" />
<img width="518" height="499" alt="image" src="https://github.com/user-attachments/assets/9116b47a-ddb3-4186-8dec-1c6a88df4cf8" />
