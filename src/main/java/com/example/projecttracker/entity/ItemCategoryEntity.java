package com.example.projecttracker.entity;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.*;

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
@Table(name = "item_category")
public class ItemCategoryEntity implements Serializable{

	private static final long serialVersionUID = -1893135628690897737L;

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private short itemCategoryId;
	@Column(length = 50, nullable = false)
	private String categoryName;

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
