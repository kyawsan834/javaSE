package com.hkk.exceptionhandling;

import java.util.Scanner;

public class Foodie {

	public static void main(String[] args) throws ClassNotFoundException{
		Food food = new Food();
		food.reqInput();
	}
}

class Food {

	public void reqInput() throws ClassNotFoundException{
		System.out.println("Choose Food Type");
		System.out.println("1. ChineseFood");
		System.out.println("2. JapaneseFood");
		System.out.print("Type Number > ");
		try(Scanner sc = new Scanner(System.in)) {
			String number = sc.nextLine();
			if (!("1".equals(number) || "2".equals(number))) {
				UncheckedFoodException.noMenuException();
			}
			Food food = "1".equals(number)? new ChineseFood():new JapneseFood();
			if (food instanceof ChineseFood) {
				ChineseFood chineseFood = (ChineseFood) food;
				chineseFood.chooseMenu();
			}
		}
	}
}

class ChineseFood extends Food {

	public void chooseMenu() throws ClassNotFoundException{
		System.out.println("Choose Food Menu");
		System.out.println("1. MalarXingGo");
		System.out.println("2. Hotpot");
		System.out.print("Type Number > ");
		try(Scanner sc = new Scanner(System.in)) {
			String number = sc.nextLine();
			/*
			 * if (!("1".equals(number) || "2".equals(number))) {
			 * UncheckedFoodException.noMenuException(); }
			 */
			ChineseFood chineseFood = "1".equals(number)? new MalarXingGo():new ChineseFood();
			if (chineseFood instanceof MalarXingGo) {
				MalarXingGo malarXingGo = (MalarXingGo) chineseFood;
				malarXingGo.chooseFlavor();
			} else if (chineseFood instanceof Hotpot) {
				Hotpot hotpot = (Hotpot) chineseFood;
				hotpot.chooseFlavor();
			} else {
				CheckedFoodParentChildException.classWrongException(chineseFood.getClass().getSimpleName());
			}
		}
	}
}

class MalarXingGo extends ChineseFood {

	public void chooseFlavor() {
		
	}

}

class Hotpot extends ChineseFood {

	public void chooseFlavor() {
		// TODO Auto-generated method stub
		
	}

}

class CheckedFoodParentChildException {
	static void classWrongException(String className) throws ClassNotFoundException{
		throw new ClassNotFoundException("You are working on Class Name: "+ className +" .");
	}
}

class UncheckedFoodException {
	static void noMenuException() {
		throw new NumberFormatException("No Menu Found!");
	}
	static void noFlavorException() {
		throw new NumberFormatException("No Flavor Found!");
	}
}

class JapneseFood extends Food{
	
}





