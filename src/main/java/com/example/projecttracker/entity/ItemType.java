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
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

@Entity
@Table(name = "itemtype")
public class ItemType implements Serializable{

	private static final long serialVersionUID = -1893135628690897737L;
	@Id
	@SequenceGenerator(name = "ItemTypeGen", sequenceName = "ItemTypeSeq", initialValue = 100, allocationSize = 100)
	@GeneratedValue(generator = "ItemTypeGen")
	@Column(nullable = false, unique = true)
	private short itemTypeId;
	@Column(length = 50, nullable = false)
	private String typeName;
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
	
	public short getItemTypeId() {
		return itemTypeId;
	}
	public void setItemTypeId(short itemTypeId) {
		this.itemTypeId = itemTypeId;
	}
	public String getTypeName() {
		return typeName;
	}
	public void setTypeName(String typeName) {
		this.typeName = typeName;
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
		return "ItemType [itemTypeId=" + itemTypeId + ", typeName=" + typeName + ", isDeleted=" + isDeleted
				+ ", createdBy=" + createdBy + ", createdDt=" + createdDt + ", updatedBy=" + updatedBy + ", updatedDt="
				+ updatedDt + "]";
	}
	
}
