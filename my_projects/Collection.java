import java.util.*;
class Collection{

	public static void main(String [] args ){

		ArrayList <String> hello = new ArrayList <String>();
		hello.add("Kyaw Kyaw");
		hello.add("Zaw Zaw");
		hello.add("Naw Naw");
		System.out.println(hello);
		hello.add("Su Su");
		hello.add("Nu Nu");
		hello.add("Mya Mya");
		System.out.println(hello);
		hello.add(1,"Hla Hla");
		System.out.println(hello);
		hello.add(5,"Lu Lu");
		System.out.println(hello);
		hello.remove(1);
		System.out.println(hello);
		hello.set(2,"Hla Hla");
		hello.set(5,"Aye Aye");
		System.out.println(hello);
		System.out.println(hello.get(2));
		System.out.println(hello.get(4));
		System.out.println(hello.get(3));

		hello.clear();
		System.out.println(hello);

	}

}