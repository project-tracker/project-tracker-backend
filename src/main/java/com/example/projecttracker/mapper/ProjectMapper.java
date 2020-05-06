package com.example.projecttracker.mapper;

import com.example.projecttracker.entity.ProjectEntity;
import com.example.projecttracker.model.Project;
import com.example.projecttracker.repository.ProjectDAO;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;

/**
 * @author Ayan Bhuin
 * @since April 29, 2020
 */

public interface ProjectMapper {
    @Mappings({
            @Mapping(target="id", source="id"),
            @Mapping(target="description", source="description")
    })
    ProjectEntity toProjectEntity(Project model);

    @Mappings({
            @Mapping(target="id", source="id"),
            @Mapping(target="description", source="description")
    })
    Project toProjectModel(ProjectEntity entity);
}
