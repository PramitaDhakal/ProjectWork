package edu.mum.jsp.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import edu.mum.jsp.domain.Task;
import edu.mum.jsp.service.TaskService;

@Controller
public class TaskController {
	
	@Autowired
	private TaskService taskService;
	
	@RequestMapping(value="/addTask", method= RequestMethod.GET)
	public String getAddProjectForm(@ModelAttribute("newTask")Task task){
		System.out.println("Reached here");
		return "addTask";
	}
	@RequestMapping(value = "/addTask", method = RequestMethod.POST)
	public String saveProject(@ModelAttribute("newTask")Task task,BindingResult result){
		
		taskService.saveTask(task);
		
		return "successAdded";
	}
	

}
