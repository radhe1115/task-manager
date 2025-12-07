package com.sparkl.kaushal.controller;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;

import com.sparkl.kaushal.model.Task;

@WebMvcTest
public class ControllerTest {
    @Autowired
    Task task;

    @Autowired
    TaskController taskController;

    @Test
    public void getAllTaskTest() {
        // Arrange
        List<Task> task = new ArrayList<>();

        // Act
        
        // Assert
        assertTrue(task.isEmpty());
    }
}
