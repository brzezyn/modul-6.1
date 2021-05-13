package com.kodilla.patterns.factory.tasks;


import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;

public class TaskFactoryTestSuite {
    @Test
    void testFactoryShoppingList() {
        //GIVEN
        TaskFactory factory = new TaskFactory();
        //WHEN
        Task shopping = factory.makeTask(TaskFactory.SHOPPING);
        //THEN
        Assertions.assertEquals("To buy", shopping.getTaskName());
        Assertions.assertFalse(shopping.isTaskExecuted());
    }

    @Test
    void testFactoryPaintingList() {
        //GIVEN
        TaskFactory factory = new TaskFactory();
        //WHEN
        Task painting = factory.makeTask(TaskFactory.PAINTING);
        //THEN
        Assertions.assertEquals("Picture", painting.getTaskName());
        Assertions.assertFalse(painting.isTaskExecuted());
    }

    @Test
    void testFactoryDrivingList() {
        //GIVEN
        TaskFactory factory = new TaskFactory();
        //WHEN
        Task driving = factory.makeTask(TaskFactory.DRIVING);
        //WHEN
        Assertions.assertEquals("Journey", driving.getTaskName());
        Assertions.assertFalse(driving.isTaskExecuted());
    }
}
