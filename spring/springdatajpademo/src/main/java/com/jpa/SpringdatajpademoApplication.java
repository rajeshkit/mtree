package com.jpa;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;

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

		Construction cons = new Construction("L&T", "L&T@gmail.com", 545987, "Chennai");
		Project pro = new Project("Roadways", cons);
		projRepo.save(pro);

//
//		
//	projRepo.save(pro);
//	Optional<Project> op = projRepo.findById(1);

		// get the construction based on by construction company name
		// get the construction based on by construction company email
		// get the construction based on by construction company profit
//			Construction cons1= consRepo.findByCompaEmail("jffp@gmail.com");
//				
//				System.out.println(cons1);

//			
//			List<Construction> list = consRepo.findAll();
//			
		// Optional<Construction> construction = consRepo.findById(46578);
		// boolean status = consRepo.existsById(46578);
//			if(status==true) {
		// consRepo.deleteById(46578);
//			}else {
//				System.out.println("does not exists");
//			}
//			boolean status1 = consRepo.existsById(cons.getCompanyRegistration());
//			if(status1==true) {
		// consRepo.save(cons); // update the data
//			}else {
//				System.out.println("There is no construction object with regno:"+cons.getCompanyRegistration()+" do u want to insert");
//				consRepo.save(cons); // insert
//			}
	}

}
