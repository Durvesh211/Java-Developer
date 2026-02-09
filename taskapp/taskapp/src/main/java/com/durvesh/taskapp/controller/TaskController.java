package com.durvesh.taskapp.controller;

import java.util.List;

import org.springframework.web.bind.annotation.*;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.durvesh.taskapp.model.Task;
import com.durvesh.taskapp.service.TaskService;


@RestController
@RequestMapping("/tasks")
public class TaskController {
	private final TaskService taskService;
	
	public TaskController(TaskService taskService) {
		this.taskService = taskService;
		
	}
	
	@PostMapping
	public Task createTask(@RequestBody Task task) {
		return taskService.saveTask(task);
		
	}
	
	@GetMapping
	public List<Task> getTasks(){
		return taskService.getAllTasks();
	}
	
	@GetMapping("/{id}")
	public Task getTasksById(@PathVariable Long id){
		return taskService.getTaskById(id);
	}
	
	@PutMapping("/{id}")
	public Task updateTask(
	        @PathVariable Long id,
	        @RequestBody Task updatedTask) {
	    return taskService.updateTask(id, updatedTask);
	}
	
	@DeleteMapping("/{id}")
	public void deleteTask(@PathVariable Long id) {
	    taskService.deleteTask(id);
	}



}
