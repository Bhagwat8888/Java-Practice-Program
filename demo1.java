import java.util.Scanner;

class demo1{
  public static void main(String[] args){
     Scanner sc = new Scanner(System.in);
	 System.out.println("Enter  the  two number : ");
	 int num = sc.nextInt();
	 int temp = num ;
	 int sum = 0;
	  
	 
	  while(num > 0){
		   int last = num % 10 ;
		   int fact = 1 ;
		    
		   
		   for(int i =1 ; i <= last ; i++){
			     fact *=   i;
		   }
		   num /= 10;
		   
		   sum = sum +  fact;
	  }
	   
	  System.out.println(sum);
	  
	  if(temp == sum){
		 System.out.println("it is the string number ");
	  } else {
		  System.out.println("it is not  the string number ");

	  }
	  
	  
	  
  } 
}
