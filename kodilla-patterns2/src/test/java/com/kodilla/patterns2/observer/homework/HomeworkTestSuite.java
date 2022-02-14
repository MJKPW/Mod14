package com.kodilla.patterns2.observer.homework;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class HomeworkTestSuite {

    @Test
    public void homeworkTest() {
        //Given
        Task first = new Task("first");
        Task second = new Task("second");
        Task third = new Task("third");
        Task fourth = new Task("fourth");

        TaskQueue firstQueue = new TaskQueue("first");
        TaskQueue secondQueue = new TaskQueue("second");
        TaskQueue thirdQueue = new TaskQueue("third");

        Mentor firstMentor = new Mentor("first");
        Mentor secondMentor = new Mentor("second");

        firstQueue.registerObserver(firstMentor);
        secondQueue.registerObserver(firstMentor);
        thirdQueue.registerObserver(secondMentor);
        //When
        firstQueue.sendTask(first);
        firstQueue.sendTask(second);

        secondQueue.sendTask(first);

        thirdQueue.sendTask(first);
        thirdQueue.sendTask(second);
        thirdQueue.sendTask(third);
        thirdQueue.sendTask(fourth);
        //Then
        assertEquals(3, firstMentor.getUpdateCount());
        assertEquals(4, secondMentor.getUpdateCount());
    }

}
