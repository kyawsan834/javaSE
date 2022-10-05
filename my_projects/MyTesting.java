import java.util.Scanner;
class MyTesting{
	public static void main(String[] args){

		// System.out.println("hay");

		// testing concat() Method
		String fname,lname;
		fname = "Kyaw";
		lname = "San";
		String fullname = fname.concat(lname);
		System.out.println(fullname + " using concat Method");

		// testing special Escape characer
		String txt = "It\'s a java program by using special escape character";
		System.out.println(txt);
		txt = "The character is called \\\\ backslash";
		System.out.println(txt);

		// testing boolean
		boolean isJavaFun = true;
		boolean isFishTasyu = false;
		System.out.println("\r\n------Testing Boolean------");
		System.out.println(isJavaFun);
		System.out.println(isFishTasyu);

		// testing if condition

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter your name");
		String inputName = sc.nextLine();

		System.out.println("Enter your gender eg.(Male for \"m\" Female for \"f\")");
		String gender;
		gender = sc.next();

		System.out.println("Enter a number");

		int time = sc.nextInt();
		if(time == 1 || time <= 10){

			switch(gender){
				case "m":
					System.out.println("Good Morning Mr."+inputName);
				break;

				case "M":
					System.out.println("Good Morning Mr."+inputName);
				break;

				case "f":
					System.out.println("Good Morning Ms."+inputName);
				break;

				case "F":
					System.out.println("Good Morning Ms."+inputName);
				break;

				default:
					System.out.println("Good Morning " +inputName);
			}	


			// if("m".equals(gender)|| "M".equals(gender)){
			// 	System.out.println("Good Morning Mr."+inputName);
			// }else if("f".equals(gender)|| "F".equals(gender)){
			// 	System.out.println("Good Morning Ms."+inputName);
			// }else{
			// 	System.out.println("Good Morning " +inputName);
			// }
			
		}else if(time == 11 || time<=23 ){

			switch(gender){
				case "m":
					System.out.println("Good Evening Mr."+inputName);
				break;

				case "M":
					System.out.println("Good Evening Mr."+inputName);
				break;

				case "f":
					System.out.println("Good Evening Ms."+inputName);
				break;

				case "F":
					System.out.println("Good Evening Ms."+inputName);
				break;

				default:
					System.out.println("Good Evening " +inputName);
			}	


			// if("m".equals(gender)|| "M".equals(gender)){
			// 	System.out.println("Good Evening Mr."+inputName);
			// }else if("f".equals(gender)|| "F".equals(gender)){
			// 	System.out.println("Good Evening Ms."+inputName);
			// }else{
			// 	System.out.println("Good Morning " +inputName);
			// }

		}else if(time == 24 && time >1){

			switch(gender){
				case "m":
					System.out.println("Good Morning Mr."+inputName);
				break;

				case "M":
					System.out.println("Good Morning Mr."+inputName);
				break;

				case "f":
					System.out.println("Good Morning Ms."+inputName);
				break;

				case "F":
					System.out.println("Good Morning Ms."+inputName);
				break;

				default:
					System.out.println("Good Morning " +inputName);
			}


			// if("m".equals(gender)|| "M".equals(gender)){
			// 	System.out.println("Good Morning Mr."+inputName);
			// }else if("f".equals(gender)|| "F".equals(gender)){
			// 	System.out.println("Good Morning Ms."+inputName);
			// }else{
			// 	System.out.println("Good Morning " +inputName);
			// }
		}else{
			System.out.println("Invalid Number");
		}

		System.out.println("\r\n");

		System.out.println("------DayCount Start------\r\n");

		System.out.println("Hello " + inputName + ". Please enter a number");
		int daycount = sc.nextInt();
		getDay(daycount);

		System.out.println("\r\n------DayCount End------\r\n");
		System.out.println("------Process Completed------\r\n");




	}

	private static void getDay(int daycount){
		switch(daycount){

			case 0:
				System.out.println("Today is Sunday");
			break;

			case 1:
				System.out.println("Today is Monday");
			break;
			

			case 2:
				System.out.println("Today is Tuesday");
			break;
			

			case 3:
				System.out.println("Today is Wednesday");
			break;
			

			case 4:
				System.out.println("Today is Thursday");
			break;
			

			case 5:
				System.out.println("Today is Friday");
			break;
			

			case 6:
				System.out.println("Today is Saturday");
			break;

			default:
				System.out.println("Invalid Number for day");
			
		}
	}
}