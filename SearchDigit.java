import java.util.Scanner;

class SearchDigit{
  public static void main(String[] args){
       Scanner sc = new Scanner(System.in);
	   System.out.println("Enter the number : ");
       int number = sc.nextInt();
       
       System.out.println("Enter the digit to find int his number : ");	
	   int digit = sc.nextInt();
      
	    while(number>0){
		   int find = number % 10;
		   
		   if(find == digit)
		   {
		      System.out.println("Entered digit is present in the given number ");
			 break;
		   } 
		   else 
		   {
		       System.out.println("Entered digit is not present in the entered number ");
			   number = number / 10;
			   break;
			   
		   }
		   
		}
	   
	   }
}