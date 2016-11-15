package edu.mum.jsp.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import edu.mum.jsp.domain.Task;

public interface TaskRepository extends JpaRepository<Task, Integer> {

	public Task save(Task T);
	public List<Task> findAll();
	
}
