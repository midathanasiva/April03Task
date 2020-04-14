package com.cg.entity;

public class Student 
{
	public int id;
	public String name;
	public String dept;
	public String university;

	public Student() {
		
	}
	public Student(int id, String name, String dept, String university) {
		super();
		this.name = name;
		this.id = id;
		this.dept = dept;
		this.university = university;
	}

}
