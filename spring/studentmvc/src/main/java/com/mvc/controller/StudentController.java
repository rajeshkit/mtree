package com.mvc.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.mvc.model.Student;
import com.mvc.service.StudentService;
import com.mvc.service.StudentServiceImpl;

@Controller
public class StudentController {
	@Autowired
	private StudentService studentService;
	
	@RequestMapping("/")         // request mapping pattern
	public String welcomeHome() { // web request method
		return "index";	// view name or template name -> // Thymeleaf view resolver -> products.html //src/main/resources/template
	}
	@RequestMapping("/register")
	public String openRegistrationForm() { // web request method
		return "registration"; // invoke registration.html
		
		// ResponseBody
	}
	@RequestMapping("/rrr")
	@ResponseBody 
	public String findByName(String name) { // Web java method
		return "Hi Rajesh this is endpoint of rrr"; //yes.html
	}
	
	
	@RequestMapping("/sumbitform")
	public String submitStudentForm(@RequestParam("sid") int stuId,
			@RequestParam("sname") String stuName,
			@RequestParam("semail") String stuEmail) {
			Student s=new Student();s.setStudentId(stuId);
			s.setStudentEmail(stuEmail);s.setStudentName(stuName);
			// call Student Service - call Student Repository
			int result = studentService.registerNewStudent(s);
			String state=null;
			if(result!=0) {
				state = "registrationsuccess";
			}else {
				state="registrationfailure";
			}
			// jdbc code - insert the student
			// return an int - 0 - 1 -success
		return state;  // registrationsuccess.html or registrationfailure.html
	}
	@GetMapping("/search")
	public String openSearchByIdForm() {
	
		return "searchbyid";
	}
	@GetMapping("/findstudent")
	public String getStudentById(@RequestParam("stuid") int studentId,Model model) {
		StudentService studentService=new StudentServiceImpl();
		Student foundStudent=studentService.getStudentById(studentId);
		if(foundStudent!=null) {
			model.addAttribute("stu", foundStudent);
		}else {
			model.addAttribute("message", "Student not found");
		}
		return "displaystudent";// displaystudent.html
	}

}
