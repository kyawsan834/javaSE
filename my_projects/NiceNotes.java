// package com.sai.inheritance;
import java.util.*;

 class NiceNotes {

  String username,password;
  // String password = "1234";

  NiceNotes(){
   // inputReq(); 

     // Start Program
  this.username = username;
  this.password = password;

    WelcomePage();
    Signup(username,password);
    writeNote(); 
  } 
 
 public static void main (String[]args) {

    NiceNotes ncs = new  NiceNotes();

    // System.out.println("hay");


 }

  private final void WelcomePage(){
 	 System.out.println("******************************************\r\n"
 	 	+"\r\nWelcome to Group-1(sec2)<Next Level>\r\n"
 	 	+"\r\n******************************************");
 }

 	private void Signup(String username, String password){
  		Scanner sc = new Scanner (System.in);
  		System.out.println("Do you have an account? y/n?");
  		String check = sc.nextLine();
  		if("y".equals(check)){
   		Login(username,password);
  		}else{
   			System.out.println("\r\n **Signup**");
  			System.out.println("Please enter your username for register");
   			username = sc.nextLine();
   			System.out.println("Please enter your password for register");
   			password = sc.nextLine();
   			System.out.println("**Signup Successful**\r\n"+"Hello " +username + " Please Login with your username and password \r\n" );
   			Login(username,password);
  		}
 }


 private void Login(String username, String password){
  	System.out.println("\r\n**Login**");
  	Scanner sc = new Scanner (System.in);
  	System.out.println("Enter your username");
  	username = sc.nextLine();
  	System.out.println("Enter your password");
  	password = sc.nextLine();
  	if(username==username && password == password){
   		System.out.println("**Login Success**" + "\r\n Welcome " + username + "\r\n");
 	}else{
  		 System.out.println("**Login Failed** \r\n");
   		System.out.println("Are you want to register? true/false?\r\n");
   		boolean check2 = sc.nextBoolean();
   		if(check2){
   		 Signup(username,password );
   		}else{
   		 	Login(username,password);
  	   }
  	}
 }

    private void writeNote() { 
          Scanner sc = new Scanner(System.in); 

          System.out.println("***Welcome to Note Page***");
 
          System.out.println("Enter your name"); 
          String name = sc.nextLine(); 
 
          System.out.println("Enter your id"); 
          int id = Integer.parseInt(sc.nextLine()); 
 
          System.out.println("Enter your note"); 
         String note = sc.nextLine(); 
 
          note(name,id,note,sc); 
 
          System.out.println("Enter 'n' to write new note Or enter 'e' to end and see all notes."); 
          String choice = sc.nextLine(); 
 
          Request(choice,sc,name,id,note); 
 
          System.out.println("Please write a to show all note!"); 
          String all = sc.nextLine(); 
 
          allnote(note,sc,name,id,all); 
 } 
 
   private void Request(String choice,Scanner sc,String name,int id,String note) { 
 
        if("n".equals(choice)) {   
        System.out.println("New note!"); 
        writeNote(); 
 
 } else if("e".equals(choice)) { 
          System.out.println("Good Bye! \r\n"); 
 
       } else { 
         System.out.println("Choose 'n' or 'e'!"); 
       } 
} 
 
   private void note(String name,int id,String note,Scanner sc) {  
      
         System.out.println("-----------------------------"); 
         System.out.println("-----------------------------"); 
         System.out.println("Show the details."); 
         System.out.println("Name :" +name); 
         System.out.println("ID :" +id); 
         System.out.println("Note:" +note); 
         System.out.println("-----------------------------"); 
         System.out.println("-----------------------------"); 
 
  } 
 
   private void allnote(String note,Scanner sc,String name,int id,String all){ 
   
   if("a".equals(all)) 
    { 
         System.out.println("---------------"); 
         System.out.println("Search Result"); 
         System.out.println("---------------"); 
         System.out.println("Name : " +name); 
         System.out.println("ID : " +id); 
         System.out.println("Note : " +note); 
     } else { 
       System.out.println("Thanks for Visiting!\r\n developed by Group-1(sec2)<Next Level>"); 
    } 

 // private void inputReq() {
  // Scanner sc = new Scanner (System.in);
  // System.out.println("LoginorSignup");
  // String loginorSignup = sc.nextLine();
  // System.out.println("Login?");
  // String login =sc.nextLine();


  // String signup =sc.nextLine();
  // String loginorSignupFlag = loginorSignupFilter(loginorSignup,login,signup);
 

  // loginorsignup( loginorSignupFlag,sc , login, signup,gmail,signup ); 
 // }

 // private void loginorsignup(boolean loginorSignupFlag,Scanner sc,boolean signup,boolean signup2,String gmail,boolean signup3) {
   
 // boolean login;
 // if (login) {
  
 //  Login lg = new Login (gmail);
 //  System.out.println("Gmail");
 //  String gmail = sc.nextLine(); 
 //  output(login);

 // }else if (signup) { 
 //  System.out.println ("Signup?");
 //  String newuser = sc.nextLine();
 //   Signup sp = new Signup ();   
 //   output1( signup);
 // } 
  //}
 // private void output(Login lg) {
 //  System.out.println("Login"+ "");
 //  System.out.println("Gmail" + "");
 //  //yes=Loginpass ,No=Login again
 //  System.out.println("Loginpass"); 
 // }


 // private void output1( Signup sp) {
 //  System.out.println("Signup"+ "");
 //  System.out.println("Newuser"+ "");
 //  //Yes=Login , No = Error;
 //  System.out.println("Login");
 // }


 // private boolean loginorSignupFilter(String loginorSignup, boolean login, boolean signup) {
 //  return false; 
 //  } 

 //  class Login{
 //  String gmail;
 //  public Login(String gmail) {
 //  this.gmail = gmail;
 //   }
 // }
 
 // public class Signup {
 //  String Newuser;

 //  Signup(String Newuser) {
 //   this.Newuser =Newuser; 
 //  }
 // }
    }
}

// import java.util.*; 
// class NiceNote { 
 
//  NiceNote() {                                              
//       writeNote(); 
//      } 
 
//     public static void main(String [] args) { 
//       NiceNote un = new NiceNote();   
//    } 
 
//    private void writeNote() { 
//           Scanner sc = new Scanner(System.in); 
 
//           System.out.println("Enter your name"); 
//           String name = sc.nextLine(); 
 
//           System.out.println("Enter your id"); 
//           int id = Integer.parseInt(sc.nextLine()); 
 
//           System.out.println("Enter your note"); 
//          String note = sc.nextLine(); 
 
//           note(name,id,note,sc); 
 
//           System.out.println("Enter 'n' to write new note Or enter 'e' to end and see all notes."); 
//           String choice = sc.nextLine(); 
 
//           Request(choice,sc,name,id,note); 
 
//           System.out.println("Please write a to show all note!"); 
//           String all = sc.nextLine(); 
 
//           allnote(note,sc,name,id,all); 
//  } 
 
//    private void Request(String choice,Scanner sc,String name,int id,String note) { 
 
//         if("n".equals(choice)) {   
//         System.out.println("New note!"); 
//         writeNote(); 
 
//  } else if("e".equals(choice)) { 
//           System.out.println("Good Bye!"); 
 
//        } else { 
//          System.out.println("Choose 'n' or 'e'!"); 
//        } 
// } 
 
//    private void note(String name,int id,String note,Scanner sc) {  
      
//          System.out.println("-----------------------------"); 
//          System.out.println("-----------------------------"); 
//          System.out.println("Show the details."); 
//          System.out.println("Name :" +name); 
//          System.out.println("ID :" +id); 
//          System.out.println("Note:" +note); 
//          System.out.println("-----------------------------"); 
//          System.out.println("-----------------------------"); 
 
//   } 
 
//    private void allnote(String note,Scanner sc,String name,int id,String all){ 
   
//    if("a".equals(all)) 
//     { 
//          System.out.println("---------------"); 
//          System.out.println("Search Result"); 
//          System.out.println("---------------"); 
//          System.out.println("Name : " +name); 
//          System.out.println("ID : " +id); 
//          System.out.println("Note : " +note); 
//      } else { 
//        System.out.println("Thanks for Visiting!"); 
//         } 
// } 
 
// }