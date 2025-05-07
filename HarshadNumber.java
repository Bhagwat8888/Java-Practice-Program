import java.util.Scanner;
class HarshadNumber{
  public static void main(String[] args) {
	  Scanner sc = new Scanner(System.in);
	  System.out.println("Enter the number :");
      int num = sc.nextInt();
	  int temp = num;
	  int sum = 0;
	  
	  while(num !=   0){
	    
		sum += num % 10;
		num /= 10;
	  }
	  
	  if(temp != 0 && temp % sum == 0 )
	  System.out.println("harshad number");
	   else
	  System.out.println("Not harshad number");
	  
  }
}