package com.example.projecttracker.entity;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

/**
 * Entity for Project
 *
 * @author Ayan Bhuin
 * @since April 29, 2020
 */

@Getter
@Setter
@NoArgsConstructor
@Entity
@Table(name = "project")
public class ProjectEntity implements Serializable {

    @Id
    @SequenceGenerator(name = "project_seq", initialValue = 10000)
    @GeneratedValue(strategy = GenerationType.IDENTITY, generator = "project_seq")
    @Column
    private int id;

    @Column(nullable = false)
    private String name;

    @Column
    private String description;

    @Column(nullable = false)
    private boolean isDeleted;

    @Column
    private String createdBy;

    @Column
    @CreationTimestamp
    @Temporal(value = TemporalType.TIMESTAMP)
    private Date createdDate;

    @Column
    private String updatedBy;

    @Column
    @UpdateTimestamp
    @Temporal(value = TemporalType.TIMESTAMP)
    private Date updatedDate;
}
