package edu.mum.jsp.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import edu.mum.jsp.domain.Beneficiary;
import edu.mum.jsp.domain.Project;
import edu.mum.jsp.domain.Task;
import edu.mum.jsp.service.ProjectService;

@Controller
public class ProjectController {
	
	@Autowired
	private ProjectService projectService;
	
	@RequestMapping(value="/addProject", method= RequestMethod.GET)
	public String getAddProjectForm(@ModelAttribute("newProject")Project project){
		System.out.println("Reached here");
		return "addProject";
	}
	@RequestMapping(value = "/addProject", method = RequestMethod.POST)
	public String saveProject(@ModelAttribute("newProject")Project project,BindingResult result){
		
		System.out.println(project.getProjectName());
		projectService.saveProject(project);
		
		return "successAdded";
	}
	
	@RequestMapping(value="/addTask")
	public String addTaskToProject(Project project,List<Task> listOfTasks,Model model){
		project.setListOfTasks(listOfTasks);
		return "successAdded";
	}
	
	@RequestMapping(value="/addBeneficiary")
	public String addBeneficiaryToProject(Project project,List<Beneficiary> listOfBeneficiaries,Model model){
		project.setListOfBeneficiary(listOfBeneficiaries);
		return "successAdded";
	}
	
	@RequestMapping(value="/listProjects")
	public String listAllProject(Model model){
		List<Project> listOfProject = projectService.listAllProject();
		model.addAllAttributes(listOfProject);
		return "projectList";
	}
	

}
