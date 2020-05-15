package com.example.projecttracker.mapper;

import com.example.projecttracker.entity.ProjectEntity;
import com.example.projecttracker.response.v1.Project;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;

/**
 * @author Ayan Bhuin
 * @since April 29, 2020
 */

@Mapper
public interface ProjectMapper {
    ProjectEntity toEntity(Project model);
    Project toModel(ProjectEntity entity);
}
