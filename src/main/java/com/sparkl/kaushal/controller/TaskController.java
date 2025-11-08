package com.sparkl.kaushal.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.sparkl.kaushal.model.Task;
import com.sparkl.kaushal.repository.TaskRepository;

public class TaskController {
    @Autowired
    TaskRepository taskRepository;

    public void createTask(String title, String priority, String status) { 
        Task task1 = new Task();

        task1.setTitle("Ram");
        task1.setPriority("R1");
        task1.setStatus("A");

        System.out.println(task1.toString());

        taskRepository.save(task1);
        
    }

    public List<Task> getAllTask() {
        List<Task> taskList = taskRepository.findAll();
        System.out.println(taskList.toString());
        return taskList;
    }
}
