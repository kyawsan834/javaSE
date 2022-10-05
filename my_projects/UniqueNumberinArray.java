class UniqueNumberinArray{
    public static void main(String [] args){

        // System.out.println("hay");

        String [] userInput = {args[0],args[1],args[2],args[3],args[4]};
        
        int i = Integer.parseInt("1");
        int sum = Integer.parseInt("0");
       
        if(sum == userInput.length){
             while(i<userInput.length){
            if(userInput.length % i == 0){
                sum = sum + i;
            }
            i++;
            System.out.println("hello" + userInput[i]);
        }
        }else{
            System.out.println("error in find unique number");
        }
        



        
    }
}