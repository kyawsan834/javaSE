import java.util.Scanner;
class TicketBookingSystem{

	public static String name,username,date,time,price,movietype,edmtype;
	public static void main(String [] args){

		// System.out.println("hay");

		TicketBookingSystem booking = new TicketBookingSystem();

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter your username");
		username = sc.nextLine();
		System.out.println("Hello " +username+ ".");
		System.out.println("***Welcome to Online Booking System\r\n");
		System.out.println("***Please Choose your System 'a' for Air Ticket, 'b' for Bus Ticket, 'c' for Cinema Ticket, 'e' for EDM Event Ticket\r\n");
		String check = sc.nextLine();

		if("a".equals(check)){
			Ariplane air = new Ariplane();
			air.airData(name,date,time,price);
		}else if("b".equals(check)){
			Bus bus = new Bus();
			bus.busData(name,date,time,price);
		}else if("c".equals(check)){
			Cinema cinema = new Cinema();
			cinema.cinemaData(name,movietype,time,price);
		}else if("e".equals(check)){
			Edm edm = new Edm();
			edm.edmData(name,date,time,price);
		}

		

	}

}

class Ariplane extends TicketBookingSystem{
		static void airData(String name, String date, String time, String price){
			System.out.println("***Air Booking Start***\r\n");
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter your name");
			name = sc.nextLine();
			System.out.println("Enter your booking date eg. 7 Dec 2022");
			date = sc.nextLine();
			System.out.println("Enter your booking time eg. 10.A.M.");
			time = sc.nextLine();
			System.out.println("Enter your price");
			price = sc.nextLine();
			System.out.println("***Air Booking End***\r\n");

			System.out.println("Hello " + name + ".\r\n");

			System.out.println("***Air Booking Result***\r\n");
			System.out.println("Your Name : " + name);
			System.out.println("Your Date : " + date);
			System.out.println("Your Time : " + time);
			System.out.println("Your Price : " + price + "$");
			System.out.println("\r\n***End of Air Booking Result***\r\n");
		}

		// static String airDisplay(String name, String date, String time, String price){
		// 	// System.out.println("***Air Booking Result***\r\n");
		// 	// System.out.println("Your Name : " + name);
		// 	// System.out.println("Your Date : " + date);
		// 	// System.out.println("Your Time : " + time);
		// 	// System.out.println("Your Price : " + price + "$");
		// 	return name;
		// }
	}

	class Bus extends TicketBookingSystem{
		static void busData(String name, String date, String time, String price){
			System.out.println("***Bus Booking Start***\r\n");
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter your name");
			name = sc.nextLine();
			System.out.println("Enter your booking date eg. 7 Dec 2022");
			date = sc.nextLine();
			System.out.println("Enter your booking time eg. 10.A.M.");
			time = sc.nextLine();
			System.out.println("Enter your price");
			price = sc.nextLine();
			System.out.println("***Bus Booking End***\r\n");

			System.out.println("Hello " + name + ".\r\n");

			System.out.println("***Bus Booking Result***\r\n");
			System.out.println("Your Name : " + name);
			System.out.println("Your Date : " + date);
			System.out.println("Your Time : " + time);
			System.out.println("Your Price : " + price + "$");
			System.out.println("\r\n***End of Bus Booking Result***\r\n");
		}

	}

  
  	class Cinema extends TicketBookingSystem{
		static void cinemaData(String name, String movietype, String time, String price){
			System.out.println("***Cinema Booking Start***\r\n");
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter your name");
			name = sc.nextLine();
			System.out.println("Enter your movietype eg. comedy, mystery, romantic");
			movietype = sc.nextLine();
			System.out.println("Enter your time eg. 10.A.M.");
			time = sc.nextLine();
			System.out.println("Enter your price");
			price = sc.nextLine();
			System.out.println("***Cinema Booking End***\r\n");

			System.out.println("Hello " + name + ".\r\n");

			System.out.println("***Cinema Booking Result***\r\n");
			System.out.println("Your Name : " + name);
			System.out.println("Your Date : " + movietype);
			System.out.println("Your Time : " + time);
			System.out.println("Your Price : " + price + "$");
			System.out.println("\r\n***End of Cinema Booking Result***\r\n");
		}

	}

	  	class Edm extends TicketBookingSystem{
		static void edmData(String name, String edmtype, String time, String price){
			System.out.println("***EDM Booking Start***\r\n");
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter your name");
			name = sc.nextLine();
			System.out.println("Enter your edmtype eg. hardstyle, cyberpunk, tropicalhouse");
			movietype = sc.nextLine();
			System.out.println("Enter your time eg. 12.P.M.");
			time = sc.nextLine();
			System.out.println("Enter your price");
			price = sc.nextLine();
			System.out.println("***EDM Booking End***\r\n");

			System.out.println("Hello " + name + ".\r\n");

			System.out.println("***EDM Booking Result***\r\n");
			System.out.println("Your Name : " + name);
			System.out.println("Your Date : " + edmtype);
			System.out.println("Your Time : " + time);
			System.out.println("Your Price : " + price + "$");
			System.out.println("\r\n***End of EDM Booking Result***\r\n");
		}

	}

