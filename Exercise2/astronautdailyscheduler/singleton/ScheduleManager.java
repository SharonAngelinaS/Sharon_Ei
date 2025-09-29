package singleton;

import model.Task;
import observer.TaskObserver;
import observer.ConflictNotifier;
import java.util.*;

public class ScheduleManager {
    private static ScheduleManager instance = new ScheduleManager();
    private List<Task> tasks = new ArrayList<>();
    private List<TaskObserver> observers = new ArrayList<>();

    private ScheduleManager() {
        observers.add(new ConflictNotifier());
    }

    public static ScheduleManager getInstance() {
        return instance;
    }

    public void addTask(Task t) {
        for (Task existing : tasks) {
            if (timesOverlap(existing.getStartTime(), existing.getEndTime(), t.getStartTime(), t.getEndTime())) {
                notifyObservers(existing, t);
            }
        }
        tasks.add(t);
        System.out.println("✅ Task added: " + t);
    }

    public void displayTasks() {
        if (tasks.isEmpty()) {
            System.out.println("No tasks scheduled.");
        } else {
            System.out.println("\nCurrent Schedule:");
            for (Task t : tasks) {
                System.out.println("- " + t);
            }
        }
    }

    private boolean timesOverlap(String start1, String end1, String start2, String end2) {
        return start1.compareTo(end2) < 0 && start2.compareTo(end1) < 0;
    }

    private void notifyObservers(Task existing, Task newTask) {
        for (TaskObserver obs : observers) {
            obs.onConflict(existing, newTask);
        }
    }
}