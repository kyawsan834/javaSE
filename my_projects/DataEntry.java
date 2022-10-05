import java.util.Scanner;
class DataEntry{
    static String name,gender,role,salary;
    static int age;
    DataEntry(String name, int age, String gender){
        this.name = name;
        this.age = age;
        this.gender = gender;
        // this.role = role;
        // this.salary = salary;
    }
    public static void main(String[] args){
        // System.out.println("hay");
        Scanner sc = new Scanner(System.in);
        System.out.println("Data Entry? y? n?");
        String check = sc.nextLine();
        if(check.equals("y")){
            System.out.println("Please enter your name");
            name = sc.nextLine();
            System.out.println("Please enter your age");
            age = sc.nextInt();
            System.out.println("Please enter your gender");
            gender = sc.nextLine();             
        }
        // else if(check.equals("y")){
        //     System.out.println("Please enter your role");
        //     role = sc.nextLine();
        //     System.out.println("Please enter your salary");
        //     salary = sc.nextLine();          
        // }
        else{
            System.out.println("hay");
        }

        System.out.println(sc.nextLine());

        DataEntry obj = new DataEntry(name,age,gender);

        String [] arr = {obj};
        
    }

    private static void outPut(String yesornot){
        if(yesornot.equals("y")){
            System.out.println("Please enter your name.");
        }
    }
}