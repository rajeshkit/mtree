package com.jpa.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.jpa.entity.Construction;

public interface ConstructionRepository 
	extends JpaRepository<Construction, Integer> {
	
}
