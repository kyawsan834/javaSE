class AssignmentCalculator{
	public static void main(String [] args){


		AssignmentCalculator calc = new AssignmentCalculator();


		Double a,b;
		String operator;
		String total;

		// System.out.println("hay");

		a = Double.parseDouble(args[0]);
		operator = args[1];
		b = Double.parseDouble(args[2]);


		// Method 1
		// ====================================================

		// if("+".equals(operator)){
		// 	// total = a + b; //error coming need to ask to sayar Hein Ko Ko
		// 	System.out.println("Result [" + (a+b) + "]");
		// }else if("-".equals(operator)){
		// 	// total = a + b; //error coming need to ask to sayar Hein Ko Ko
		// 	System.out.println("Result [" + (a-b) + "]");
		// }else if("x".equals(operator)){
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

		if(!("+".equals(operator)) && !("-".equals(operator)) && !("x".equals(operator)) && !("/".equals(operator)) ){
			System.out.println("Invalid Operator!!!");
		}// else if(a % 1 !=0 && b % 1 != 0){
		// 	System.out.println("first or third number should be number");
		// }
	    else{
			// System.out.println("\n************** calculation your data **************\n");
			calc.sum_Result(a,operator,b);
			calc.sub_Result(a,operator,b);
			calc.multiply_Result(a,operator,b);
			calc.division_Result(a,operator,b);
			// System.out.println("\n************** process completed **************");
		}

	}



	// Method 2
	// ====================================================

	 void sumResult(double a, String operator, double b){
		
	 	if("+".equals(operator)){
			// total = a + b; //error coming need to ask to sayar Hein Ko Ko
			System.out.println("Result [" + (a+b) + "]");
		}else if("-".equals(operator)){
			System.out.println("Result [" + (a-b) + "]");
		}else if("x".equals(operator)){
			System.out.println("Result [" + (a*b) + "]");
		}else if("/".equals(operator)){
			System.out.println("Result [" + (a/b) + "]");
		}else{
			System.out.println("error in calculation");
		}

	 }




	// Method 3
	// ====================================================

	 void sum_Result(double a, String operator, double b){

		
	 	if("+".equals(operator)){

			System.out.println("Result [" + (a+b) + "]");
		}

	 }

	 void sub_Result(double a, String operator, double b){

		
	 	if("-".equals(operator)){

			System.out.println("Result [" + (a-b) + "]");
		}

	 }

	  void multiply_Result(double a, String operator, double b){

		
	 	if("x".equals(operator)){

			System.out.println("Result [" + (a*b) + "]");
		}

	 }

	 void division_Result(double a, String operator, double b){

		
	 	if("/".equals(operator)){

			System.out.println("Result [" + (a/b) + "]");
		}

	 }


}