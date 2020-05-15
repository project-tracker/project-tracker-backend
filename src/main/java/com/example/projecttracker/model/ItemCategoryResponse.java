package com.example.projecttracker.model;

import java.util.Date;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

/**
 * @author Biswajit Dutta
 * @since  May 14, 2020
 */

@Getter
@Setter
@NoArgsConstructor
public class ItemCategoryResponse {

	private short itemCategoryId;
	private String categoryName;
	private boolean isDeleted;
	private String createdBy;
	private Date createdDt;
	private String updatedBy;
	private Date updatedDt;
}
