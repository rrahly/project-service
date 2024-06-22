package com.hexagon.project_service.service;

import com.hexagon.project_service.entity.Project;
import com.hexagon.project_service.repository.ProjectRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProjectService {

    private final ProjectRepository projectRepository;

    @Autowired
    public ProjectService(ProjectRepository projectRepository) {
        this.projectRepository = projectRepository;
    }

    public Project addProject(Project project) {
        return projectRepository.save(project);
    }

    public List<Project> fetchProjects() {
        return projectRepository.findAll();
    }

    public Project fetchProjectByName(String name) {
        return projectRepository.findByProjectName(name).orElse(null);
    }
}
