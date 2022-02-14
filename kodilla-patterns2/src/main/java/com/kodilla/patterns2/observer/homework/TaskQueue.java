package com.kodilla.patterns2.observer.homework;

import java.util.ArrayList;
import java.util.List;

public class TaskQueue implements Observable {

    private final String username;
    private final List<Task> tasks;
    private final List<Observer> observers;

    public TaskQueue(String username) {
        tasks = new ArrayList<>();
        observers = new ArrayList<>();
        this.username = username;
    }

    public void sendTask(Task task) {
        tasks.add(task);
        notification();
    }

    @Override
    public void registerObserver(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void notification() {
        for(var obs : observers)
            obs.update(this);
    }

    @Override
    public void removeObserver(Observer observer) {
        observers.remove(observer);
    }

    public String getUsername() {
        return username;
    }

    public List<Task> getTasks() {
        return tasks;
    }

    public List<Observer> getObservers() {
        return observers;
    }
}
