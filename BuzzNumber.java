import java.util.Scanner;

class BuzzNumber{
   public static void main(String[] args){
	  Scanner sc = new Scanner(System.in);
	  
	  System.out.println("Enter the a number : ");
	  
	  int num = sc.nextInt();
	  
	  while(num>0){
		  int org = num ;
		  
		    int last = num % 10 ;
			
			if(last == 7 || org % 7 == 0){
				System.out.println("it is a BuzzNumber ");
				break;
				
			} else {
				System.out.println("it is not a BuzzNumber ");
				break;
			}
 
			
	  }
	  
   }
}