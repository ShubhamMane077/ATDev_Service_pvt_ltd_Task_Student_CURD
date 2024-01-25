package com.nt.payloads;


public class StudentRequestDto {

	private int studentId;

	private String name;

	private String branch;

	private int age;

	public StudentRequestDto() {
	}

	public StudentRequestDto(int studentId, String name, String branch, int age) {
		super();
		this.studentId = studentId;
		this.name = name;
		this.branch = branch;
		this.age = age;
	}

	public int getStudentId() {
		return studentId;
	}

	public void setStudentId(int studentId) {
		this.studentId = studentId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getBranch() {
		return branch;
	}

	public void setBranch(String branch) {
		this.branch = branch;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

}
