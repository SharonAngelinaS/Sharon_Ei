package Singleton;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import Observer.Observer;
import Observer.ConflictNotifier;

public class ScheduleManager {
    // Singleton Pattern: Only one instance
    private static ScheduleManager instance;
    private ArrayList<Task> tasks;
    private Observer conflictObserver;

    private ScheduleManager() {
        tasks = new ArrayList<>();
        conflictObserver = new ConflictNotifier();
    }

    public static ScheduleManager getInstance() {
        if (instance == null) {
            instance = new ScheduleManager();
        }
        return instance;
    }

    public void addTask(Task task) {
        for (Task t : tasks) {
            if (TimeValidator.isOverlapping(t, task)) {
                conflictObserver.notifyConflict(t);
                return;
            }
        }
        tasks.add(task);
        sortTasks();
        System.out.println("Task added successfully. No conflicts.");
    }

    public void removeTask(String description) {
        Task found = null;
        for (Task t : tasks) {
            if (t.getDescription().equalsIgnoreCase(description)) {
                found = t;
                break;
            }
        }
        if (found != null) {
            tasks.remove(found);
            System.out.println("Task removed successfully.");
        } else {
            System.out.println("Error: Task not found.");
        }
    }

    public void viewTasks() {
        boolean hasUncompleted = false;
        for (Task t : tasks) {
            if (!t.isCompleted()) {
                System.out.println(t);
                hasUncompleted = true;
            }
        }
        if (!hasUncompleted) {
            System.out.println("No tasks scheduled for the day.");
        }
    }

    public void markTaskCompleted(String description) {
        for (Task t : tasks) {
            if (t.getDescription().equalsIgnoreCase(description)) {
                t.markCompleted();
                System.out.println("Task marked as completed.");
                viewTasks();
                removeTask(description);
                return;
            }
        }
        System.out.println("Error: Task not found.");
    }

    public void viewTasksByPriority(int priority) {
        boolean found = false;
        for (Task t : tasks) {
            if (t.getPriority() == priority && !t.isCompleted()) {
                System.out.println(t);
                found = true;
            }
        }
        if (!found) System.out.println("No tasks found with this priority.");
    }

    private void sortTasks() {
        Collections.sort(tasks, Comparator.comparing(Task::getStartTime).thenComparing(Task::getPriority, Comparator.reverseOrder()));
    }
}
