package com.kodilla.patterns.factory.tasks;

import org.junit.Assert;
import org.junit.Test;

import java.util.Objects;

public class TaskFactoryTestSuite {
    @Test
    public void testDrivingTask() {
        //Given
        TaskFactory factory = new TaskFactory();
        //When
        Task drive = factory.makeShape(TaskFactory.DRIVING);
        //Then
        Assert.assertEquals(false, Objects.requireNonNull(drive).isTaskExecuted());
        Assert.assertEquals("We are driving", drive.getTaskName());
    }

    @Test
    public void testPaintingTask() {
        //Given
        TaskFactory factory = new TaskFactory();
        //When
        Task paint = factory.makeShape(TaskFactory.PAINTING);
        //Then
        Assert.assertEquals(false, Objects.requireNonNull(paint).isTaskExecuted());
        Assert.assertEquals("We are painting", paint.getTaskName());
    }

    @Test
    public void testShoppingTask() {
        //Given
        TaskFactory factory = new TaskFactory();
        //When
        Task shopping = factory.makeShape(TaskFactory.SHOPPING);
        //Then
        Assert.assertEquals(true, Objects.requireNonNull(shopping).isTaskExecuted());
        Assert.assertEquals("We are going shopping", shopping.getTaskName());
    }
}
