package codeflash;

import java.util.ArrayList;

import java.util.Scanner;

public class NextLevelPaymentapp {
	
	static String username,phonenumber;

	public static void main(String[] args) {

		try {
			Scanner sc = new Scanner(System.in);
			PaymentSystem p = new PaymentSystem(username,phonenumber);
			p.PaymentSystem();
		} catch (Exception ex) {
			ex.printStackTrace();
		}

	}
}

class PaymentSystem {
	int balance;
	int transcation;
	String username;
	String  phonenumber;
	public static final Scanner sc = new Scanner(System.in);

	PaymentSystem(String username, String phonenumber) {
//		this.username=username;
		System.out.println("Enter your username");
		this.username=sc.nextLine();
		System.out.println("Enter your phonenumber");
		this.phonenumber=sc.nextLine();
	}

	void deposite(int amount) {
		if (amount != 0) {
			balance = balance + amount;
			transcation = amount;

		}

	}

	void Withdraw(int amount) {
		if (amount != 0) {
			balance = balance - amount;
			transcation = -amount;
		}

	}

	void transcation() {
		if (transcation > 0) {
			System.out.println("Deposited " + transcation);
		} else if (transcation < 0) {
			System.out.println("Withdraw " + Math.abs(transcation));
		} else {
			System.out.println("No transcation ");
		}

	}

	void PaymentSystem() {
		char choice = '\0';
		Scanner sc = new Scanner(System.in);
		System.out.println("Welcome ! >> " + username);
		System.out.println("Your Phone Number : " + phonenumber);
		System.out.println("\n");
		System.out.println("A.Checkbalance");
		System.out.println("B.Deposit");
		System.out.println("C.Withdraw");
		System.out.println("D.Transcation");
		System.out.println("E.Exit");
		System.out.println("Please Enter Character only in Captial Letter e.g.(A , B .......)");
		System.out.println("..........................");

		do {
			System.out.println("PLease Choice Character Only In Capital Letter ?");
			choice = sc.next().charAt(0);

			switch (choice) {
			case 'A':
				System.out.println(".......");
				System.out.println("Balance : " + balance + "$");
				System.out.println("Deposit amount?Key_B");
				System.out.println(".......");
				System.out.println("\n");
				break;
			case 'B':
				System.out.println(".......");
				System.out.println("Balance : " + balance + "$");
				System.out.println("Please enter your deposit amount");
				int amount = sc.nextInt();
				deposite(amount);
				System.out.println(".......");
				System.out.println("Your Deposit " + amount + "$");
				System.out.println("\n");
				break;
			case 'C':
				System.out.println(".......");
				System.out.println("Balance : " + balance +"$");
				System.out.println("Please enter your withdraw amount");
				int amount2 = sc.nextInt();
				Withdraw(amount2);
				System.out.println(".......");
//				System.out.println("Your current balance " + balance + "$");
				System.out.println("Your Withdraw " + amount2 + "$");
				System.out.println("\n");
				System.out.println("\n");
				break;
			case 'D':

				System.out.println(".......");
				transcation();
				System.out.println(".......");

				System.out.println("\n");
				break;
			case 'E':
				System.out.println(".......");

				break;

			default:
				System.out.println("Sorry, your are Input Wrong! Try Again?");

			}
		} while (choice != 'E');
		System.out.println("Thanks you For using app");
	}

}