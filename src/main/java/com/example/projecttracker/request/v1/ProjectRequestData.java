package com.example.projecttracker.request.v1;

import lombok.Data;

/**
 * add or modify request object for Project
 * @author Ayan Bhuin
 * @since April 29, 2020
 */
@Data
public class ProjectRequestData {
    private String name;
    private String description;
}
