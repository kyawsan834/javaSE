import java.util.*;
class MultiplyProgram{

	public static void main(String [] args){

		// System.out.println("hay");

		Scanner sc = new Scanner(System.in);
		int i;
		System.out.println("Enter any number");
			i = sc.nextInt();
		for(int j = 1; j<=100; j++){
		
			System.out.println(i + " x " + j + " = " + i*j);
		}

	}

}