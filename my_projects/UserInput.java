import java.util.Scanner;
class UserInput{
    public static void main(String[] args){
      
          System.out.println("Hello World");

          int num1,num2,total,avg;
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter Number 1");
        num1 = scan.nextInt();
        //System.out.println("Your number is : " + num1);

       System.out.println("Enter Number 2");
       num2 = scan.nextInt();
     // System.out.println("Your number is : " + num2);

      total = num1 + num2;
      avg = total / 2;

    System.out.println("Total = " + total);
    System.out.println("Average = " + avg);
 
}
}