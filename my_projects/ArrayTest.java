import java.util.*;
class ArrayTest{
	public static void main(String[] args){

		int a[] = new int[3];
		a[0] = 55;
		a[1] = 545;
		a[2] = 393;

		for(int i = 0; i<a.length; i++){
			System.out.println("Array : " + a[i]);
		}

		String b[] = {
			"sleep",
			"eat",
			"code"
		};

		System.out.println("My tasks with array method " + Arrays.toString(b));

		for(int i = 0; i<b.length; i++){
			System.out.println("My tasks : " + b[i]);
		}

		Scanner sc = new Scanner(System.in);
		int numbers[] = new numbers[5];
		System.out.println("Enter an array length");
		for(int i = 0 ; i<numbers.length; i++){
			numbers[i] = sc.nextInt();
			System.out.println(numbers[i]);
		}


	}	
}