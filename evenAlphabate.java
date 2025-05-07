class evenAlphabate{
	
  public static void main(String[] args){
	  
      char ch = 'A';
	  char chh = 'Z';
	  int  sum = 0;
	  
	  for(int i = ch ; i <= chh ; i++){  
	    if(i % 2 == 0){
		   char chhh = (char)(i);
		    System.out.println("even alphabate is :" +chhh);
			sum = sum + i;
		}
	  }
	  System.out.println("Sum of the evenalphabates is :"+sum);
  }
}