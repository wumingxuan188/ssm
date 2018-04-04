package com.mr.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mr.mapper.StudentMapper;
import com.mr.model.Student;
import com.mr.service.StudentService;

@Service
public class StudentServiceImpl implements StudentService{

	@Autowired
	private StudentMapper studentMapper;
	
	//查询
	public List<Student> queryAll(){
		return studentMapper.queryAll();
	}
	//新增
	public void insertStu(Student student) {
		studentMapper.insertSelective(student);
	}
	
	//删除
	public void deleteStu(Integer id) {
		studentMapper.deleteByPrimaryKey(id);
	}
	
	//查询单条
	public Student getStuById(Integer id) {
		 return studentMapper.selectByPrimaryKey(id);
	}
	//修改
	public void updateStu(Student student) {
		studentMapper.updateByPrimaryKeySelective(student);
	}
}
