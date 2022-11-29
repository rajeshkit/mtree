package com.abccons.entity;

public class Project {
	private int projectId;
	private String projectName;
	private int constructionCompany;
	public Project() {
		// TODO Auto-generated constructor stub
	}
	public Project(int projectId, String projectName, int constructionCompany) {
		super();
		this.projectId = projectId;
		this.projectName = projectName;
		this.constructionCompany = constructionCompany;
	}
	public int getProjectId() {
		return projectId;
	}
	public void setProjectId(int projectId) {
		this.projectId = projectId;
	}
	public String getProjectName() {
		return projectName;
	}
	public void setProjectName(String projectName) {
		this.projectName = projectName;
	}
	public int getConstructionCompany() {
		return constructionCompany;
	}
	public void setConstructionCompany(int constructionCompany) {
		this.constructionCompany = constructionCompany;
	}
	
}
