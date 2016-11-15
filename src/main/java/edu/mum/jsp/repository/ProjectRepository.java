package edu.mum.jsp.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import edu.mum.jsp.domain.Project;

public interface ProjectRepository extends JpaRepository<Project, Integer> {
	
	public Project save(Project P);
	
	public List<Project> findAll();
	
	public Project findOneById(int id);
	
}
