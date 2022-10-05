class ArrayTesting{
	public static void	main(String args[]){

		// System.out.println("hay");

		// One Deimentional Array

		String [] name = new String[3];
		name[0] = "Hein Ko Ko";
		name[1] = "Kyaw San";
		name[2] = "Mya Mya";
		System.out.println(name.length);
		// System.out.println(name);
		System.out.println(name[1]);
		// System.out.println(name[3]); //ArrayIndexOutOfBoundsException 3
		// System.out.println(name[-1]); // ArrayIndexOutOfBoundsException -1


		int [] age = {10,11,12,13,14,15};
		System.out.println(age.length);
		// System.out.println(age);
		System.out.println(age[0]);
		// System.out.println(age[9]); //ArrayIndexOutOfBoundsException 9
		// System.out.println(age[-1]); // ArrayIndexOutOfBoundsException -1


		// Two Deimentional Array
		int [][] n ={
			{0,1,2},//for row
			{10,11,12}// for column
		};

		System.out.println("n length is : " + n.length );
		System.out.println("n value is : " + n[0][2]); // n[0]mean row 1 n[0] "[1]"means index of row1
		System.out.println("n value is : " + n[1][1]); // n[1]mean row 2 n[1] "[2]"means index of row2


		// Testing

		String [] male = new String[3];
		male[0] = "Hein Ko Ko";
		male[1] = "Kyaw San";
		male[2] = "John Doe"; 

		String [] female = new String[3];
		female[0] = "Su Su";
		female[1] = "Nu Nu";
		female[2] = "Mya Mya";

		System.out.println("Male Array : "+male.length); 
		System.out.println("Female Array : "+female.length);
		System.out.println("Male index zero value : " + male[0]);
		System.out.println("Female index zero value : " + female[0]);

		String [] malenames = {
			"Hein Ko Ko",
			"Kyaw San",
			"John Doe"
		};

		String [] femalenames = {
			"Su Su",
			"Nu Nu",
			"Mya Mya"
		};

		System.out.println("ArrayOne is : " + malenames[0] + ", " + malenames[1] + ", " + malenames[2]);
		System.out.println("Arrayone lenght : " + malenames.length);
		System.out.println("ArrayTwo is : " + femalenames[0] + ", " + femalenames[1] + ", " + femalenames[2]);
		System.out.println("ArrayTwo lenght : " + femalenames.length);
		
		




	}
}