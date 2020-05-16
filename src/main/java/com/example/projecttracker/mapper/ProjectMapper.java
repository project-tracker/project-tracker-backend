package com.example.projecttracker.mapper;

import com.example.projecttracker.entity.ProjectEntity;
import com.example.projecttracker.request.v1.ProjectRequestData;
import com.example.projecttracker.response.v1.ProjectResponseData;
import org.mapstruct.Mapper;

/**
 * @author Ayan Bhuin
 * @since April 29, 2020
 */

@Mapper
public interface ProjectMapper {
    ProjectEntity toEntity(ProjectRequestData requestData);
    ProjectResponseData toResponse(ProjectEntity entity);
}
