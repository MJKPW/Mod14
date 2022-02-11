package com.kodilla.patterns2.patterns.factory.tasks;

public class DrivingTask implements Task {

    private final String taskName;
    private final String where;
    private final String using;
    private boolean completed;

    public DrivingTask(String taskName, String where, String using) {
        completed = false;
        this.taskName = taskName;
        this.where = where;
        this.using = using;
    }

    @Override
    public void executeTask() {
        System.out.println("Driving to " + where + " using " + using);
        completed = true;
    }

    @Override
    public String getTaskName() {
        return taskName;
    }

    @Override
    public boolean isTaskExecuted() {
        return completed;
    }
}
