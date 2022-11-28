package com.abccons.service;

import java.util.List;

import com.abccons.entity.Construction;

public interface ConstructionService {
	public Construction createConstructor(Construction cons);
	public List<Construction> getAllConstructionCompany();
	public Construction getConstructionByRegNo(int regNo);
	public List<Construction> deleteConstructionRegNo(int regNo);
	public Construction updateConstruction(Construction cons);
}
