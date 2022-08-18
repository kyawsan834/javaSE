class RockPaperScissorVersion2 {
	public static void main(String [] args) {

		String firstPerson = args[0];
		String secondPerson = args[1];
         
		RockPaperScissorVersion2 rps = new RockPaperScissorVersion2();

		rps.firstProcess(firstPerson,secondPerson);
		rps.secondProcess(firstPerson,secondPerson);
        rps.drawProcess(firstPerson,secondPerson); 
		rps.wrongProcess(firstPerson,secondPerson); 
	}

         	void firstProcess(String t,String d) { // t = Input for firstPerson, d = Input for secondPerson

       		if(("r".equals(t) && "s".equals(d))
		|| ("s".equals(t) && "p".equals(d))
		|| ("p".equals(t) && "r".equals(d))) {
               		System.out.println("Player One Win!");
			} 
		}

		void secondProcess(String t,String d) {

       		if(("s".equals(t) && "r".equals(d))
		|| ("p".equals(t) && "s".equals(d))
		|| ("r".equals(t) && "p".equals(d))) {
               		System.out.println("Player Two Win!");
			} 
		}

		void drawProcess(String t,String d) {

       		if(("r".equals(t) && "r".equals(d))
		|| ("s".equals(t) && "s".equals(d))
		|| ("p".equals(t) && "p".equals(d))) {
               		System.out.println("It's DRAW!");
			} 
		}

		void wrongProcess(String t,String d) {
		
		if (!("r".equals(t) && "s".equals(d))
		&& !("s".equals(t) && "p".equals(d))
		&& !("p".equals(t) && "r".equals(d))
		&& !("s".equals(t) && "r".equals(d))
		&& !("p".equals(t) && "s".equals(d))
		&& !("r".equals(t) && "p".equals(d))
		&& !("r".equals(t) && "r".equals(d))
		&& !("s".equals(t) && "s".equals(d))
		&& !("p".equals(t) && "p".equals(d))			
		&& !("r".equals(t) && "r".equals(d)) 
		&& !("r".equals(t) && "r".equals(d)) 
		&& !("r".equals(t) && "r".equals(d))) {
               		System.out.println("Wrong Input!");
			} 
		}
}