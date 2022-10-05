package codeflash;
import java.awt.Window;
import java.util.Scanner;

public class CrazyBot {
	
	private static String botName = "Crazy Bot";
	private static String devName = "Mr.Kyaw San";
	private static String phoneNumber;
	private static final Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		
		try {
			
			showCard(sc, phoneNumber);
			
		}catch(StringIndexOutOfBoundsException ex) {
			
			System.out.println("err msg : " + ex + "\r\n");
			showCard(sc, phoneNumber);
			
		}finally {
			sc.close();
			System.exit(0);
		}
		
		
	}
	
	/*
	 * String number = "grou353fp23g3qprwog9512"; String mask =
	 * number.replaceAll("\\w(?=\\w{4})", "*");
	 * 
	 * textView.setText(mask);
	 */
	
	public static void showCard(Scanner sc, String phoneNumber) {		

			System.out.println("Enter your phone number");
			phoneNumber = sc.nextLine();
			String num=maskCardNumber(phoneNumber,"##xx-xxxx-###");
			System.out.println("Your phone number ".concat(num).concat("\r\n"));
			
		
	}
	
	public static String maskCardNumber(String cardNumber, String mask) {

	    // format the number
	    int index = 0;
	    StringBuilder maskedNumber = new StringBuilder();
	    for (int i = 0; i < mask.length(); i++) {
	        char c = mask.charAt(i);
	        if (c == '#') {
	            maskedNumber.append(cardNumber.charAt(index));
	            index++;
	        } else if (c == 'x') {
	            maskedNumber.append(c);
	            index++;
	        } else {
	            maskedNumber.append(c);
	        }
	    }

	    // return the masked number
	    return maskedNumber.toString();
	}
	
//	String num=maskCardNumber("09940790571","xxxx-xxxx-xxxx-####");
	
	

}
