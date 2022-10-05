// package com.hkk.java;

import java.util.Scanner;

public class BotProgram {
	
	protected static final String botName = "Crazy Bot";
	protected static final String developerName = "Mr.Kyaw San";
	
	private static final Scanner sc = new Scanner(System.in);
	
	public BotProgram() {
//		welcomeMsg();
	}

	private static void welcomeMsg() {
		
		System.out.println("Hello I am " + botName +". How can I help you?");
		
	}

	public static void main(String[] args) {
		
		BotProgram objBot = new BotProgram();
		welcomeMsg();
		objBot.askUser(sc);

	}
	
	public void askUser(Scanner sc) {
		System.out.println("Begin Program? y/n?");
		if("Y".equals(sc.nextLine()) || "y".equals(sc.nextLine()) ) {
			Question que = new Question();
			 que.question();
		}else {
			System.out.println("Thanks 4 using.");
		}
	}

	public static String getDevelopername() {
		return developerName;
	}

}

class Question{
	String name;
	public Question() {
//		question();
	}
	
	public void question() {
		try (Scanner sc = new Scanner(System.in)) {

			System.out.println("There are 2 many suprise 4 you. \r\n\r\nPlease ask questions that you want from below. hints: type a character. eg:'A or a'; \nor  do you stop questions and exit program please type 'e'.");
			
			if("A".equals(sc.nextLine()) || "a".equals(sc.nextLine())) {
				qusOne(sc);
			}else if("B".equals(sc.nextLine()) || "b".equals(sc.nextLine())) {
				
				qusTwo(sc,name);
			}else if("C".equals(sc.nextLine()) || "c".equals(sc.nextLine())) {
				qusThree(sc);
			}else if("e".equals(sc.nextLine()) || "E".equals(sc.nextLine()) ) {
				System.out.println("Are you sure want to exit? y/n?");
				if("Y".equals(sc.nextLine()) || "y".equals(sc.nextLine())) {
					System.out.println("Thanks 4 using.");
				}else {
					qusOne(sc);
				}
			}
		}
	}
	
	public void qusOne(Scanner sc) {
		System.out.println("Question Set A. => \t 1.Who are you? \t 2.Who create you? \t 3.What can you do? \n ");
		AnswerOne botAns = new AnswerOne();
		if("1".equals(sc.nextLine())) {
			botAns.qusOneAnswer1();

			System.out.println("Try to ask another question? y/n?");
			if("y".equals(sc.nextLine()) || "Y".equals(sc.nextLine())){
				question();
			}else{
				System.out.println("Thanks 4 using");
			}

		}else if("2".equals(sc.nextLine())) {
			botAns.qusOneAnswer2();

			System.out.println("Try to ask another question? y/n?");
			if("y".equals(sc.nextLine()) || "Y".equals(sc.nextLine())){
				question();
			}else{
				System.out.println("Thanks 4 using");
			}
		}else if("3".equals(sc.nextLine())) {
			botAns.qusOneAnswer3();

			System.out.println("Try to ask another question? y/n?");
			if("y".equals(sc.nextLine()) || "Y".equals(sc.nextLine())){
				question();
			}else{
				System.out.println("Thanks 4 using");
			}
		}else {
			botAns.wrongInput();
		}
	}
	
	public void qusTwo(Scanner sc,String name) {
		System.out.println("Question Set B. => \t 1.Do you know my name? \t 2.Tell me a joke \t 3.Are you single? \n ");
		AnswerTwo botAns2 = new AnswerTwo();
		if("1".equals(sc.nextLine())) {
			botAns2.qusSecAnswer1(sc,name);
			System.out.println("Try to ask another question? y/n?");
			if("y".equals(sc.nextLine()) || "Y".equals(sc.nextLine())){
				question();
			}else{
				System.out.println("Thanks 4 using");
			}
		}else if("2".equals(sc.nextLine())) {
			botAns2.qusSecAnswer2();
			System.out.println("Try to ask another question? y/n?");
			if("y".equals(sc.nextLine()) || "Y".equals(sc.nextLine())){
				question();
			}else{
				System.out.println("Thanks 4 using");
			}
		}else if("3".equals(sc.nextLine())) {
			botAns2.qusSecAnswer3();
			System.out.println("Try to ask another question? y/n?");
			if("y".equals(sc.nextLine()) || "Y".equals(sc.nextLine())){
				question();
			}else{
				System.out.println("Thanks 4 using");
			}
		}else {
			botAns2.wrongInput();
		}
	}
	
	public void qusThree(Scanner sc) {
		System.out.println("Question Set C. => \t 1.What is your favourite movie? \t 2.Are you male or female? \t 3.Do you love me? \n ");
	}
}

// abstract class Repeat extends Question{

// 	public static void	Scanner sc = new Scanner(System.in);

// 	public abstract reapeatAsk();
// 	public void reapeatAsk(sc){
// 		System.out.println("Try ask another question? y/n?");

// 		if("Y".equals(sc.nextLine()) || "y".equals(sc.nextLine)){
// 			question();
// 		}else{
// 			System.out.println("Thanks 4 using.");
// 		}
// 	}
// }

class AnswerOne extends BotProgram{
	
	public void qusOneAnswer1() {
		System.out.println("I am " + (botName) + ".");
	}
	
	public void qusOneAnswer2() {
		System.out.println((developerName) + " create me.");
	}
	
	public void qusOneAnswer3() {
		System.out.println("I can learn, code and love.");
	}
	
	public void wrongInput() {
		System.out.println("Wrong Input");
	}
}

class AnswerTwo extends BotProgram{

	private String name;

	// public void getName(Scanner sc,String name){
	// 	name = sc.nextLine();
	// }
	
	public void qusSecAnswer1(Scanner sc, String name) {
		System.out.println("I'm sorry, What should I call you? Please type below. eg. Barry Allen");
		// getName(sc,name);
	 	name = sc.nextLine();
		System.out.println("You'd like me to call you by the name. Is that right? y/n?");
		if("y".equals(sc.nextLine()) || "Y".equals(sc.nextLine())){
			System.out.println("Hello " + name +".");

		}else{
			System.out.println("Alright. What should I call you? Please type below. eg. Barry Allen");
			// getName(sc,name);
			name = sc.nextLine();
			System.out.println("Hello " + name +".");
		}
	}
	
	public void qusSecAnswer2() {
		System.out.println("How do you make a squid laugh? \n With ten-tickles XDXD.");
	}
	
	public void qusSecAnswer3() {
		System.out.println("I'm happy to say I feel whole all on my own.");
	}
	
	public void wrongInput() {
		System.out.println("Wrong Input");
	}
}