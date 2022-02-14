package com.kodilla.patterns2.observer.homework;

public class Mentor implements Observer {

    private final String name;
    private int updateCount;

    public Mentor(String name) {
        this.name = name;
        this.updateCount = 0;
    }

    @Override
    public void update(TaskQueue taskQueue) {
        System.out.println("Sent tasks: " + taskQueue.getTasks().size());
        taskQueue.getTasks().forEach(task -> System.out.println(task.getName()));
        updateCount++;
    }

    public String getName() {
        return name;
    }

    public int getUpdateCount() {
        return updateCount;
    }
}
