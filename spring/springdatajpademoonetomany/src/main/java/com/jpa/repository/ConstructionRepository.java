package com.jpa.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.jpa.entity.Construction;

public interface ConstructionRepository 
	extends JpaRepository<Construction, Integer> {
	//@Query(value = "SELECT c from Construction c where c.companyEmail=?1")    // JPQL -> Java Persistent Query Language
	@Query(value = "SELECT * from construction c where c.company_email=?1",nativeQuery = true)  // sql query
	public Construction findByCompaEmail(String cemail); 
	// jpa will generate for the above method
	
	
}
