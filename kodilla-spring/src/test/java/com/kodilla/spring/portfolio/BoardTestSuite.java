package com.kodilla.spring.portfolio;

import org.junit.Assert;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class BoardTestSuite {
    @Test
    public void testTaskAdd() {
        //Given
        ApplicationContext context = new AnnotationConfigApplicationContext(BoardConfig.class);
        Board board = context.getBean(Board.class);
        //When & Then
        board.getDoneList().addTask("First task");
        board.getInProgressList().addTask("Second task");
        board.getToDoList().addTask("Third task");

        String result1 = board.getDoneList().getTasks().get(0);
        String result2 = board.getInProgressList().getTasks().get(0);
        String result3 = board.getToDoList().getTasks().get(0);

        Assert.assertEquals("First task", result1);
        Assert.assertEquals("Second task", result2);
        Assert.assertEquals("Third task", result3);
    }
}
