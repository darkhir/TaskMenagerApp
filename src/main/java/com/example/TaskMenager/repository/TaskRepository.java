package com.example.TaskMenager.repository;

import com.example.TaskMenager.model.Task;
import com.example.TaskMenager.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface TaskRepository extends JpaRepository<Task, Long> {
    List<Task> findAllByUser(User user);
    List<Task> findAllByUserAndCompleted(User user, boolean completed);
}