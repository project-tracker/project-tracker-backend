package com.example.projecttracker.model;

import lombok.Data;

import java.util.Date;

/**
 * @author Ayan Bhuin
 * @since April 29, 2020
 */
@Data
public class Project {
    private int id;
    private String name;
    private String description;
    private boolean isDeleted;
    private String createdBy;
    private Date createdDate;
    private String updatedBy;
    private Date updatedDate;
}
