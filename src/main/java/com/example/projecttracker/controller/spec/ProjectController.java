package com.example.projecttracker.controller.spec;

import com.example.projecttracker.request.v1.ProjectRequestData;
import com.example.projecttracker.response.v1.ProjectResponseData;
import org.springframework.http.ResponseEntity;

import java.util.List;

/**
 * project controller interface
 *
 * @author @Ayan Bhuin
 * @since April 29, 2020
 */
public interface ProjectController {
    ResponseEntity<List<ProjectResponseData>> getAll(String version);
    ResponseEntity<ProjectResponseData> getById(String version, int id);
    ResponseEntity<ProjectResponseData> add(String version, ProjectRequestData data);
    ResponseEntity<ProjectResponseData> updateById(String version, int id, ProjectRequestData data);
    void deleteById(String version, int id);
}
