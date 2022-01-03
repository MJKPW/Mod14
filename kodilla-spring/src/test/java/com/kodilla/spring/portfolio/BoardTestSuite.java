package com.kodilla.spring.portfolio;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

@SpringBootTest
public class BoardTestSuite {

    @Test
    public void testTaskAdd() {
        //Given
        ApplicationContext context = new
                AnnotationConfigApplicationContext(BoardConfig.class);
        Board board = (Board)context.getBean("getBoard");
        //When
        board.getDoneList().getTasks().add("First task");
        board.getInProgressList().getTasks().add("Second task");
        board.getToDoList().getTasks().add("Third task");
        //Then
        Assertions.assertEquals(1, board.getDoneList().getTasks().size());
        Assertions.assertEquals(1, board.getInProgressList().getTasks().size());
        Assertions.assertEquals(1, board.getToDoList().getTasks().size());
    }
}
