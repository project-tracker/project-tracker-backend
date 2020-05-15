package com.example.projecttracker.controller.spec;

import com.example.projecttracker.response.v1.Project;
import com.example.projecttracker.request.v1.ProjectRequestData;
import org.springframework.http.ResponseEntity;

import java.util.List;

/**
 * project controller interface
 *
 * @author @Ayan Bhuin
 * @since April 29, 2020
 */
public interface ProjectController {
    ResponseEntity<List<Project>> getAll(String version);
    ResponseEntity<Project> getById(String version, int id);
    ResponseEntity<Project> add(String version, ProjectRequestData data);
    ResponseEntity<Project> updateById(String version, int id, ProjectRequestData data);
    void deleteById(String version, int id);
}
