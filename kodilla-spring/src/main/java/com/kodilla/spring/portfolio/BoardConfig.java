package com.kodilla.spring.portfolio;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

@Configuration
public class BoardConfig {
    @Autowired
    @Qualifier("toDoList")
    TaskList toDoList;

    @Bean(name = "toDoList")
    @Scope(value = "prototype")
    public TaskList initDoneList() {
        return new TaskList();
    }

    @Autowired
    @Qualifier("inProgressList")
    TaskList inProgressList;

    @Bean(name = "inProgressList")
    @Scope(value = "prototype")
    public TaskList initInProgressList() {
        return new TaskList();
    }

    @Autowired
    @Qualifier("doneList")
    TaskList doneList;

    @Bean(name = "doneList")
    @Scope(value = "prototype")
    public TaskList initToDoList() {
        return new TaskList();
    }

    @Bean
    public Board addLists() {
        return new Board(toDoList, inProgressList, doneList);
    }
}
