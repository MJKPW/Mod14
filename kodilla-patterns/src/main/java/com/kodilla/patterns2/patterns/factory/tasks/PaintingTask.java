package com.kodilla.patterns2.patterns.factory.tasks;

public class PaintingTask implements Task {

    private final String taskName;
    private final String color;
    private final String whatToPaint;
    private boolean completed;

    public PaintingTask(String taskName, String color, String whatToPaint) {
        completed = false;
        this.taskName = taskName;
        this.color = color;
        this.whatToPaint = whatToPaint;
    }

    @Override
    public void executeTask() {
        System.out.println("Painting the " + whatToPaint + " " + color);
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
