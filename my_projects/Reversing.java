class Reversing{
	public static void main(String [] args){


		// System.out.println("hay");


		String a = args[0];
		String reverse = "";
		boolean flagVariable = false;
		for(int i = a.length()-1; i>=0 ; i--){
		 	// if((a.length()<8)){

		 		// flagVariable = true;
		 		reverse = reverse + a.charAt(i);
		 		// System.out.println(i);
		 	// }
		 	// System.out.println(flagVariable == true ? "" : "ERROR: Your Characters is over 7!");break;
		}

		System.out.println(reverse);
	}
}