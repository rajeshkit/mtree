package com.mvc.repsoitory;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.RequestMapping;

import com.mvc.model.Student;
@Repository
public class StudentRepositoryImpl implements StudentRepository{
	@Override
	public int registerNewStudent(Student student) {
		String url = "jdbc:mysql://localhost:3306/mindtree?useSSL=false";
		String user="root";
		String password="root@123";
		Connection con;
		PreparedStatement pstmt;
		int status=0;
		try {
			con = DriverManager.getConnection(url, user, password);
			pstmt=con.prepareStatement("INSERT INTO student VALUES(?,?,?)");
			pstmt.setInt(1, student.getStudentId());
			pstmt.setString(2, student.getStudentName());
			pstmt.setString(3, student.getStudentEmail());
			status = pstmt.executeUpdate();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return status;
	}

	@Override
	public List<Student> getAllStudents() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Student getStudentById(int studentId) {
		String url = "jdbc:mysql://localhost:3306/mindtree?useSSL=false";
		String user="root";
		String password="root@123";
		Connection con;
		PreparedStatement pstmt;
		ResultSet rs;
		Student student=null;
		try {
			con = DriverManager.getConnection(url, user, password);
			pstmt=con.prepareStatement("SELECT * from student where id=?");
			pstmt.setInt(1, studentId);
			rs = pstmt.executeQuery();
			if(rs.next()) {
				student=new Student();
				student.setStudentId(rs.getInt(1));
				student.setStudentName(rs.getString(2));
				student.setStudentEmail(rs.getString(3));
			}else {
				student=null;
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return student;
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
