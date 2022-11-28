package com.abccons.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.abccons.entity.Construction;
import com.abccons.service.ConstructionService;

@RestController
public class ConstructionController {
	@Autowired
	ConstructionService constructionService;
	
	@PostMapping(value = "/constructions/construction")
	public Construction createConstructionCompany(@RequestBody Construction construction) {
		return constructionService.createConstructor(construction);
	}

	@GetMapping(value = "/constructions")
	public List<Construction> getAllConstructionCompany() {
		return constructionService.getAllConstructionCompany();
		
	}
	@GetMapping(value = "/constructions/construction/{regno}")
	public Construction getConstructionCompanyByRegNo(@PathVariable("regno") int registrationNumber) {
		return constructionService.getConstructionByRegNo(registrationNumber);
		
	}
	
	@DeleteMapping(value = "/constructions/construction/{regno}")
	public List<Construction> deleteConstructionCompanyByRegNo(@PathVariable("regno") int registrationNumber) {
		return constructionService.deleteConstructionRegNo(registrationNumber);
		
	}
	@PutMapping(value = "/constructions/construction")
	public Construction updateConstructionCompany(@RequestBody Construction cons) {
		return constructionService.updateConstruction(cons);
		
	}

}
