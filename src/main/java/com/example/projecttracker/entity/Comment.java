package com.example.projecttracker.entity;

/**
 * @author Biswajit Dutta
 * @since  May 14, 2020
 */
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

import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

@Entity
@Table(name = "comment")
public class Comment implements Serializable{

	private static final long serialVersionUID = -1893135628690897737L;
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(nullable = false, unique = true)
	private int commentId;
	@Column(length = 50, nullable = false)
	private String commentText;
	@Column(nullable = false, columnDefinition = "bit default N")
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
	
	/**
	 * To Add -> @ManyToOne
	 *           @JoinColumn(name="itemId", nullable = false, updatable = false)
	 *           private Item item;
	 *           Generate @Getter @Setter
	 *           
	 *           Item Entity -> 
	 *           @OneToMany(fetch=FetchType.LAZY, mappedBy="item")
	 *           private Set<Comment> comment = new HashSet<>();
	 *           Generate @Getter @Setter
	 * @return
	 */
		
	public int getCommentId() {
		return commentId;
	}
	public void setCommentId(int commentId) {
		this.commentId = commentId;
	}
	public String getCommentText() {
		return commentText;
	}
	public void setCommentText(String commentText) {
		this.commentText = commentText;
	}
	public boolean isDeleted() {
		return isDeleted;
	}
	public void setDeleted(boolean isDeleted) {
		this.isDeleted = isDeleted;
	}
	public String getCreatedBy() {
		return createdBy;
	}
	public void setCreatedBy(String createdBy) {
		this.createdBy = createdBy;
	}
	public Date getCreatedDt() {
		return createdDt;
	}
	public void setCreatedDt(Date createdDt) {
		this.createdDt = createdDt;
	}
	public String getUpdatedBy() {
		return updatedBy;
	}
	public void setUpdatedBy(String updatedBy) {
		this.updatedBy = updatedBy;
	}
	public Date getUpdatedDt() {
		return updatedDt;
	}
	public void setUpdatedDt(Date updatedDt) {
		this.updatedDt = updatedDt;
	}
	@Override
	public String toString() {
		return "Comment [commentId=" + commentId + ", commentText=" + commentText + ", isDeleted=" + isDeleted
				+ ", createdBy=" + createdBy + ", createdDt=" + createdDt + ", updatedBy=" + updatedBy + ", updatedDt="
				+ updatedDt + "]";
	}
	
	
}
