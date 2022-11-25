package com.mvc.repsoitory;

import java.util.List;

import com.mvc.model.Student;



public interface StudentRepository {
	public int registerNewStudent(Student student);
	public List<Student> getAllStudents();
	public Student getStudentById(int studentId);
	public Student updateStudent(Student student);
	public int deleteStudentById(int studentId);
}
