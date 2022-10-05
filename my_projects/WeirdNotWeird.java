import java.util.Scanner;

class WeirdNotWeird{

	static int n;
	
	private static final Scanner sc = new Scanner(System.in);

	public static void main(String [] args){

		// Scanner sc = new Scanner(System.in);


		WeirdNotWeird obj1 =new WeirdNotWeird();
		obj1.getNumber(sc, n);

		/*CheckNumber check = new CheckNumber();
		check.check(n);*/
	}

	public void getNumber(Scanner sc,int n){
		System.out.println("Enter a number");
		n = Integer.parseInt(sc.nextLine());
		CheckNumber check = new CheckNumber();
		check.check(n);
	}

}

class CheckNumber{ 

	public static void check(int n){
		if(n%2==0){
			if(n>=2 && n<=5){
				System.out.println("Not Weird");
			}else if(n>=6 && n<=20){
				System.out.println("Weird");
			}else if(n>=20){
				System.out.println("Not Weird");
			}
		}else{
			System.out.println("Weird");
		}
	}
}