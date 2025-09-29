package model;

public abstract class Task {
    protected String description;
    protected String startTime;
    protected String endTime;

    public Task(String description, String startTime, String endTime) {
        this.description = description;
        this.startTime = startTime;
        this.endTime = endTime;
    }

    public String getDescription() { return description; }
    public String getStartTime() { return startTime; }
    public String getEndTime() { return endTime; }

    public abstract String getType();

    @Override
    public String toString() {
        return String.format("[%s] %s (%s - %s)", getType(), description, startTime, endTime);
    }
}