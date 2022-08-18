class UserValidationProgram{

	//code by KyawSan 14 / 8 / 2022 12:09.A.M.

	public static void main(String[] args){

		// for user
		String name,password;

		name = args[0];
		password = args[1];

	    // defining username and password
	    String userName = "kyawsan";
	    String passWord = "1234";

	    // method 1
	    System.out.println( ((name.equals(userName)) && (password .equals(passWord))) ? "hay, how are you?" : "wrong username or password");

	    // method 2
	    // if( (name.equals(userName)) && (password.equals(passWord)) ){
	    // 	System.out.println("hay! how are you?");
	    // }else{
	    // 	System.out.println("Wrong username or password");
	    // }




	}

}