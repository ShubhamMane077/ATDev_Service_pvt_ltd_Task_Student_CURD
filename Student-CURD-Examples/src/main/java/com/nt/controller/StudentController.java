package com.nt.controller;

import com.nt.payloads.*;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


import com.nt.service.StudentService;


@RestController
@RequestMapping("/students")
public class StudentController {

	@Autowired
	private StudentService studentService;

	@PostMapping
	public String addStudent(@RequestBody StudentRequestDto studentDto) {
		studentService.addStudent(studentDto);
		return "Student Added Successful.";
	}

	@PutMapping("/{id}")
	public String updateStudent(@PathVariable int id,@RequestBody StudentRequestDto studentRequestDto) {
		
		StudentResponseDto existingStudent = studentService.getStudentById(id);
		if (existingStudent != null) {
	        studentService.updateStudent(id, studentRequestDto);
	        return "Student Update Successful.";
	    } else {
	        return "Student not found with id: " + id;
	    }
		
	}
	
	@GetMapping(value = "/all")
	public List<StudentResponseDto> getAllStudent(){
		return studentService.getAllStudents();
	}
	@GetMapping(value = "/id/{id}")
	public StudentResponseDto getStudentById(@PathVariable int id) {
		return studentService.getStudentById(id);
	}
	
	@DeleteMapping(value = "/id/{id}")
	public String deleteStudentById (@PathVariable int id) {
		studentService.deleteStudentById(id);
		return "Student deleted successfull.";
	}
	
}
