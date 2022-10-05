class Reversing{
	public static void main(String [] args){

		Reversing reverseobj = new Reversing();


		// System.out.println("hay");

		String a = args[0];

		//finally i got idea

		if(a.length()<=7){
			System.out.println("Your Words: " + a );
			reverseobj.setReverse(a);
		}else{
			System.out.println("ERROR: Your Characters is over 7!");
		}
		
	}

	void setReverse(String input){
		String reverse = "";
		// boolean flagVariable = false; //reusable variable
		for(int i = input.length()-1; i>=0 ; i--){
		 		reverse = reverse+(input.charAt(i));
		}

		System.out.println("Reverse Words: " + reverse);
	}
}