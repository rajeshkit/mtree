package com.abccons.exception;

public class ConstructionNotFoundException extends RuntimeException {
	public ConstructionNotFoundException() {
		super();
	}
	public ConstructionNotFoundException(String msg) {
		super(msg);
	}
}
