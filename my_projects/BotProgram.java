// package com.hkk.java;

// note i really try to add scanner sc in variable but it stop the program immediately, that's why i remove 'or'and try with only Captial Letter.


import java.util.Scanner;

public class BotProgram {
	
	protected static final String botName = "Crazy Bot";
	// protected static final String developerName = "Mr.Kyaw San";
	
	private static final Scanner sc = new Scanner(System.in);
	
	public BotProgram() {
//		welcomeMsg();
	}

	private static void welcomeMsg() {
		
		System.out.println("Hello I am " + botName +". How can I help you?");
		
	}

	public void askUser(Scanner sc) {
		System.out.println("Begin Program? Please type in capital letter only Y/N?");
		if("Y".equals(sc.nextLine())) {
			Question que = new Question();
			 que.question();
			 System.exit(0);
		}else {
			System.out.println("Thanks 4 using.");
		}
	}

	public static String getDevelopername() {
		return developerName;
	}

	public static void main(String[] args) {

		// System.out.println("hay");

		
		try{
			BotProgram objBot = new BotProgram();
			welcomeMsg();
			objBot.askUser(sc);
		}catch(Exception ex){
			System.out.println("an error has been occured.");
			ex.printStackTrace();
		}finally{
			sc.close();
		}

	}

}

class Question{
	String name;
	public Question() {
//		question();
	}
	
	public void question() {
		try (Scanner sc = new Scanner(System.in)) {

			System.out.println("There are 2 many suprise 4 you. \r\n\r\nPlease ask questions that you want from below. hints: please type a character from A to C; \nor  do you stop questions and exit program please type 'e'.");
			
			if("A".equals(sc.nextLine())) {
				qusOne(sc);
			}else if("B".equals(sc.nextLine())) {
				
				qusTwo(sc,name);
			}else if("C".equals(sc.nextLine())) {
				qusThree(sc);
			}else if("e".equals(sc.nextLine())) {
				System.out.println("Are you sure want to exit? Please type in capital letter only Y/N");
				if("Y".equals(sc.nextLine())) {
					System.out.println("Thanks 4 using.");
				}else {
					question();
				}
			}
		}catch(Exception ex){
			String errorMsg = "You got an error "+ ex;
			ex.printStackTrace();
			System.out.println(errorMsg);
		}
	}
	
	public void qusOne(Scanner sc) {
		System.out.println("Question Set A. => \t 1.Who are you? \t 2.Who create you? \t 3.What can you do? \n ");
		AnswerOne botAns = new AnswerOne();
		if("1".equals(sc.nextLine())) {
			botAns.qusOneAnswer1();

			System.out.println("Try to ask another question? Please type in capital letter only Y/N?");
			if("Y".equals(sc.nextLine())){
				question();
			}else{
				System.out.println("Thanks 4 using");
			}

		}else if("2".equals(sc.nextLine())) {
			botAns.qusOneAnswer2();

			System.out.println("Try to ask another question? Please type in capital letter only Y/N?");
			if("Y".equals(sc.nextLine())){
				question();
			}else{
				System.out.println("Thanks 4 using");
			}
		}else if("3".equals(sc.nextLine())) {
			botAns.qusOneAnswer3();

			System.out.println("Try to ask another question? Please type in capital letter only Y/N?");
			if("Y".equals(sc.nextLine())){
				question();
			}else{
				System.out.println("Thanks 4 using");
			}
		}else {
			botAns.wrongInput();
			this.qusOne(sc);
			sc.close();
		}
	}
	
	public void qusTwo(Scanner sc,String name) {
		System.out.println("Question Set B. => \t 1.Do you know my name? \t 2.Tell me a joke \t 3.Are you single? \n ");
		AnswerTwo botAns2 = new AnswerTwo();
		if("1".equals(sc.nextLine())) {
			botAns2.qusSecAnswer1(sc,name);
			System.out.println("Try to ask another question? Please type in capital letter only Y/N?");
			if("Y".equals(sc.nextLine())){
				question();
			}else{
				System.out.println("Thanks 4 using");
			}
		}else if("2".equals(sc.nextLine())) {
			botAns2.qusSecAnswer2();
			System.out.println("Try to ask another question? Please type in capital letter only Y/N?");
			if("Y".equals(sc.nextLine())){
				question();
			}else{
				System.out.println("Thanks 4 using");
			}
		}else if("3".equals(sc.nextLine())) {
			botAns2.qusSecAnswer3();
			System.out.println("Try to ask another question? Please type in capital letter only Y/N?");
			if("Y".equals(sc.nextLine())){
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
		AnswerThree botAns = new AnswerThree();
		if("1".equals(sc.nextLine())) {
			botAns.qusThreeAnswer1();

			System.out.println("Try to ask another question? Please type in capital letter only Y/N?");
			if("Y".equals(sc.nextLine())){
				question();
			}else{
				System.out.println("Thanks 4 using");
			}

		}else if("2".equals(sc.nextLine())) {
			botAns.qusThreeAnswer2();

			System.out.println("Try to ask another question? Please type in capital letter only Y/N?");
			if("Y".equals(sc.nextLine())){
				question();
			}else{
				System.out.println("Thanks 4 using");
			}
		}else if("3".equals(sc.nextLine())) {
			botAns.qusThreeAnswer3();

			System.out.println("Try to ask another question? Please type in capital letter only Y/N?");
			if("Y".equals(sc.nextLine())){
				question();
			}else{
				System.out.println("Thanks 4 using");
			}
		}else {
			botAns.wrongInput();
		}
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
	
	public void qusSecAnswer1(Scanner sc, String name) {
		System.out.println("I'm sorry, What should I call you? Please type below. eg. Barry Allen");
		// getName(sc,name);
	 	name = sc.nextLine();
		System.out.println("You'd like me to call you by the name. Is that right? Please type in capital letter only Y/N?");
		if("Y".equals(sc.nextLine())){
			System.out.println("Hello " + name +".");
			System.out.println("Thanks you " + name + " for teaching me.");

		}else{
			System.out.println("Alright. What should I call you? Please type below. eg. Barry Allen");
			// getName(sc,name);
			name = sc.nextLine();
			System.out.println("Hello " + name +".");
			System.out.println("Thanks you " + name + " for teaching me.");
			// System.out.println("Do you want nickname? y/n?");
			// if("y".equals(sc.nextLine()) || "Y".equals(sc.nextLine())){
			// 	String arrOne = {""};
			// }

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

class AnswerThree extends BotProgram{

	private static final String movieName = "The Flash Series";
	
	public void qusThreeAnswer1() {
		System.out.println("My favourite movie is " + movieName);
	}
	
	public void qusThreeAnswer2() {
		System.out.println("Digital bot like me don't have a gender, but I love when humans are their true selves ad honor their gender identity.");
	}
	
	public void qusThreeAnswer3() {
		System.out.println("I can't feel romantic love but I think you are wonderful.");
	}
	
	public void wrongInput() {
		System.out.println("Wrong Input");
	}
}

// DRY 
// Don't repeat yourself
// Thanks Sayar Hein Ko Ko

// learning and applying this assignment with all lecture.

// note random jokes are add on array and show user random jokes with loop conditon.
