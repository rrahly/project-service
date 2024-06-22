package com.hexagon.project_service.repository;

import com.hexagon.project_service.entity.Project;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface ProjectRepository extends MongoRepository<Project, String> {

    Optional<Project> findByProjectName(String projectName);
}
