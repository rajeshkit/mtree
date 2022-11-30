package com.jpa;

import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.jpa.entity.Construction;
import com.jpa.entity.Project;
import com.jpa.repository.ConstructionRepository;
import com.jpa.repository.ProjectRepository;

@SpringBootApplication
public class SpringdatajpademoApplication implements CommandLineRunner {

	@Autowired
	ConstructionRepository consRepo;

	@Autowired
	ProjectRepository projRepo;

	public static void main(String[] args) {
		SpringApplication.run(SpringdatajpademoApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		Construction c1=new Construction();
		c1.setCompanyName("Reliance");
		c1.setCompanyEmail("reliance@gmail.com");
		c1.setCompanyProfit(67876);
		
		Construction c2=new Construction();
		c2.setCompanyName("L&T");
		c2.setCompanyEmail("l&t@gmail.com");
		c2.setCompanyProfit(167876);
		
		List<Project> list=Arrays.asList(
				new Project(0,"Highways"),
				new Project(0,"Antalia"));
		List<Project> list1=Arrays.asList(
				new Project(0,"Express Hway"),
				new Project(0,"Shopping mall"),
				new Project(0,"Theater")); 
		c2.setProjects(list1);
		c1.setProjects(list);
		consRepo.save(c1);
		consRepo.save(c2);

	}

}
