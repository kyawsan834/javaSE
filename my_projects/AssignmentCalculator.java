import java.util.Scanner;
class AssignmentCalculator{
	public static void main(String [] args){

		//Method 1 to 4 using are only args[] input.
		// Method 5 using scanner Class.


		AssignmentCalculator calc = new AssignmentCalculator();
		Scanner sc = new Scanner(System.in);


		Double a,b;
		String operator;
		String total;
		char operator1;
		Double total1;

		// System.out.println("hay");

		// a = Double.parseDouble(args[0]);
		// operator = args[1];
		// b = Double.parseDouble(args[2]);


		// Method 1
		// ====================================================

		// if("+".equals(operator)){
		// 	// total = a + b; //error coming need to ask to sayar Hein Ko Ko
		// 	System.out.println("Result [" + (a+b) + "]");
		// }else if("-".equals(operator)){
		// 	// total = a + b; //error coming need to ask to sayar Hein Ko Ko
		// 	System.out.println("Result [" + (a-b) + "]");
		// }else if("*".equals(operator)){
		// 	// total = a + b; //error coming need to ask to sayar Hein Ko Ko
		// 	System.out.println("Result [" + (a*b) + "]");
		// }else if("/".equals(operator)){
		// 	// total = a + b; //error coming need to ask to sayar Hein Ko Ko
		// 	System.out.println("Result [" + (a/b) + "]");
		// }else{
		// 	System.out.println("error in calculation");
		// }




		// Method 2 calling
		// ====================================================

		// calc.sumResult(a,operator,b);


		// Method 3 calling
		// ====================================================

		// if(!("+".equals(operator)) && !("-".equals(operator)) && !("*".equals(operator)) && !("/".equals(operator)) ){
		// 	System.out.println("Invalid Operator!!!");
		// }// else if(a % 1 !=0 && b % 1 != 0){
		// // 	System.out.println("first or third number should be number");
		// // }
	 //    else{
		// 	// System.out.println("\n************** calculation your data **************\n");
		// 	calc.sum_Result(a,operator,b);
		// 	calc.sub_Result(a,operator,b);
		// 	calc.multiply_Result(a,operator,b);
		// 	calc.division_Result(a,operator,b);
		// 	// System.out.println("\n************** process completed **************");
		// }



		// Method 4 calling
		// ====================================================
		// double result = calcProcessUserInput(a,operator,b);
		// showResult(result);



		// Method 5 calling
		// ====================================================
		System.out.println("Enter Number One");
		a = sc.nextDouble();

		System.out.println("Enter An Operator (+ , - , * ,/)");
		operator = sc.next();
		
		System.out.println("Enter Number Two");
		b = sc.nextDouble();

		total1 = getCalcProcess(a,operator,b);
		output(total1);




	}



	// Method 2
	// ====================================================

	 // void sumResult(double a, String operator, double b){
		
	 // 	if("+".equals(operator)){
		// 	// total = a + b; //error coming need to ask to sayar Hein Ko Ko
		// 	System.out.println("Result [" + (a+b) + "]");
		// }else if("-".equals(operator)){
		// 	System.out.println("Result [" + (a-b) + "]");
		// }else if("*".equals(operator)){
		// 	System.out.println("Result [" + (a*b) + "]");
		// }else if("/".equals(operator)){
		// 	System.out.println("Result [" + (a/b) + "]");
		// }else{
		// 	System.out.println("error in calculation");
		// }

	 // }




	// Method 3
	// ====================================================

	 // void sum_Result(double a, String operator, double b){

		
	 // 	if("+".equals(operator)){

		// 	System.out.println("Result [" + (a+b) + "]");
		// }

	 // }

	 // void sub_Result(double a, String operator, double b){

		
	 // 	if("-".equals(operator)){

		// 	System.out.println("Result [" + (a-b) + "]");
		// }

	 // }

	 //  void multiply_Result(double a, String operator, double b){

		
	 // 	if("*".equals(operator)){

		// 	System.out.println("Result [" + (a*b) + "]");
		// }

	 // }

	 // void division_Result(double a, String operator, double b){

		
	 // 	if("/".equals(operator)){

		// 	System.out.println("Result [" + (a/b) + "]");
		// }

	 // }


	// Method 4
	// ====================================================

	// private static double calcProcessUserInput(double a,String operator,double b){
	// 	double totalOutput = 0;
	// 	switch(operator){
	// 		case "+": 
	// 		totalOutput = a+b;
	// 		break;
	// 		case "-":
	// 		totalOutput = a-b;
	// 		break;
	// 		case "*":
	// 		totalOutput = a*b;
	// 		break;
	// 		case "/":
	// 		totalOutput = a/b;
	// 		break;
	// 		default:
	// 		return totalOutput;
	// 	}
	// 	return totalOutput;
	// }

	// private static void showResult(double result){
	// 	System.out.println("Result : [" + result + "]");
	// }





	// Method 5
	// ====================================================

	private static Double getCalcProcess(Double a, String operator, Double b){
		double total = 0;
		switch(operator){

			case "+":
			total = a + b;
			break;

			case "-":
			total = a - b;
			break;

			case "*":
			total = a * b;
			break;

			case "/":
			total = a / b;
			break;

			default:
			return total;
		}
		return total;
	}

	private static void output(Double total){
		System.out.println("Total :" + total);
	}


}