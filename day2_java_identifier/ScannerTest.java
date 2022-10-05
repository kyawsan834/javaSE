import java.util.Scanner;

class ScannerTest{
    public static void main(String[] args){
        // Scanner sc = new Scanner(System.in);
        // System.out.println("Name...?");
        // String name = sc.nextLine();
        // System.out.println("Age...?");
        // int age = sc.nextInt();
        // System.out.println("Gender...? (true=M, false=F)");
        // boolean gender = sc.nextBoolean();
        // System.out.println("Height...?");
        // double height = sc.nextDouble();

        // System.out.println("------RESULT------");
        // System.out.println("Name: "+name);
        // System.out.println("Age: "+age);
        // System.out.println("Gender: "+(gender?"Male":"Female"));
        // System.out.println("Height: "+height);
        // System.out.println("------END------");

        Scanner sc = new Scanner(System.in);

        System.out.println("Name...?");
        String name = sc.nextLine();
        System.out.println("Age...?");
        int age = sc.nextInt();
        System.out.println("Address...?");
        sc.nextLine();
        String adress = sc.nextLine();
        double height = Double.parseDouble(sc.nextLIne());
    }
}