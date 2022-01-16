package com.kodilla.hibernate.tasklist.dao;

import com.kodilla.hibernate.tasklist.TaskList;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest
public class TaskListDaoTestSuite {

    @Autowired
    private TaskListDao taskListDao;

    @Test
    public void testFindByListName() {
        //Given
        TaskList taskList = new TaskList("Parking lot", "Night shift");
        //When
        taskListDao.save(taskList);
        List<TaskList> list = taskListDao.findByListName(taskList.getListName());
        //Then
        Assertions.assertEquals(1, list.size());
        //CleanUp
        taskListDao.deleteById(taskList.getId());
    }
}
