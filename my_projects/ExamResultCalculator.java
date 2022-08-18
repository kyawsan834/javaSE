class ExamResultCalculator{

	public static void main(String[] args){

		// System.out.println("hay");

		int mark = Integer.parseInt(args[0]);

		// System.out.println("hay " + mark);

		// checking mark for user 
		if(mark < 0 || mark > 100){
			System.out.println("Invalid Mark");
		}else if(mark >=40 && mark <= 79){
			System.out.println("Exam Passed");
		}else if(mark > 79 && mark <= 100){
			System.out.println("Congraz... Exam Passed with Destination");
		}else{
			System.out.println("Oh No! Please be careful in Next Time");
		}

	}

}