package codeflash;
import java.util.*;

public class TreeSetTesting {

	public static void main(String[] args) {
		
//		TreeSet<Integer> hello = new TreeSet<Integer>();
//		hello.add(1);
//		hello.add(2);
//		hello.add(3);
//		hello.add(4);
//		hello.add(5);
//		hello.add(6);
//		hello.add(7);
//		hello.add(8);
//		hello.add(9);
//		System.out.println(hello.subSet(2,false, 4,true));
//		System.out.println(hello);
		
		Bank b = new Bank("Bike Poo", "007", 1000);
		b.Display();
		b.IncBalance(5000);
		b.DecBalance(5000);
		
		String accname;
		String accnumber;
		double balance;
		public TreeSetTesting()
		{
			accname = "John";
			accnumber = "12345";
			balance = 1000.00;
		}
		public void TreeSetTesting(String name, String no, double b)
		{
			accname = name;
			accnumber = no;
			balance = b;
		}
		public void Display()
		{
			System.out.println ("Acc Name =" + accname);
			System.out.println ("Acc Number = " + accnumber);
			System.out.println ("Balance = " + balance);
		}	
		public void IncBalance(double b)
		{
			balance = balance+b;
			System.out.println ("Inc Balance =" + balance);	
											
		}
		public void DecBalance(double b)
		{
			balance = balance-b;
			System.out.println ("Dec Balance =" + balance);	
											
		}
		
	}

}
