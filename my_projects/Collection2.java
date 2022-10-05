import java.util.*;
class Collection2{

	public static void main(String [] args){

		LinkedList<String> hello = new LinkedList<String>();

		hello.add("Hello1");
		hello.add("I am");
		hello.add("Collection of Java");
		System.out.println(hello);

		hello.addFirst("hay");
		hello.add("I am");
		hello.addLast("Java Collection List");
		System.out.println(hello);

		hello.add(1,"Harrison Wells");
		hello.add(2,"Barry Allen");
		System.out.println(hello);

		hello.remove();
		System.out.println(hello);

		hello.removeFirst();
		System.out.println(hello);

		hello.removeLast();
		System.out.println(hello);

		hello.removeLast();
		System.out.println(hello);

		for(String name : hello){
			System.out.println(name);
		}

	}

}