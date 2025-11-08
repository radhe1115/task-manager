package com.sparkl.kaushal.repository;

import org.junit.jupiter.api.Test;
import com.sparkl.kaushal.model.Task;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;
import java.util.List;

@DataJpaTest
@AutoConfigureTestDatabase(replace = AutoConfigureTestDatabase.Replace.NONE)
public class RepositoryTest {
    @Autowired
    TaskRepository taskRepository;

    
    @Test
    void addTask() {
        // Arrange
        Task task = new Task();

        task.setTitle("Eassy Writing");
        task.setStatus("Pending");
        task.setPriority("P1");

        // Act
        taskRepository.save(task);

        // Assert
        assertNotNull(taskRepository.findById(task.getId()).get());
    }

    @Test
    void getAllTaskTest() {
        // Arrange
        List<Task> taskList = new ArrayList<Task>();

        // act
        taskList = taskRepository.findAll();

        //
        assertNotNull(taskList);
    }
}