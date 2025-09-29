package observer;

import model.Task;

public class ConflictNotifier implements TaskObserver {
    public void onConflict(Task existing, Task newTask) {
        System.out.printf("Conflict: '%s' overlaps with '%s'%n",
                          newTask.getDescription(), existing.getDescription());
    }
}