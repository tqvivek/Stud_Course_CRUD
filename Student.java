package com.crud;

public class Student {
	private int studId;
	private String studName;
	private int studAge;
	private Course course;

	public Student() {

	}

	public Student(int studId, String studName, int studAge, Course course) {
		super();
		this.studId = studId;
		this.studName = studName;
		this.studAge = studAge;
		this.course = course;
	}

	public int getStudId() {
		return studId;
	}

	public void setStudId(int studId) {
		this.studId = studId;
	}

	public String getStudName() {
		return studName;
	}

	public void setStudName(String studName) {
		this.studName = studName;
	}

	public int getStudAge() {
		return studAge;
	}

	public void setStudAge(int studAge) {
		this.studAge = studAge;
	}

	public Course getCourse() {
		return course;
	}

	public void setCourse(Course course) {
		this.course = course;
	}

	@Override

	public String toString() {
		return "Student [studId=" + studId + ", studName=" + studName + ", studAge=" + studAge + ", course=" + course
				+ "]";
	}

}
