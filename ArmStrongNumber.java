import java.util.Scanner;

class ArmStrongNumber{
  public static void main(String[] args){
	  Scanner sc = new Scanner(System.in);
	  System.out.println("Enter the number : ");
	  
	  int num = sc.nextInt();
	  
	  int count = 0;
	  int temp1 = num ;
	  int temp2 = num;
	  int sum = 0;
	  
	  
	  while(num > 0){
	       
		  count++;
		  num /= 10;
	  }
	  
	   
	  while(temp1>0){
		  int last = temp1 % 10;
		   int product = 1;
		   
		  for(int i = 1 ; i<=count; i++){
			   product = product *last ;
		  }
		  
		  sum += product;
		  
		  temp1 /= 10;
		  
		  
	  }
	  System.out.println("total power of the enter number each digit is :  "+sum);
	  System.out.println("No of digit present in the entered number is : "+count);
	  
	   if(temp2 == sum){
			  System.out.println("it is a ArmStrongNumber ");
		  } else {
			  System.out.println("it is not a ArmStrongNumber ");
		  }
     
  }
}