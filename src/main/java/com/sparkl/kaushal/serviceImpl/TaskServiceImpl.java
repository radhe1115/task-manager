package com.sparkl.kaushal.serviceImpl;

import java.util.List;
import java.util.Objects;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sparkl.kaushal.model.Task;
import com.sparkl.kaushal.repository.TaskRepository;
import com.sparkl.kaushal.service.TaskService;

@Service
class TaskServiceImpl implements TaskService {
  @Autowired
  private TaskRepository taskRepository;

  @Override
  public void createTask(String title, String priority, String status) {
    try { if (title.isEmpty()==false && priority.isEmpty()==false && status.isEmpty()==false) {
       Task task1 = new Task();
      task1.setTitle(title);
      task1.setPriority(priority);
      task1.setStatus(status);
      System.out.println(task1.toString());
      taskRepository.save(task1);
    }else {
      System.out.println("Invalid Input(s) to create Task.");
    }   

    } catch (Exception e) {

      System.out.println("Error Occurred while creating task: " + e.getMessage());
    }
  }

  @Override
  public List<Task> getAllTask() {
            List<Task> tasks = taskRepository.findAll();

      if (Objects.nonNull(tasks)) {
            return tasks;

      }else {
            throw new NullPointerException("No Tasks Found");
      }
    }
     

}