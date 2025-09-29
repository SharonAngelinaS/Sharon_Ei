package observer;

import model.Task;

public interface TaskObserver {
    void onConflict(Task existing, Task newTask);
}