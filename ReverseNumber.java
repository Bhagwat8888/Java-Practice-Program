import java.util.Scanner;

class ReverseNumber{
   public static void main(String[] args){
	   Scanner sc = new Scanner(System.in);
	   System.out.println("Enter the number : ");
       int num = sc.nextInt();

	   int rev = 0 ;
	   System.out.println("Before  reversing  the number is : "+num );
	  
	  while(num != 0){
		  
		  int last = num % 10;
		  rev = rev * 10 +last;
		  num /= 10;
	  }
	  System.out.println("After the reversing the number is : "+rev);	   
   }
}


 