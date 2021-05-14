package com.springrest.SpringRest.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Course {

	@Id
	@Column(name = "courseId")
	private int id;
	private String title;
	private String description;
	
	public Course(int id, String title, String description) {
		super();
		this.id = id;
		this.title = title;
		this.description = description;
	}
	public Course() {
		super();
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	@Override
	public String toString() {
		return "Course [id=" + id + ", title=" + title + ", description=" + description + "]";
	}
	
	
}
