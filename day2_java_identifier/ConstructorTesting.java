class ConstructorTesting{
    public static void main(String [] args){
             // System.out.println("hay");

	ConstructorTesting con = new ConstructorTesting(1);
	ConstructorTesting con1 = new ConstructorTesting();
      }

      ConstructorTesting(int i){
      	System.out.println("Constructor with argument");
      }

       ConstructorTesting(){
      	System.out.println("Constructor with no argument");
      }
}