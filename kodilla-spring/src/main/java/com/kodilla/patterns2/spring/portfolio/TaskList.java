package com.kodilla.patterns2.spring.portfolio;

import java.util.ArrayList;
import java.util.List;

public class TaskList {

    private final List<String> tasks;

    public TaskList() {
        tasks = new ArrayList<>();
    }

    public List<String> getTasks() {
        return tasks;
    }

}
