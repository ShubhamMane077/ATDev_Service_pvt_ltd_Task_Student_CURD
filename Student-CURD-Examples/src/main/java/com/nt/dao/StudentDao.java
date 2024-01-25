package com.nt.dao;

import com.nt.entity.Student;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

public interface StudentDao extends CrudRepository<Student, Integer> {

	List<Student>findAll();
}
