import java.util.*;
class Collection3{

	public static void main(String [] args){

		// System.out.println("hay");

		// Stack<String> hello = new Stack<String>(); // last in fast out
		// hello.add("Kyaw Kyaw");
		// hello.add("Zaw Zaw");
		// hello.add("Naw Naw");
		// System.out.println(hello);

		// hello.push("Kyaw Kyaw");
		// hello.push("Zaw Zaw");
		// hello.push("Naw Naw");
		// System.out.println(hello);

		// hello.pop();
		// System.out.println(hello);

		ArrayDeque<String> hello = new ArrayDeque<String>(); // last in fast out
		hello.add("Kyaw Kyaw");
		hello.add("Zaw Zaw");
		hello.add("Naw Naw");
		System.out.println(hello);

		hello.push("Kyaw Kyaw");
		hello.push("Zaw Zaw");
		hello.push("Naw Naw");
		System.out.println(hello);

		hello.pop();
		System.out.println(hello);

	}

}