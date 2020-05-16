package com.example.projecttracker.mapper;

import com.example.projecttracker.entity.ProjectEntity;
import com.example.projecttracker.response.v1.ProjectResponse;
import org.mapstruct.Mapper;

/**
 * @author Ayan Bhuin
 * @since April 29, 2020
 */

@Mapper
public interface ProjectMapper {
    ProjectEntity toEntity(ProjectResponse model);
    ProjectResponse toResponse(ProjectEntity entity);
}
