package com.example.projecttracker.model;

import java.util.Date;

import lombok.Getter;

/**
 * @author Biswajit Dutta
 * @since  May 14, 2020
 */
public class ItemCategoryResponse {

	@Getter
	private short itemCategoryId;
	@Getter
	private String categoryName;
	@Getter
	private boolean isDeleted;
	@Getter
	private String createdBy;
	@Getter
	private Date createdDt;
	@Getter
	private String updatedBy;
	@Getter
	private Date updatedDt;
}
