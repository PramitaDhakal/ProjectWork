package edu.mum.jsp.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import edu.mum.jsp.domain.Task;
import edu.mum.jsp.repository.TaskRepository;

@Service
@Transactional
public class TaskService {
	
	@Autowired
	private TaskRepository taskRepository;
	
	

	
	public void saveTask(Task T){
		
		taskRepository.save(T);
	}


	
	

}
