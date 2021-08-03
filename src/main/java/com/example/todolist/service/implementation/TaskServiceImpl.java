package com.example.todolist.service.implementation;

import com.example.todolist.dao.TaskRepository;
import com.example.todolist.model.Task;
import com.example.todolist.service.TaskService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class TaskServiceImpl implements TaskService {


    @Autowired
    TaskRepository taskRepository;

    @Override
    public void addTask(Task task) {
        taskRepository.save(task);
    }

    @Override
    public void editTask(Task task) {
        Optional<Task> userTask = Optional.ofNullable(getTaskById(task.getId()));
        if (userTask.isPresent()) {
            Task newTask = userTask.get();
            newTask.setTitle(task.getTitle());
            newTask.setDescription(task.getDescription());
            newTask.setStartDate(task.getStartDate());
        }
        taskRepository.save(task);

    }

    @Override
    public Task getTaskById(long id) {
        return taskRepository.findById(id).get();

    }

    @Override
    public List<Task> getAllTask() {
        return taskRepository.findAll();
    }


}
