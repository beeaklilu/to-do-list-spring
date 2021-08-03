package com.example.todolist.service;

import com.example.todolist.model.Task;

import java.util.List;

public interface TaskService {

    void addTask(Task task);

    void editTask(Task task);

    Task getTaskById(long id);

    List<Task> getAllTask();
}
