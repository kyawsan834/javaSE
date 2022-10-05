// package com.sai.inheritance;
import java.util.*;

 class NiceNote {

  static String email;
  static String username;
  static String password;

  NiceNote(String email,String username, String password){
   // inputReq(); 

     // Start Program
    this.email = email;
   this.username = username;
   this.password = password;
    // Login(username,password);
  } 
 
 public static void main (String[]args) {

    // NiceNote nls = new  NiceNote();
    NiceNote adminOne = new NiceNote("admin@gmail.com","admin","admin@123");
    // NiceNote adminTwo = new NiceNote("heinkoko@gmail.com","heinkoko","heinkoko@123");
    // NiceNote adminThree = new NiceNote("haymarhein@gamil.com","haymarhein","haymarhein@123");
    // NiceNote userOne = new NiceNote("kyawsan@gamil.com","kyawsan","kyawsan1234");
    // NiceNote userTwo = new NiceNote("htutkaungkyaw@gmail.com","htutkaungkyaw","hkk1234");
    // NiceNote userThree = new NiceNote("chaweisan@gamil.com","chaweisan","ces1234");
    // NiceNote userFour = new NiceNote("naylinhtun@gmail.com","naylinhtun","nlt1234");
    // NiceNote userFive = new NiceNote("htunhtunlwin@gmail.com","htunhtunlwin","hhl1234");
    // NiceNote userSix = new NiceNote("minthutakhant@gmail.com","minthutakhant","mttk1234");

    NiceNote [] arrNoteUser = {adminOne};

    Signup(username,password,arrNoteUser);

    // System.out.println("hay");


 }

  private final void WelcomePage(){
 	   System.out.println("Welcome to Group-1(sec2)");
 }

 private static void Signup(String username, String password, NiceNote [] arrNoteUser){

      // new code for signup and signup

      Scanner sc = new Scanner (System.in);
      System.out.println("Do you have an account? y/n?");
      String check = sc.nextLine();
      if("y".equals(check)){
      Login(username,password,arrNoteUser);
      }else{
        System.out.println("\r\n **Signup**");
        System.out.println("Please enter your username for register");
        username = sc.nextLine();
        System.out.println("Please enter your password for register");
        password = sc.nextLine();
        System.out.println("**Signup Successful**\r\n"+"Hello " +username + " Please Login with your username and password \r\n" );
        Login(username,password,arrNoteUser);
      }
  }

  private static void Login(String username, String password, NiceNote [] arrNoteUser){

      // new code for signup and signup

      Scanner sc = new Scanner(System.in);
      System.out.println("\r\n**Login**");
      System.out.println("Enter your username");
      username = sc.nextLine();
      System.out.println("Enter your password");
      password = sc.nextLine();

          for(int i = 0; i<arrNoteUser.length; i++){
            if(username==arrNoteUser[i].username && password==arrNoteUser[i].password ){
              Login(username,password,arrNoteUser);
            }else{
                System.out.println("**Login Failed** \r\n");
                System.out.println("Are you want to register? true/false?\r\n");
              boolean check2 = sc.nextBoolean();
              if(check2){
              Signup(username,password,arrNoteUser );
        }       else{
                  Login(username,password,arrNoteUser);
                }
             }
          }

     
  }

}
