import java.util.Scanner;

class ExceptionDayThreeTesting{

	public static void main(String [] args){
		// try(Scanner sc = new Scanner(System.in)){
		// 	System.out.println("Age? >");
		// 	int age = Integer.parseInt(sc.nextLine());
		// 	if(age>60){
		// 		throw new ArithmeticException("User age is over 60!");
		// 	}
		// }catch (ArithmeticException e){
		// 	System.out.println(e);
		// }

		try(Scanner sc = new Scanner(System.in)){
			System.out.println("Age? >");
			int age = Integer.parseInt(sc.nextLine());
			if(age>60){
				PeopleException.wrongObjectException();
			}
		}
	}

}

class PeopleException{
	static void retirePerson(){
		throw new ArithmeticException("User age is over 60!");
	}

	static void wrongObjectException(){
		throw new ClassCastException("Wrong Object Casting for People!");
	}
}