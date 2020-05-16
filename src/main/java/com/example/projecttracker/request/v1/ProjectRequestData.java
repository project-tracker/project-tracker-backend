package com.example.projecttracker.request.v1;

import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

/**
 * add or modify request object for Project
 * @author Ayan Bhuin
 * @since April 29, 2020
 */
@Getter
@Setter
@NoArgsConstructor
public class ProjectRequestData {
    @NotNull
    @Size(min = 3, max = 250)
    private String name;

    private String description;
}
