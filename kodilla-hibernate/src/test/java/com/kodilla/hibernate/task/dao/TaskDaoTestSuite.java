package com.kodilla.hibernate.task.dao;

import com.kodilla.hibernate.task.Task;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;
import java.util.Optional;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class TaskDaoTestSuite {
    private static final String DESCRIPTION = "Test: Learn Hibernate";

    @Autowired
    private TaskDao taskDao;

    @Test
    void testTaskDaoSave() {
        //GIVEN
        Task task = new Task(DESCRIPTION, 7);
        //WHEN
        taskDao.save(task);
        //THEN
        int id = task.getId();
        Optional<Task> readTask = taskDao.findById(id);
        assertTrue(readTask.isPresent());
        //CLEAN_UP
        taskDao.deleteById(id);
    }

    @Test
    void testTaskDaoFindByDuration() {
        //GIVEN
        Task task = new Task(DESCRIPTION, 7);
        taskDao.save(task);
        int duration = task.getDuration();
        //WHEN
        List<Task> readTasks = taskDao.findByDuration(duration);
        //THEN
        assertEquals(1, readTasks.size());
        //CLEAN_UP
        int id = readTasks.get(0).getId();
        taskDao.deleteById(id);
    }
}