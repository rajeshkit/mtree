package com.jpa;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.jpa.entity.Construction;
import com.jpa.repository.ConstructionRepository;

@SpringBootApplication
public class SpringdatajpademoApplication implements CommandLineRunner {
	
	@Autowired
	ConstructionRepository consRepo;
	
	public static void main(String[] args) {
		SpringApplication.run(SpringdatajpademoApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
			Construction cons=new Construction(89666, "Reliance", "reliancea@gmail.com", 5765);
			List<Construction> list = consRepo.findAll();
			for (Construction construction : list) {
				System.out.println(construction);
			}
	}

}
