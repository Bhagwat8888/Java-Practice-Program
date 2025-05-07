class ZeroNumber{
    public static void main(String[] args){
		 int Num = 1200340;
		 int count = 0;
		 
		 while(Num > 0 ){
			 int Number = Num % 10;
			  if(Number == 0){
				   
				  count = count + 1;
				  
			  } 
			   
			 Num = Num / 10;
		 }
		 System.out.println("there are " + count +" zero present int he given number ");
	}
}