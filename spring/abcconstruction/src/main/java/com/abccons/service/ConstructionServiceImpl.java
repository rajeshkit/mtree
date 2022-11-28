package com.abccons.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.abccons.entity.Construction;
import com.abccons.repository.ConstructionRepository;
@Service
public class ConstructionServiceImpl implements ConstructionService {
	@Autowired
	ConstructionRepository constructionRepository;
		
	@Override
	public Construction createConstructor(Construction cons) {
		// TODO Auto-generated method stub
		return constructionRepository.createConstructor(cons);
	}

	@Override
	public List<Construction> getAllConstructionCompany() {
		return constructionRepository.getAllConstructionCompany();
	}

	@Override
	public Construction getConstructionByRegNo(int regNo) {
		return constructionRepository.getConstructionByRegNo(regNo);
	}

	@Override
	public List<Construction> deleteConstructionRegNo(int regNo) {
		return constructionRepository.deleteConstructionRegNo(regNo);
	}

	@Override
	public Construction updateConstruction(Construction cons) {
		// TODO Auto-generated method stub
		return constructionRepository.updateConstruction(cons);
	}

}
