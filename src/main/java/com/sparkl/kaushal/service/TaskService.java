package com.sparkl.kaushal.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.sparkl.kaushal.model.Task;

@Service
public interface TaskService {
  public List<Task> getAllTask();

  public void createTask(String title, String priority, String status);

}
