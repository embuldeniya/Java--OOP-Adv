package com.gp;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;

@Entity
public class Student {
	
	@Id
	@GeneratedValue
	private int stdId;
	
	@Column
	private String name;
	
	@ManyToMany (cascade = CascadeType.ALL)
	@JoinTable(name="CourseEnrollment", 
	joinColumns= {@JoinColumn(name="stdId")},
	inverseJoinColumns = {@JoinColumn(name="courseId")})
	private List <Course> course = new ArrayList<Course>();
	
	
	
	@Override
	public String toString() {
		return "Student [id=" + stdId + ", name=" + name + ", course=" + course + "]";
	}
	

	public List<Course> getCourse() {
		return course;
	}
	public void setCourse(List<Course> course) {
		this.course = course;
	}
	public int getId() {
		return stdId;
	}
	public void setId(int id) {
		this.stdId = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	
	

}
