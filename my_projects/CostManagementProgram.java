class  CostManagementProgram{


	public static void main(String[] args){

		CostManagementProgram cmp = new CostManagementProgram();

		// System.out.println("hay");

		int userInput = Integer.parseInt(args[0]);
		// System.out.println("hay " + userInput );

		cmp.costDisplay(userInput);
	}



	// method for CostManagementProgram
	void costDisplay(int cost){

		// for under cost 10000MMK
		if(cost ==1 || cost<=8999){
			System.out.println( "Respect... Keep exceed "+ cost +"MMK to money-box." );
		}

		// for cost 9000MMK
		else if(cost <9000 || cost<=9999){
			System.out.println( "Respect... Keep exceed 1000MMK to money-box." );
		}

		// for  cost 10000MMK
		else if(cost == 10000){
			System.out.println(  "Perfect... Keep That Balance for your future!" );
		}

		// for bus
		else if(cost == 10100 || cost <= 10499){
			System.out.println("Oh... You're OVER LIMIT!");
			System.out.println("You should reduce for Bus Cost for Tomorrow.i");
		
		}

		// for Flower for Soulmate
		else if(cost == 10500 || cost <=11000){
			System.out.println("Oh... You're OVER LIMIT! ");
			System.out.println("You should reduce Flower for Soulmate Cost for Tomorrow.");
		
		}

		// for lunch
		else if(cost == 12000 || cost<= 12999){
			System.out.println("Oh... You're OVER LIMIT! ");
			System.out.println("You should reduce Lunch Cost for Tomorrow.");
		
		}

		// for phone bill
		else if(cost == 13000 || cost <= 13999){
			System.out.println("Oh... You're OVER LIMIT! ");
			System.out.println("You should reduce Phone Bill Cost for Tomorrow.");
		
		}

		// for snack
		else if(cost == 14000 || cost <= 14999){
			System.out.println("Oh... You're OVER LIMIT! ");
			System.out.println("You should reduce Snack Cost for Tomorrow.");
		}

		// for overlimit
		else if(cost == 15000){
			System.out.println("Oh... You're OVER LIMIT! ");
			System.out.println("Mom... He don't want to rich! Beat Him!");
		}

		// for invalid cost
		else{
			System.out.println("Oh... You're OVER MAXIMUM LIMIT! ");
			System.out.println("Mom... Dad... Brother... Sister...  He don't want to rich! Beat Him!");
		}
	}



//done at 15 August 2022  from(6:00.A.M. to 6:52.P.M.)

 
}