class SimpleLoopingTesting{
	public static void main(String[] args){
		double d = 1.1;
		int j;
		for(j = 0; j < 10; j++){
			d += 1+1;
			System.out.println(j + " is inner Loop.");
		}
		System.out.println(j + " Looping End");
	}
}