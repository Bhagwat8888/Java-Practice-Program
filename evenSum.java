class evenSum{
   public static void main(String[] args){
       int num = 10;
	   int Sum = 0;
	   int Sub = 0;
	   
	   for(int i = 1 ; i <= num ; i++){
	       if(i % 2 == 0){
		      System.out.println("number is even");
			  Sum += i;
		   } else {
			    System.out.println("number is odd");
				Sub += i;
		   }
	   }
	   System.out.println("Sum of the odd number is :" + Sub);
	   System.out.println("Sum of the even number is :" + Sum);
   }
}