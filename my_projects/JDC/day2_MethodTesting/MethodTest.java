public class MethodTest{

	public static void main(String[] args) {
		sayHello();

		MethodTest obj = new MethodTest();

		obj.showResult(10,5);

		int result = add(10,10);

		System.out.println(result);

		OtherMethod.showMessage("Using Other Method");
		
	}


	void showResult(int a, int b){

		System.out.println(a + b);

	}

	static void sayHello(){
		System.out.println("Hello");
	}

	static int add(int a, int b){
		return a + b;
	}

}