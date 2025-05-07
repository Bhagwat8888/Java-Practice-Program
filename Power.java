import java.util.Scanner;
class Power{
   public static void main(String[] args){
      Scanner sc = new Scanner(System.in);
	  System.out.println("Enter the base :");
	  
	  int base = sc.nextInt();
	  System.out.println();
	  
	  System.out.println("Enter the raise :" );
	  int raise = sc.nextInt();
	  int count = 1;
	  
	  for(int time = 0 ; time < raise ; time++){
		  count *= base;
		 
	  }
	  System.out.println(count);
	  
   }
}