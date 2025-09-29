package model;

public class CommunicationTask extends Task {
    public CommunicationTask(String description, String start, String end) {
        super(description, start, end);
    }
    public String getType() { return "Communication"; }
}