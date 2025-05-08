import java.util.Scanner;

class XylemNumber{
   public static void main(String[] args){
	   Scanner sc = new Scanner(System.in);
	   
	   System.out.println("Enter a number : ");
	   int num = sc.nextInt();
	   
	   int outersum = num % 10 ;
	   num /= 10;
	   
	   int innersum = 0;
	   
	   while(num >= 10){
		   int digit = num % 10 ;
		   innersum += digit;
		   num /= 10;
	   }
	    System.out.println(num);
	     outersum += num;
		 
		 System.out.println(outersum);
		 System.out.println(innersum);
	   if(innersum == outersum)
		   System.out.println("it is a Xylem Number ");
	   else 
		   System.out.println("it is a pholem number ");
      
   }
}