class AgeRange{
	public static void main(String [] args){

		AgeRange agerange = new AgeRange();

		// System.out.println("hay"); 

		int ageMin = Integer.parseInt(args[0]);
		int ageMax = Integer.parseInt(args[0]);

		if(ageMin<0 || ageMin>24 && ageMax<0 || ageMax>24){
			System.out.println("Invalid age");
		}else{
			agerange.userOne(ageMin,ageMax);
			agerange.userTwo(ageMin,ageMax);
			agerange.userThree(ageMin,ageMax);
			agerange.userFour(ageMin,ageMax);
			agerange.userFive(ageMin,ageMax);
		}


		



	}

	void userOne(int ageMin[], int ageMax[]){
		String arrUser[] = {"Hein Ko Ko","23","Yangon","heinko@gmail.com"};
		for(int i = 0; i<arrUser.length; i++){
			System.out.println("---------------");
			System.out.println("Search Result");
			System.out.println("---------------");
			System.out.println("-----("+(i+=1)+")-----");
			System.out.println("Name = " + arrUser[0]);
			System.out.println("Age = " + arrUser[1]);
			System.out.println("address = " + arrUser[2]);
			System.out.println("email = " + arrUser[3]);break;
		}
	}

	void userTwo(int ageMin, int ageMax){
		String arrUser[] = {"Aung Htet Naing","9","Mandalay","aunghtet@yahoo.com"};
		for(int i = 0; i<arrUser.length; i++){
			System.out.println("---------------");
			System.out.println("Search Result");
			System.out.println("---------------");
			System.out.println("-----("+(i+=2)+")-----");
			System.out.println("Name = " + arrUser[0]);
			System.out.println("Age = " + arrUser[1]);
			System.out.println("address = " + arrUser[2]);
			System.out.println("email = " + arrUser[3]);break;
		}
	}

	void userThree(int ageMin, int ageMax){
		String arrUser[] = {"Mya Kyay Hmon","34","Bago","myakyay@gmail.com"};
		for(int i = 0; i<arrUser.length; i++){
			System.out.println("---------------");
			System.out.println("Search Result");
			System.out.println("---------------");
			System.out.println("-----("+(i+=3)+")-----");
			System.out.println("Name = " + arrUser[0]);
			System.out.println("Age = " + arrUser[1]);
			System.out.println("address = " + arrUser[2]);
			System.out.println("email = " + arrUser[3]);break;
		}
	}

	void userFour(int ageMin, int ageMax){
		String arrUser[] = {"Wutt Yee","25","Taung Gyi","wuttyee@gmail.com"};
		for(int i = 0; i<arrUser.length; i++){
			System.out.println("---------------");
			System.out.println("Search Result");
			System.out.println("---------------");
			System.out.println("-----("+(i+=4)+")-----");
			System.out.println("Name = " + arrUser[0]);
			System.out.println("Age = " + arrUser[1]);
			System.out.println("address = " + arrUser[2]);
			System.out.println("email = " + arrUser[3]);break;
		}
	}

	void userFive(int ageMin, int ageMax){
		String arrUser[] = {"Naing Min Oo","45","Kalaw","naingmin@gmail.com"};
		for(int i = 0; i<arrUser.length; i++){
			System.out.println("---------------");
			System.out.println("Search Result");
			System.out.println("---------------");
			System.out.println("-----("+(i+=5)+")-----");
			System.out.println("Name = " + arrUser[0]);
			System.out.println("Age = " + arrUser[1]);
			System.out.println("address = " + arrUser[2]);
			System.out.println("email = " + arrUser[3]);break;
		}
	}
}