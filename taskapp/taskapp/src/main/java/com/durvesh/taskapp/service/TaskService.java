package com.durvesh.taskapp.service;

import java.util.List;


import org.springframework.stereotype.Service;

import com.durvesh.taskapp.model.Task;
import com.durvesh.taskapp.repository.TaskRepository;

@Service
public class TaskService {
	
	private final TaskRepository taskRepository;
	
	
	public TaskService( TaskRepository taskRepository) {
		this.taskRepository = taskRepository;
		
	}

	public Task saveTask(Task task) {
		
		return taskRepository.save(task);
	}
	
	public List<com.durvesh.taskapp.model.Task> getAllTasks() {
        return taskRepository.findAll();
    }
	public Task getTaskById(Long id) {
	    return taskRepository.findById(id)
	            .orElseThrow(() -> new RuntimeException("Task not found with id " + id));
	}

	public Task updateTask(Long id, Task updatedTask) {
	    Task task = getTaskById(id);
	    task.setTitle(updatedTask.getTitle());
	    task.setCompleted(updatedTask.isCompleted());
	    return taskRepository.save(task);
	}

	public void deleteTask(Long id) {
	    taskRepository.deleteById(id);
	}

	


}
