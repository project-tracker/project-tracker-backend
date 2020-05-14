package com.example.projecttracker.request.v1;

/**
 * @author Biswajit Dutta
 * @since  May 14, 2020
 */
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import lombok.Getter;
import lombok.Setter;

public class CommentRequestData {

	@NotNull(message = "Comment Text is required")
	@Size(max = 50)
	@Getter
	@Setter
	private String commentText;
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
