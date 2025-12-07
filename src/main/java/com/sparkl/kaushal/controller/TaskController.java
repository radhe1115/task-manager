package com.sparkl.kaushal.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;

import com.sparkl.kaushal.model.Response;
import com.sparkl.kaushal.model.Task;
import com.sparkl.kaushal.service.TaskService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.PostMapping;



@RestController
@RequestMapping("/tasks")
public class TaskController {
    @Autowired
    private TaskService taskService;

    @GetMapping(value ="/getAllTask")
    public Response getAllTask() {
        try {
            List<Task> tasks = taskService.getAllTask();
            Response response = new Response();
            response.setStatusDes("Success");
            response.setDetails(tasks);
            return response;
        } catch (Exception e) {
            Response response = new Response();
            response.setStatusDes("Failure: " + e.getMessage());
            response.setDetails(null);
            return response;
        }
    }

    @PostMapping(value ="/createNewTask")
    public void createTask(@RequestParam() String title, @RequestParam String priority, @RequestParam String status) {
        taskService.createTask(title, priority, status);
    }

}
