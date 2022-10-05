class AgeRangeExplained{

	String name;
	int age;
	String address;
	String email;
	static int flag=0;
	AgeRangeExplained(String name, int age, String address, String email){
		this.name = name;
		this.age = age;
		this.address = address;
		this.email = email;
	}


	public static void main(String [] args){

		// System.out.println("hay");
		int numberOne = Integer.parseInt(args[0]);
		int numberTwo = Integer.parseInt(args[1]);

		AgeRangeExplained personOne = new AgeRangeExplained("Hein Ko Ko", 23, "Yangon", "heinkoko@gmail.com");
		AgeRangeExplained personTwo = new AgeRangeExplained("Aung Htet Naing",9,"Mandalay","aunghtet@yahoo.com");
		AgeRangeExplained personThree = new AgeRangeExplained("Mya Kyay Hmon",34,"Bago","myakyay@gmail.com");
		AgeRangeExplained personFour = new AgeRangeExplained("Wutt Yee",25,"Taung Gyi","wuttyee@gmail.com");
		AgeRangeExplained personFive = new AgeRangeExplained("Naing Min Oo",45,"Kalaw","naingmin@gmail.com");

		AgeRangeExplained [] ageRange = {personOne,personTwo,personThree,personFour,personFive};

		header();
		searchProcess(numberOne,numberTwo,ageRange);
		footer();
	}

	private final static void header(){
		System.out.println("-------\r\n " 
			+"---Search Result---"
			+"\r\n------");
	}

	private static void searchProcess(int numberOne,int numberTwo,AgeRangeExplained [] ageRange){
		for(int i = 0; i<ageRange.length; i++){
			if(
				(numberOne <= ageRange[i].age && numberTwo >=ageRange[i].age) ||
				(numberTwo <= ageRange[i].age && numberOne >=ageRange[i].age)
				){

				output(++flag, ageRange[i].name, ageRange[i].age, ageRange[i].address,ageRange[i].email);
			}
		}
	}

	private static void output(int number, String name, int age, String address, String email){
		System.out.println("-------"+number+"------\r\n"
				+"name=" + name+ "\r\n"
				+"age=" + age+ "\r\n"
				+"address=" + address+ "\r\n"
				+"email=" + email+ "\r\n"

			);
	}

	private static void footer(){
			System.out.println("-------END------");
	}
}