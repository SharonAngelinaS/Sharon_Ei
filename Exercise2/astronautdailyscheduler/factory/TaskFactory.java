package factory;

import model.*;

public class TaskFactory {
    public Task createTask(String type, String desc, String start, String end) {
        switch (type.toLowerCase()) {
            case "experiment": return new ExperimentTask(desc, start, end);
            case "maintenance": return new MaintenanceTask(desc, start, end);
            case "communication": return new CommunicationTask(desc, start, end);
            default: return null;
        }
    }
}