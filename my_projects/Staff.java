import java.util.Scanner;
class Staff{
	static String name,designation,role;
	static int age;
    static double salary;

	public static void main(String[] args){



		// System.out.println("hay");

		Staff obj1 = new Staff();
		obj1.getData(name,age,role,designation,salary);
		obj1.showData(name,age,role,designation,salary);




	}

	private void getData(String name, int age, String role, String designation, double salary){
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter Your Name");
		name = sc.nextLine();
		this.name = name;

		System.out.println("Enter Your Age");
		age = sc.nextInt();
		this.age = age;

		System.out.println("Enter Your Role");
		role = sc.next();
		this.role = role;

		System.out.println("Enter Your Designation");
		designation = sc.next();
		this.designation = designation;

		System.out.println("Enter Your Salary");
		salary = sc.nextDouble();
		this.salary = salary;
	}

	private void showData(String name, int age, String role, String designation, double salary){
		System.out.println("------Result------");
		System.out.println("Your Name : "+ name);
		System.out.println("Yuor Age : "+ age);
		System.out.println("Your Role : "+ role);
		System.out.println("Your Designation : "+ designation);
		System.out.println("Your Salary : "+ salary+"$");
		System.out.println("------End------");
	}
}