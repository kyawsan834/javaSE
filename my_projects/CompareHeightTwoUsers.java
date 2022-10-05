// importing java util scanner library
import java.util.Scanner;

// START COMPAREHEIGHTTWOUSER CLASS
class CompareHeightTwoUsers{

    // Start Main Method
    public static void main(String[] args){

        CompareHeightTwoUsers chObj = new CompareHeightTwoUsers();
        
        // System.out.println("hay");

        // import user from command line "System.in"
        Scanner sc = new Scanner(System.in);

        double userOne,userTwo;

        System.out.println("");
        System.out.println("------Compare Height Program Started------");
        System.out.println("");
        System.out.println("Please enter first height for person one");
        userOne = sc.nextDouble();
        System.out.println("Please enter second height for person two");
        userTwo = sc.nextDouble();

        chObj.compareHeight(userOne,userTwo);
        System.out.println("");
        System.out.println("------Process completed------");
    }
    // End Main Method

    // start compareHeight method
    static void compareHeight(double userOne, double userTwo){
        if(userOne > userTwo && userTwo < userOne){
            System.out.println("Person One Height " + userOne + " is Taller Than Person Two");
        }else if(userTwo > userOne && userOne < userTwo){
            System.out.println("Person Two Height " + userTwo + " is Taller Than Person One");
        }else{
            System.out.println("Error in comparing height...");
        }
    }
    // end compareHeight method
    
}
//  END COMPAREHEIGHTTWOUSER CLASS