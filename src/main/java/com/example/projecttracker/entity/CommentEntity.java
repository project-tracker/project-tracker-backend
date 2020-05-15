package com.example.projecttracker.entity;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

/**
 * @author Biswajit Dutta
 * @since  May 14, 2020
 */

@Getter
@Setter
@NoArgsConstructor
@Entity
@Table(name = "comment")
public class CommentEntity implements Serializable{

	private static final long serialVersionUID = -1893135628690897737L;

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int commentId;

	@Column(nullable = false)
	private String commentText;

	@Column(nullable = false, columnDefinition = "boolean default false")
	private boolean isDeleted;

	@Column(nullable = false)
	private String createdBy;

	@Column(nullable = false)
	@CreationTimestamp
	@Temporal(TemporalType.TIMESTAMP)
	private Date createdDt;

	@Column(nullable = false)
	private String updatedBy;

	@Column(nullable = false)
	@UpdateTimestamp
	@Temporal(TemporalType.TIMESTAMP)
	private Date updatedDt;
}
