class LazyArrayAssign {
    public static void main(String [] args) {
        // int []i, j;
        // i = new int[3];
        // j = 10;
        // int a[], b;
        // a = new int[3];
        // b = 10;
        // System.out.println(j+b);

        // int []i,j;
        // // i = {1,2,3};
        // j = new int [10];
        // // j = new int[10];
        // System.out.println(j);

        // Booking List System

        String name[] = {"Hein Ko Ko", "Maung Maung", "Phyo Ko Ko"};
        System.out.println("---------------------");
        System.out.println("Booking List");
        System.out.println("---------------------");
        for (int i = 0; i < name.length; i++){
            System.out.println((i+1) + ". " +name[i]);
        }

        System.out.println("---------------------");

        // Search Booked User
        String searchName = args[0];
        System.out.println("Starting Searching your value");
        boolean flagVariable = false;
        for (int i = 0; i < name.length; i++){
            if(name[i].equals(searchName)){
                flagVariable = true;
                System.out.println("Found It!");
                System.out.println("Booking Number : " + (i+1));
                System.out.println("Name : " + name[i]);
                break;
            }
            // else{
            //     System.out.println("Not Found uesr! \n Please Try Again!!! ");
            //     break;
            // }
            System.out.println(flagVariable == true ? "" : "Not Found");break;
        }
        System.out.println("---------------------");


    }
}