package com.example.projecttracker.request.v1;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import lombok.Getter;
import lombok.Setter;

/**
 * @author Biswajit Dutta
 * @since  May 14, 2020
 */
public class ItemTypeRequestData {

	@NotNull(message = "Item Type Name is required")
	@Size(max = 50)
	@Getter
	@Setter
	private String typeName;
	@Getter
	@Setter
	private boolean isDeleted;
	@NotNull(message = "CreatedBy user needs to be mentioned")
	@Getter
	@Setter
	private String createdBy;
	@NotNull(message = "UpdatedBy user needs to be mentioned")
	@Getter
	@Setter
	private String updatedBy;
}
