class ConstructorTesting{
    static int i = 0;
    int j = 0;
    String name;
	int a;
    public static void main(String [] args){
             // System.out.println("hay");
                System.out.println("Main Method");

	// ConstructorTesting con = new ConstructorTesting(1);
	// ConstructorTesting con1 = new ConstructorTesting();
	// ConstructorTesting con2 = new ConstructorTesting();
	//ConstructorTesting con3 = new ConstructorTesting();
	ConstructorTesting con4 = new ConstructorTesting(1);


	// con2.outputTesting();
	// con2.i = 20;
	// con2.name = "Hein Ko Ko";
	// con2.outputTesting();

	/*con3.outputTesting();
	con3.i = 30;
	con2.name = "Aung Khant Hein";
	con2.outputTesting();*/

	con4.outputTesting();
}

    public static void main(String  args){
	System.out.println("Main Method");
	System.out.println(i);
}

    //   ConstructorTesting(int i){
    //   	System.out.println("Constructor with argument");
	// ConstructorTesting.i= 333;
    //   }

      /* ConstructorTesting(){
      	System.out.println("Constructor with no argument");
	ConstructorTesting.i= 222;
      }*/

    // ConstructorTesting(){
	// 	j = 10;
	// 	System.out.println(j);
    // }
    
    void outputTesting(){
    	System.out.println(i);
		System.out.println(name);
		System.out.println(a);
    }

	ConstructorTesting(int a){
		this.a = a;
	}
}