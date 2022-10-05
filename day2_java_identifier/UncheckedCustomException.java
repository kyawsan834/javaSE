package com.hkk.exceptionhandling.customexception;

import java.util.Scanner;

public class UncheckedCustomException {

	public static void main(String[] args) throws AgeRestrictionException {
		try (Scanner sc = new Scanner(System.in);) {
			int age = Integer.parseInt(sc.nextLine());
			if (age > 10) {
				throw new AgeRestrictionException("Hello Grandpa!");
			}
		}
	}
}

class AgeRestrictionException extends RuntimeException{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	public AgeRestrictionException(String s) {
		super(s);
	}
	
}