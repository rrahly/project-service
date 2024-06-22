package com.hexagon.project_service.controller;

import com.hexagon.project_service.entity.Project;
import com.hexagon.project_service.service.ProjectService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@CrossOrigin("*")
@RequestMapping(value = "/project")
@RestController
public class ProjectController {
    private final ProjectService projectService;

    @Autowired
    public ProjectController(ProjectService projectService) {
        this.projectService = projectService;
    }

    @PostMapping
    public Project addProject(@RequestBody Project project) {
        return projectService.addProject(project);
    }

    @GetMapping
    public List<Project> fetchProjects() {
        return projectService.fetchProjects();
    }

    @GetMapping("/{name}")
    public Project fetchProjectByName(@PathVariable String name) {
        return projectService.fetchProjectByName(name);
    }

}
