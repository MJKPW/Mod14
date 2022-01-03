package com.kodilla.spring.portfolio;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

@Configuration
public class BoardConfig {

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
        return new Board(getToDoList(), getInProgressList(), getDoneList());
    }

}
