package edu.mum.jsp.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import edu.mum.jsp.domain.Project;
import edu.mum.jsp.repository.ProjectRepository;

@Service
@Transactional

public class ProjectService{
	
	@Autowired
	private ProjectRepository projectRepository;

	public void saveProject(Project P) {
		projectRepository.save(P);
		
	}

	public List<Project> listAllProject() {
		
		return projectRepository.findAll();
	}

	public Project findProject(int id) {
		
		return projectRepository.findOneById(id);
	}

}
