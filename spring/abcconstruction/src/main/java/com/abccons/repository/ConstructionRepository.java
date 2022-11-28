package com.abccons.repository;

import java.util.List;

import com.abccons.entity.Construction;

public interface ConstructionRepository {
	public Construction createConstructor(Construction cons);
	public List<Construction> getAllConstructionCompany();
	public Construction getConstructionByRegNo(int regNo);
	public List<Construction> deleteConstructionRegNo(int regNo);
	public Construction updateConstruction(Construction cons);
}
