package com.example.projecttracker.service.impl;

import com.example.projecttracker.exception.ResourceNotFoundException;
import com.example.projecttracker.request.v1.ProjectRequestData;
import com.example.projecttracker.response.v1.ProjectResponseData;
import com.example.projecttracker.service.spec.ProjectService;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Ayan Bhuin
 * @since April 29, 2020
 */
@Service
public class ProjectServiceImpl implements ProjectService {
    @Override
    public List<ProjectResponseData> getAllProjects() {
        List<ProjectResponseData> projectList = new ArrayList<>();
        projectList.add(new ProjectResponseData());
        projectList.add(new ProjectResponseData());

        return projectList;
    }

    @Override
    public ProjectResponseData getProjectById(int id) {
        if (id == 1) {
            throw new ResourceNotFoundException("Id not found.");
        }
        return new ProjectResponseData();
    }

    @Override
    public ProjectResponseData addProject() {
        return null;
    }

    @Override
    public ProjectResponseData updateById(ProjectRequestData data) {
        return null;
    }

    @Override
    public void deleteProjectById(int id) {

    }
}
