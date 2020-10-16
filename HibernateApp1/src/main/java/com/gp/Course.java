package com.gp;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

@Entity
@Table (name = "CourseInfo")
public class Course {
	
	@Id
	@GeneratedValue
	private int id;
	private String title;
	private double fees;
	
	@ManyToMany (mappedBy = "course")
	private List<Student> student = new ArrayList<Student> ();

	
	public List<Student> getStudent() {
		return student;
	}

	public void setStudent(List<Student> student) {
		this.student = student;
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

	public double getFees() {
		return fees;
	}

	public void setFees(double fees) {
		this.fees = fees;
	}

	@Override
	public String toString() {
		return "Course [id=" + id + ", title=" + title + ", fees=" + fees + ", student=" + student + "]";
	}

	
	
	
	
	

}