package com.mvc.service;

import java.util.List;

import com.mvc.model.Student;

public interface StudentService {
	public int registerNewStudent(Student student);
	public List<Student> getAllStudents();
	public Student getStudentById(int studentId);
	public Student updateStudent(Student student);
	public int deleteStudentById(int studentId);
}
