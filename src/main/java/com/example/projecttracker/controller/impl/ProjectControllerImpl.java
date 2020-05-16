package com.example.projecttracker.controller.impl;

import com.example.projecttracker.controller.spec.ProjectController;
import com.example.projecttracker.request.v1.ProjectRequestData;
import com.example.projecttracker.response.v1.ProjectResponseData;
import com.example.projecttracker.service.spec.ProjectService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * project controller implementation class.
 * handle all the api endpoints for project.
 *
 * @author Ayan Bhuin
 * @since April 29, 2020
 */
@RestController
public class ProjectControllerImpl implements ProjectController {

    @Autowired
    private ProjectService projectService;

    /**
     * get all projects
     * @return list of project
     */
    @Override
    @GetMapping("/api/{version}/projects")
    public ResponseEntity<List<ProjectResponseData>> getAll(
            @PathVariable(value = "version") String version) {
        List<ProjectResponseData> projectList = projectService.getAllProjects();

        if (projectList == null) {
            // Handle if project object is null
        }

        return new ResponseEntity<>(projectList, HttpStatus.OK);
    }

    /**
     * get specific project by id
     * @return project details
     */
    @Override
    @GetMapping("/api/{version}/projects/{id}")
    public ResponseEntity<ProjectResponseData> getById(
            @PathVariable(value = "version") String version,
            @PathVariable int id) {

        return new ResponseEntity<>(projectService.getProjectById(id), HttpStatus.OK);
    }

    /**
     * add new project
     * @return project details
     */
    @Override
    @PostMapping("/api/{version}/projects")
    public ResponseEntity<ProjectResponseData> add(
            @PathVariable(value = "version") String version,
            @RequestBody ProjectRequestData data) {
        return null;
    }

    /**
     * update specific project by id
     * @return project details
     */
    @Override
    @PutMapping("/api/{version}/projects/{id}")
    public ResponseEntity<ProjectResponseData> updateById(
            @PathVariable(value = "version") String version,
            @PathVariable(value = "id") int id,
            @RequestBody ProjectRequestData data) {
        return null;
    }

    /**
     * delete specific project by id
     */
    @Override
    @DeleteMapping("/api/{version}/projects/{id}")
    public void deleteById(
            @PathVariable(value = "version") String version,
            @PathVariable(value = "id") int id) {

    }
}
