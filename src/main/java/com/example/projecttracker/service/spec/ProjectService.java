package com.example.projecttracker.service.spec;

import com.example.projecttracker.request.v1.ProjectRequestData;
import com.example.projecttracker.response.v1.ProjectResponseData;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author Ayan Bhuin
 * @since April 29, 2020
 */
@Service
public interface ProjectService {
    List<ProjectResponseData> getAllProjects();
    ProjectResponseData getProjectById(int id);
    ProjectResponseData addProject();
    ProjectResponseData updateById(ProjectRequestData data);
    void deleteProjectById(int id);
}
