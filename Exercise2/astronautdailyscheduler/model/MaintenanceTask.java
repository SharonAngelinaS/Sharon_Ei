package model;

public class MaintenanceTask extends Task {
    public MaintenanceTask(String description, String start, String end) {
        super(description, start, end);
    }
    public String getType() { return "Maintenance"; }
}