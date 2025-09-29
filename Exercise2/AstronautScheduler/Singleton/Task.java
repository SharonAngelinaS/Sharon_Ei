package Singleton;
public class Task {
    private String description;
    private String startTime;
    private String endTime;
    private int priority; // 3 = High, 2 = Medium, 1 = Low
    private boolean completed;

    public Task(String description, String startTime, String endTime, int priority) {
        this.description = description;
        this.startTime = startTime;
        this.endTime = endTime;
        this.priority = priority;
        this.completed = false;
    }

    public String getDescription() { return description; }
    public String getStartTime() { return startTime; }
    public String getEndTime() { return endTime; }
    public int getPriority() { return priority; }
    public boolean isCompleted() { return completed; }

    public void markCompleted() { this.completed = true; }

    @Override
    public String toString() {
        String priorityLabel = (priority == 3 ? "High" : (priority == 2 ? "Medium" : "Low"));
        return startTime + " - " + endTime + ": " + description + " [" + priorityLabel + "]" +
               (completed ? " [Completed]" : "");
    }
}
