class GenderFeature{


	public static void	main(String [] args){

		// System.out.println("hay");

		Human male = new Male();
		Human female = new Male();

	}


}

class Human{

	String talk;
	String walk;
	String eat;
	String work;
	int wordPerMinute;

}

class Male extends Human{
	public Male(){
		talk();
		walk();
		eat();
		work();
	}

	private void talk(){
		wordPerMinute = 5;
		System.out.println("male don\'t talk too much");
		System.out.println("They speak " + wordPerMinute + " in a min.");
	}

	private void walk(){
		System.out.println("male are runner");
	}

	private void eat(){
		System.out.println("male have to eat for work");
	}

	private void work(){
		System.out.println("male have to work for home");
	}
}

class Female extends Human{
	public Female(){
		talk();
		walk();
		eat();
		work();
	}

	private void talk(){
		wordPerMinute = 20;
		System.out.println("male talk too much");
		System.out.println("They speak " + wordPerMinute + " in a min.");
	}

	private void walk(){
		System.out.println("female are gentle");
	}

	private void eat(){
		System.out.println("female eat a little");
	}

	private void work(){
		System.out.println("female have to work at home");
	}
}