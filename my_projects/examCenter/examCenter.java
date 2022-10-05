import java.util.Scanner;

class examCenter{

	private static final Scanner sc = new Scanner(System.in);

	public static void main(String [] args){

		// System.out.println("hay");

		String q1 = "What is your name?\n"+
					"(a)Ans1\n(b)Ans2\n(c)Ans3";
		String q2 = "What is your fav food?\n"+
					"(a)Ans1\n(b)Ans2\n(c)Ans3";

		Question [] q = {
			new Question(q1,"a"),
			new Question(q2,"b")
		};

		examCenter exam = new examCenter();
		exam.examStart(q);

	}

	public void examStart(Question [] q){

		int score = 0;

		for(int i = 0; i<q.length; i++){
			System.out.println(q[i].quesion);
			String answer = sc.nextLine();
			System.out.println("");

			if(answer.equals(q[i].answer)){
				score++;
			}
		}

		System.out.println(score);

		// examResult(score);

	}

	// public void int examResult(int score){

	// 	System.out.println();

	// }

}

class Question{
	String quesion,answer;
	Question(String quesion, String answer){
		this.quesion = quesion;
		this.answer = answer;
	}
}