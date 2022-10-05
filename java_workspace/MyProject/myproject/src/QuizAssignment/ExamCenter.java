package QuizAssignment;

import java.util.Scanner;

class ExamCenter{

	private static final Scanner sc = new Scanner(System.in);
	
	ExamCenter(){
		welcomeMsg(sc);
		examQuestion();
	}

	public static void main(String [] args){

		// System.out.println("hay");
		
		ExamCenter examCenterObj = new ExamCenter();


	}
	
	public void welcomeMsg(Scanner sc) {
		
		System.out.println("Hello Welcome From IQ Test Center.\nBefore you start please type your name and start exam.\n");
		
		System.out.println(">> Enter your name");
		String name = sc.nextLine();
		System.out.println(">> Hello " + name + ". Exam is start... Great things are coming...\n");
		
	}
	
	public void examQuestion() {
		String q1 = "How do you know Java?\n"+
				"(a)Java is a programming language and a platform.\n(b)Java is a hyper text markup language.\n(c)Java is a coffee of name.";
		String q2 = " Which of the follwing below live on the heap in java?\n"+
				"(a)Class\n(b)Object\n(c)Instance variable";
		String q3 = "Which of the following interface is used to declare core methods in java?\n"+
				"(a)Set\n(b)EventListner\n(c)Collection";
		String q4 = "Which of these interface handle sequences?\n"+
				"(a)List\n(b)Set\n(c)Comparator";
		String q5 = "Which of this interface must contain a unique element?\n"+
				"(a)List\n(b)Set\n(c)Collection";
		String q6 = "Which of the following is true about primitives?\n"+
				"(a)You can call methods on a primitive.\n(b)You can convert a wrapper class object to a primitive by calling valueOf().\n(c) You can convert a primitive to a wrapper class object simply by assigning it.";
		String q7 = "Which two primitives have wrapper classes that are not merely the name of the primitive with an uppercase letter?\n"+
				"(a)char and int\n(b)byte and int\n(c)byte and char";
		String q8 = "Java SE8 Version code name\n"+
				"(a)Kestrel\n(b)Spider\n(c)Oak";
		String q9 = "Java SE8 release date\n"
				+"(a)2014-3-18\n(b)1996-01-21\n(c)2000-05-08";
		String q10 = "Who create Java?\n"+
				"(a)James Gosling\n(b)Bill Gates\n(c)Mark Zukerberg";
		String q11 = "Which number logically follows this series?\n"
				+ " 4     6     9     6     14     6      ...\n"+
				"(a)6\n(b)17\n(c)19";
		String q12 = "Tom has a new set of golf clubs. Using a club 8, the ball travels an average distance of 100 meters. \nUsing a club 7, the ball travels an average distance of 108 meters. Using a club 6, the ball travels an average distance of 114 meters. How far will the ball go if Tom uses a club 5?\n"+
				"(a)116 meters\n(b)118 meters\n(c)122 meters";
		String q13 = "Which answer expresses the meaning opposite of that of the specified word best?\n tough\nb"+
				"(a)tender\n(b)cowardly\n(c)starch";
		String q14 = "he mystery number is between 60 and 150, a multiple of 7, and the sum of its digits is 10. What is the mystery number?\n"+
				"(a)63\n(b)84\n(c)91";
		String q15 = "Two rabbits, butt to butt, start hopping in opposite directions for 2 meters, hop left 3 meters, \nand then left another 2 meters. What is the distance between them?\n"+
				"(a)12 meters\n(b)6 meters\n(c) None of the above";
		String q16 = "144, 233, 377, 610, ____, 1597, 2584. What is the missing number?\n"+
				"(a)1110\n(b)987\n(c)1287";
		String q17 = "The pińata participant notices she is facing west before blindfolded. She is spun 180 degrees to the left, \nthen 720 degrees to the right. In what direction is she now facing?\n"+
			"(a)South\n(b)West\n(c)East";
		String q18 = "Which number best completes the pattern?\r\n"
				+ "17, 12, 7\r\n"
				+ "3, 7, 11\r\n"
				+ "21, 16, (?)\n"+
				"(a)11\n(b)8\n(c)3";
		String q19 = "Divide 30 by 1/2 and add 10. What is the answer?\n"+
				"(a)50\n(b)70\n(c)60";
		String q20 = " Which number should come next in the pattern?"
				+ "37,34,31,28\n"+
				"(a)3\n(b)2\n(c)1";
	

	Question [] q = {
		new Question(q1,"a"),
		new Question(q2,"b"),
		new Question(q3,"c"),
		new Question(q4,"a"),
		new Question(q5,"b"),
		new Question(q6,"c"),
		new Question(q7,"a"),
		new Question(q8,"b"),
		new Question(q9,"a"),
		new Question(q10,"a"),
		new Question(q11,"c"),
		new Question(q12,"b"),
		new Question(q13,"a"),
		new Question(q14,"c"),
		new Question(q15,"b"),
		new Question(q16,"b"),
		new Question(q17,"c"),
		new Question(q18,"a"),
		new Question(q19,"b"),
		new Question(q20,"a"),
	};
	
	examStart(q);
	}

	public void examStart(Question [] q){

		int score = 0;
		int flag = 1;

		for(int i = 0; i<q.length; i++){
			System.out.println((flag++) + ". " + q[i].quesion);
			String answer = sc.nextLine();
			System.out.println("");

			if(answer.equals(q[i].answer)){
				score++;
			}
		}
		
		System.out.println("Total correct " + score +" of "+ q.length);

		examResultCalculate(score);

	}

	public void examResultCalculate(int score){
		
		double total = 0;
		total = score * 5;
		double percentage = total*100/100;
		
		System.out.println("Your total score is " + total);
		System.out.println("Your percentage is " + percentage + "%");
		
		if(total >=0 && total <40) {
			System.out.println("Try again.");
		}else if(total >=40 && total<=80) {
			System.out.print("Pass.");
		}else if(total >=80 && total <= 100) {
			System.out.println("Graduted.");
		}else {
			System.out.println("Ivalid Mark.");
		}

	}

}

class Question{
	String quesion,answer;
	Question(String quesion, String answer){
		this.quesion = quesion;
		this.answer = answer;
	}
}
