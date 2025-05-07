import java.util.Scanner;

class HCM{
   public static void main(String[] args){
     Scanner sc = new Scanner(System.in);	
      System.out.println("Enter the First Number : ");
      int num1 = sc.nextInt();
      System.out.println("Enter the Second Number : ");
       int num2 = sc.nextInt();
	   
	   int i = 1;
	   int HCM =1;
	   while((i<=num1) && (i <=num2)){
		   
	   if((num1%i == 0) && (num2 % i == 0)){
		   
		HCM = i;
		
	      }
		  
		  i++;
		  
	   }
	   
	   System.out.println("num1 and Num2 hcm is : "+HCM); 
  }
}