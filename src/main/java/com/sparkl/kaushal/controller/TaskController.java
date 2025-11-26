package com.sparkl.kaushal.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import com.sparkl.kaushal.model.Task;
import com.sparkl.kaushal.repository.TaskRepository;

@Controller
public class TaskController {
    @Autowired
    private TaskRepository taskRepository;
    public List<Task> getAllTask() {
        List<Task> taskList = taskRepository.findAll();
        System.out.println(taskList.toString());
        return taskList;
    }

    public void createTask(String title, String priority, String status) {
        Task task1 = new Task();
        task1.setTitle(title);
        task1.setPriority(priority);
        task1.setStatus(status);
        System.out.println(task1.toString());
        taskRepository.save(task1);
    }
}
