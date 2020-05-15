package com.example.projecttracker.response.v1;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Date;

/**
 * @author Ayan Bhuin
 * @since April 29, 2020
 */

@Getter
@Setter
@NoArgsConstructor
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
