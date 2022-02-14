package com.kodilla.patterns2.observer.homework;

public class Task {

    private final String name;
    private String content;

    public Task(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

}
