package com.kodilla.patterns2.spring.portfolio;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

@Configuration
public class BoardConfig {

    @Autowired
    @Qualifier("To Do List")
    TaskList toDoList;

    @Autowired
    @Qualifier("In Progress List")
    TaskList inProgressList;

    @Autowired
    @Qualifier("Done List")
    TaskList doneList;

    @Bean(name="To Do List")
    @Scope("singleton")
    public TaskList getToDoList() {
        return new TaskList();
    }

    @Bean(name="In Progress List")
    @Scope("singleton")
    public TaskList getInProgressList() {
        return new TaskList();
    }

    @Bean(name="Done List")
    @Scope("singleton")
    public TaskList getDoneList() {
        return new TaskList();
    }

    @Bean
    @Scope("singleton")
    public Board getBoard() {
        return new Board(toDoList, inProgressList, doneList);
    }

}
