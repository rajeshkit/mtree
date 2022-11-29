package com.abccons.controller;

import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.abccons.entity.Project;

@RestController
public class ProjectController {
	Project project = null;

	@GetMapping(value = "/projects")
	public List<Project> createProject() {
		if (project == null) {
			throw new NullPointerException("Project not found");
		}
		return Arrays.asList(new Project(111, "Complex", 855), new Project(121, "Complex", 5757),
				new Project(511, "Complex", 5656));

	}

}
