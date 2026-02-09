package com.durvesh.taskapp.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.durvesh.taskapp.model.Task;

public interface TaskRepository extends JpaRepository<Task, Long> {

}
