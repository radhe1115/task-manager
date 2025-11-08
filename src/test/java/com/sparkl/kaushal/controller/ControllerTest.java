package com.sparkl.kaushal.controller;

import static org.junit.Assert.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import com.sparkl.kaushal.model.Task;

public class ControllerTest {
    @Autowired
    Task task;

    @Autowired
    TaskController taskController;

    @Test
    public void createTaskTest() {
        // Arrange
        task = new Task();
        
        // act
        taskController.createTask("Write an Eassay", "P0", "A");

        // Assert
        assertNotNull(task);
    }

    @Test
    public void getAllTaskTest() {
        // Arrange
        List<Task> task = new ArrayList<>();

        // Act
        task = taskController.getAllTask();

        // Assert
        assertTrue(task.isEmpty());

    }
}
