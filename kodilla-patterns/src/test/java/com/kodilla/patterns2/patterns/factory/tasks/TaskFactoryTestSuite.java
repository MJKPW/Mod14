package com.kodilla.patterns2.patterns.factory.tasks;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TaskFactoryTestSuite {

    @Test
    public void testDrivingTask() {
        //Given
        Task drivingTask = TaskFactory.makeTask(Tasks.DRIVING);
        //When
        drivingTask.executeTask();
        //Then
        Assertions.assertEquals("Driving", drivingTask.getTaskName());
        Assertions.assertTrue(drivingTask.isTaskExecuted());
    }

    @Test
    public void testShoppingTask() {
        //Given
        Task shoppingTask = TaskFactory.makeTask(Tasks.SHOPPING);
        //When
        shoppingTask.executeTask();
        //Then
        Assertions.assertEquals("Shopping", shoppingTask.getTaskName());
        Assertions.assertTrue(shoppingTask.isTaskExecuted());
    }

    @Test
    public void testPaintingTask() {
        //Given
        Task paintingTask = TaskFactory.makeTask(Tasks.PAINTING);
        //When
        paintingTask.executeTask();
        //Then
        Assertions.assertEquals("Painting", paintingTask.getTaskName());
        Assertions.assertTrue(paintingTask.isTaskExecuted());
    }
}
