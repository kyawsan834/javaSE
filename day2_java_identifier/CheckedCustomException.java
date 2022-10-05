package com.hkk.exceptionhandling.customexception;


public class CheckedCustomException {
	public static void main(String[] args) throws IncorrectClassName {
		try {
			Class.forName("com.hkk.exceptionhandling.customexception.AAA");
		} catch (ClassNotFoundException e) {
			throw new IncorrectClassName("Class Name that was written will be wrong!", e);
		}
	}
}

class IncorrectClassName extends ClassNotFoundException{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public IncorrectClassName(String s, Throwable tr) {
		super(s, tr);
	}
}