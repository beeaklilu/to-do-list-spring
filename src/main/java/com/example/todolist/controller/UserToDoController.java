package com.example.todolist.controller;


import com.example.todolist.model.Task;
import com.example.todolist.service.TaskService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class UserToDoController {

    @Autowired
    TaskService taskService;

    @PostMapping("/task")
    public void addTask(@RequestBody Task task){
        taskService.addTask(task);
    }
    @PutMapping("/task")
    public void editTask(@RequestBody Task task){
        taskService.editTask(task);
    }
    @GetMapping("/task/{id}")
    public Task getTask(@PathVariable("id") long id){
        return taskService.getTaskById(id);
    }
    @GetMapping("/task")
    public List<Task> getAllTasks(){
        return taskService.getAllTask();
    }
}
