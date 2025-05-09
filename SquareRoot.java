import java.util.Scanner;

class SquareRoot{
   public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
	System.out.println("Enter a number : ");
	int num = sc.nextInt();
	int product = 0;
	for(int i = 1 ;i <= num ; i++){
		   if(i * i == num ){
			  product = i * i; 
			  break;
		   } 
	}
	 if(product==num){
		System.out.println("number is square root number "); 
	 }else {
		 System.out.println("number is not a square root number ");
	 }
   }
}
	 
  
