package com.mr.service;

import java.util.List;

import com.mr.model.Student;

public interface StudentService {

	
	public List<Student> queryAll();
	public void insertStu(Student student);
	public void deleteStu(Integer id);
	public Student getStuById(Integer id);
	public void updateStu(Student student);
}
