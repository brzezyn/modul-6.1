package com.kodilla.spring.portfolio;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import org.junit.jupiter.api.Assertions;

@SpringBootTest
public class BoardTestSuite {
    @Test
    public void testTaskAdd() {
        //Given
        ApplicationContext context = new AnnotationConfigApplicationContext(BoardConfig.class);
        Board board = context.getBean(Board.class);
        //When
        board.getToDoList().addTask("Task 1");
        board.getInProgressList().addTask("Task 2");
        board.getDoneList().addTask("Task 3");
        boolean resultToDo = board.getToDoList().getTasks().contains("Task 1");
        boolean resultInProgress = board.getInProgressList().getTasks().contains("Task 2");
        boolean resultDone = board.getDoneList().getTasks().contains("Task 3");
        //Then
        Assertions.assertEquals(true, resultToDo);
        Assertions.assertEquals(true, resultInProgress);
        Assertions.assertEquals(true, resultDone);
    }
}