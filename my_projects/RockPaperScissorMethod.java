class RockPaperScissorMethod {
	public static void main(String [] args) {

	String  thing1 = args[0];
	String thing2 = args[1];
	
	RockPaperScissorMethod obj = new RockPaperScissorMethod();
	obj.playerOneWin(thing1,thing2);
	obj.playerTwoWin(thing1,thing2);
	obj.draw(thing1,thing2);
	obj.wrong(thing1,thing2);
	

}
	void playerOneWin(String thing1, String thing2){
		if (("r".equals(thing1) && "s".equals(thing2)) 
		|| ("s".equals(thing1) && "p".equals(thing2))
		|| ("p".equals(thing1) && "r".equals(thing2))){
		System.out.println("Player One Win!");
		}
	}

	void playerTwoWin(String thing1, String thing2){
		if (("p".equals(thing1) && "s".equals(thing2))
		|| ("s".equals(thing1) && "r".equals(thing2))
		|| ("r".equals(thing1) && "p".equals(thing2))){
		System.out.println("Player Two Win!");	
		}
	}
	
	void draw(String thing1, String thing2){
		if (("p".equals(thing1) && "p".equals(thing2))
		|| ("r".equals(thing1) && "r".equals(thing2))
		|| ("s".equals(thing1) && "s".equals(thing2))){
		System.out.println("It's DRAW");
		} 
	}
		
	void wrong(String thing1, String thing2){
		System.out.println("Wrong Input!!!");	
	}
	

	

}