package com.abccons.exception;

import java.io.Serializable;
import java.util.Date;

public class ErrorResponse implements Serializable {
	private Date doe;
	private String message;
	private String path;
	public ErrorResponse(Date doe, String message, String path) {
		super();
		this.doe = doe;
		this.message = message;
		this.path = path;
	}
	public Date getDoe() {
		return doe;
	}
	public void setDoe(Date doe) {
		this.doe = doe;
	}
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	public String getPath() {
		return path;
	}
	public void setPath(String path) {
		this.path = path;
	}
	
}
