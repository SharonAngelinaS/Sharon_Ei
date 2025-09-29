package model;

public class ExperimentTask extends Task {
    public ExperimentTask(String description, String start, String end) {
        super(description, start, end);
    }
    public String getType() { return "Experiment"; }
}