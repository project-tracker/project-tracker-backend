package com.example.projecttracker.controller.spec;

import com.example.projecttracker.model.Project;
import com.example.projecttracker.request.v1.ProjectRequestData;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;

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
