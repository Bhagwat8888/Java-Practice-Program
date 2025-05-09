class SunnyNumber{
   public static void main(String[] args){
        int num = 8;
		
	      num++;
		 
	  SunnyNumberFunc(num);	 
		  
   }
	
  public static  void SunnyNumberFunc(int num){
	 int  product = 0;
		 
		 for(int i = 0; i <= num ; i++){
			 if(i * i == num){
				 product = i * i;
				 break;
			 }
		 }
		 System.out.println(num);
		 if(product==num){
		   System.out.println("number is square root number "); 
	     }else {
		   System.out.println("number is not a square root number ");
	 }
  }
			 
} 
   
