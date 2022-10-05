class Parent{

	int parentI = 10;

	public static void main(String[] args){

		// int parentI = 10;

		// System.out.println("hay");

		Child c = new Child();

		Parent p = new Parent();

		// Parent p2 = new Child();

		Parent p2 = new Parent();


		// Child c2 = (Child)p2;

		// Child c3 = new Child();


	}

	public void helloInheritance(){
		System.out.println("Hello inheritance!!!");
	}
}

class Child extends Parent{
	String name = "Child V";

	public Child(){
		System.out.println(parentI);
		helloInheritance(); 
 	}

 	public void helloInheritance(){
 		System.out.println("Hello Child!!!");
 	}
}