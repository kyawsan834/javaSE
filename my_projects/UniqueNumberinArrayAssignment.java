class UniqueNumberinArrayAssignment{

	public static void main(String [] args){

		// System.out.println("hay");

		// System.out.println("Enter 5 number");
		// int total[] = {Integer.parseInt(args[0]),Integer.parseInt(args[1]),Integer.parseInt(args[2]),Integer.parseInt(args[3]),Integer.parseInt(args[4])};
		// System.out.println(total);

		// System.out.println("Enter 5 number");
		String num1 = args[0];
		String num2 = args[1];
		String num3 = args[2];
		String num4 = args[3];
		String num5 = args[4];
		
		if(		(num1!=num2 && num1!=num3 && num1!=num4 && num1!=num5) &&
				(num2!=num1 && num2!=num3 && num2!=num4 && num2!=num5) &&
				(num3!=num1 && num1!=num2 && num1!=num4 && num1!=num5) &&
				(num4!=num1 && num1!=num2 && num1!=num3 && num1!=num5) &&
				(num5!=num1 && num1!=num2 && num1!=num3 && num1!=num4) ){
			System.out.println("Unique Number");
		}else{
			System.out.println("This is not unique number.");
		}

	}	

}