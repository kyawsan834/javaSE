package codeflash;

import java.util.*;

public class ArrayLoopTesting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		System.out.println("hay");
		
//		for(int i = 1; i<5; i++) {
//			for(int j = 1; j<=i; j++) {
//				System.out.println("* \t");
//			}
//			System.out.println("");
//		}
		
//		int [] a = new int[5];
//		Scanner sc = new Scanner(System.in);
//		for(int i = 0; i<a.length; i++) {
//			System.out.println("Enter a number");
//			a[i] = Integer.parseInt(sc.nextLine());
//		}
//		
//		int search; boolean flag = false;
//		
//		System.out.println("Enter your number to search");
//		search = Integer.parseInt(sc.nextLine());	
//		
//		for(int i = 0; i<a.length; i++) {
//			
//			if(search == a[i]) {
//				flag = true;
//				System.out.println(search + "found at " + i);
//			}
//		}if(!flag) {
//			System.out.println("Search data is not found");
//		}
		
//		int[][] a = new int [4][5];
//		Scanner sc = new Scanner(System.in);
//		for(int r=0; r<4; r++) {
//			for(int c = 0; c<5; c++) {
//				System.out.println("Enter your number");
//				a[r][c] = Integer.parseInt(sc.nextLine());
//			}
//		}
//		for(int r=0; r<4; r++) {
//			for(int c=0; c<5; c++) {
//				System.out.println(a[r][c]+"\t");
//				System.out.println();
//				
//			}
//		}
		
		String [] qus = {"who are you?","who create you?","what can you do?"};
		Scanner sc = new Scanner(System.in);
		String search; boolean flag = false;
		
		for(int i = 0; i<qus.length; i++) {
			System.out.println(qus[i]);
			search = sc.nextLine();
			
//			if(search==qus[i]) {
//				flag = true;
//				System.out.println(search + "found at " + i);
//			}
			System.out.println(qus[i]);

		} /*
			 * if(!flag) { System.out.println("Serach data not found"); }
			 */

	}

}
