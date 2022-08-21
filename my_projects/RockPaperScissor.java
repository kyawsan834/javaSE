public class RockPaperScissor{

	public static void main(String[] args){

		RockPaperScissor rps = new RockPaperScissor();

		String personOne = args[0];
		String personTwo = args[1];

		// System.out.println("hay");

		// method 1
		// rps.showResult(personOne,personTwo);

		// method 2
		// rps.rock(personOne,personTwo);
		// rps.paper(personOne,personTwo);
		// rps.scissor(personOne,personTwo);



		// rps.winner(personOne,personTwo);

		// method 3
		// checking wrong input
		if( !(personOne.equals("r"))&& !(personTwo.equals("r")) && !(personOne.equals("p"))&& !(personTwo.equals("p")) && !(personOne.equals("s"))&& !(personTwo.equals("s")) ){
			System.out.println("invalid input");
		}else{
			rps.winner(personOne,personTwo);
		}



	}

	// method 1
	// =====================================================

	// method to display winner, draw and wrong input
	// void showResult(String userOne, String userTwo){

	// 	// for userone and usertwo with rock
	// 	if("r".equals(userOne)){
	// 		if("p".equals(userTwo)){
	// 			System.out.println("Player Two Win");
	// 		}else if("s".equals(userTwo)){
	// 			System.out.println("Player One Win");
	// 		}else{
	// 			System.out.println("It's draw.");
	// 		}
	// 	}

	// 	// for userone and usertwo with paper
	// 	else if("p".equals(userOne)){
	// 		if("r".equals(userTwo)){
	// 			System.out.println("Player One Win");
	// 		}else if("s".equals(userTwo)){
	// 			System.out.println("Player Two Win");
	// 		}else{
	// 			System.out.println("It's draw.");
	// 		}
	// 	}

	// 	// for userone and usertwo with scissor
	// 	else if("s".equals(userOne)){
	// 		if("r".equals(userTwo)){
	// 			System.out.println("Player Two Win");
	// 		}else if("p".equals(userTwo)){
	// 			System.out.println("Player One Win");
	// 		}else{
	// 			System.out.println("It's draw.");
	// 		}
	// 	}

	// 	else{
	// 		System.out.println("Wrong Input!!!");
	// 	}
	// }



	// method 2
	// =====================================================

	// for rock
	// void rock(String userOne, String userTwo){
	// 	if("r".equals(userOne)|| "R".equals(userOne)){
	// 		if("p".equals(userTwo) || "P".equals(userTwo) ){
	// 			System.out.println("Player Two Win");
	// 		}else if("s".equals(userTwo) || "S".equals(userTwo) ){
	// 			System.out.println("Player One Win");
	// 		}else{
	// 			System.out.println("Draw");
	// 		}
	// 	}
	// }

	// // for paper
	// void paper(String userOne, String userTwo){
	// 	if("p".equals(userOne)|| "P".equals(userOne)){
	// 		if("s".equals(userTwo) || "S".equals(userTwo) ){
	// 			System.out.println("Player Two Win");
	// 		}else if("r".equals(userTwo) || "R".equals(userTwo) ){
	// 			System.out.println("Player One Win");
	// 		}else{
	// 			System.out.println("Draw");
	// 		}
	// 	}
	// }

	// // for scissor
	// void scissor(String userOne, String userTwo){
	// 	if("s".equals(userOne)|| "S".equals(userOne)){
	// 		if("p".equals(userTwo) || "P".equals(userTwo) ){
	// 			System.out.println("Player One Win");
	// 		}else if("r".equals(userTwo) || "R".equals(userTwo) ){
	// 			System.out.println("Player Two Win");
	// 		}else{
	// 			System.out.println("Draw");
	// 		}
	// 	}
	// }




	// method 3
	// =====================================================
	// for winner and draw

	void winner(String personOne, String personTwo){
		
		if("r".equals(personOne) || "R".equals(personOne)){
			if("p".equals(personTwo) || "P".equals(personTwo)){
				System.out.println("Player Two Win");
			}else if("s".equals(personTwo) || "S".equals(personTwo)){
				System.out.println("Player One Win");
			}else{
				System.out.println("Draw");
			}
		}else if("p".equals(personOne) || "P".equals(personOne)){
			if("s".equals(personTwo) || "S".equals(personTwo)){
				System.out.println("Player Two Win");
			}else if("r".equals(personTwo) || "R".equals(personTwo)){
				System.out.println("Player One Win");
			}else{
				System.out.println("Draw");
			}
		}else if("s".equals(personOne) || "S".equals(personOne)){
			if("p".equals(personTwo) || "P".equals(personTwo)){
				System.out.println("Player One Win");
			}else if("r".equals(personTwo) || "R".equals(personTwo)){
				System.out.println("Player Two Win");
			}else{
				System.out.println("Draw");
			}
		}

	} 





}

