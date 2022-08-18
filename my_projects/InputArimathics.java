class InputArimathics{
       public static void main(String[]args){
			//System.out.println("hay");
  	  int num1,num2,total,avg;
 	  	//  num1=Integer.parseInt(args[0]);
	 		 // num2 = Integer.parseInt(args[1]);
	 		//  total = num1+ num2;
			 // avg = total / 2;


			 String g1,g2;
			 g1 = args[0];
			 if((g1.equals("M") || g1.equals("m"))){
			 				System.out.println("Male");
			 }else if((g1.equals("F") || g1.equals("f"))){
			 		System.out.println("Female");
			 }else{
			 		System.out.println("Wrong gender");
			 }


			 // System.out.println("Total is : " + total);
			 // System.out.println("Avg is : " + avg);
			
      }
}