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
    private static final String LISTNAME = "Test";

    @Test
    void testTaskListDaoFindByListName() {
        //GIVEN
        TaskList taskList = new TaskList(LISTNAME, "Test");
        taskListDao.save(taskList);
        String listName = taskList.getListName();
        //WHEN
        List<TaskList> readTaskLists = taskListDao.findByListName(listName);
        //THEN
        Assertions.assertEquals(1, readTaskLists.size());
        //CLEAN_UP
        int id = readTaskLists.get(0).getId();
        taskListDao.deleteById(id);
    }
}
