package factory;

import Singleton.Task;
import Singleton.TimeValidator;

public class TaskFactory {
    // Factory Method: Create Task after validation
    public static Task createTask(String description, String startTime, String endTime, int priority) throws Exception {
        if (!TimeValidator.isValidTimeFormat(startTime) || !TimeValidator.isValidTimeFormat(endTime)) {
            throw new Exception("Error: Invalid time format.");
        }
        if (!TimeValidator.isEndAfterStart(startTime, endTime)) {
            throw new Exception("Error: End time must be after start time.");
        }
        return new Task(description, startTime, endTime, priority);
    }
}
