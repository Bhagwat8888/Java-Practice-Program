import java.util.Scanner;

class LCM{
   public static void main(String[] args){
     Scanner sc = new Scanner(System.in);	
      System.out.println("Enter the First Number : ");
      int num1 = sc.nextInt();
      System.out.println("Enter the Second Number : ");
       int num2 = sc.nextInt();

		int large = 0;
		large = num1>num2?num1:num2;
		int i =1 ;
		
		while(true){
		if((large*i)%num1 == 0 && (large*i)% num2 ==0){
			System.out.println("Enter the number LCM is  :"+ large*i);
			break;
		}
		  i++;
    }
  }
}