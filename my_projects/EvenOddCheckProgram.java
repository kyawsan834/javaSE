class EvenOddCheckProgram{
	public static void	main(String[] args){

		// System.out.println("hay");

		int num = Integer.parseInt(args[0]);
		// System.out.println("hay " + num);

		// checking even and odd of any integer with tenery operator
	 	System.out.println( (num % 2) == 0 ? "even" : "odd");

	}
}