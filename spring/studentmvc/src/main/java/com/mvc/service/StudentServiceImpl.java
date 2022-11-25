package com.mvc.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mvc.model.Student;
import com.mvc.repsoitory.StudentRepository;
import com.mvc.repsoitory.StudentRepositoryImpl;
@Service
public class StudentServiceImpl implements StudentService {
	@Autowired
	private StudentRepository studentRepository;
	
	@Override
	public int registerNewStudent(Student student) {
		return studentRepository.registerNewStudent(student);
	}

	@Override
	public List<Student> getAllStudents() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Student getStudentById(int studentId) {
		return studentRepository.getStudentById(studentId);
	}

	@Override
	public Student updateStudent(Student student) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int deleteStudentById(int studentId) {
		// TODO Auto-generated method stub
		return 0;
	}

}
