package com.example.projecttracker.service.spec;

import com.example.projecttracker.model.Project;
import com.example.projecttracker.request.v1.ProjectRequestData;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author Ayan Bhuin
 * @since April 29, 2020
 */
@Service
public interface ProjectService {
    List<Project> getAllProjects();
    Project getProjectById(int id);
    Project addProject();
    Project updateById(ProjectRequestData data);
    void deleteProjectById(int id);
}
