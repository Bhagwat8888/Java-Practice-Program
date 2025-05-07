import java.util.Scanner;

class PasswordValidation{
    public static void main(String[] args) throws InterruptedException{
	     Scanner sc = new Scanner(System.in);
		 int oldPin = 143;
		 
		 int millisec = 2000;
		 
		labels:
        for( ; ; ){		
		        int attempt = 3;
		 do{
			 System.out.println("Enter the pin :");
			 int pin = sc.nextInt();
			 
			 if(pin == oldPin){
				 System.out.println("Mobile Phone Open ");
				 System.out.println("====================================================");
				 break labels;
			 }
			 else 
			 {  
		        System.out.println("Invalid Password ");
				System.out.println("====================================================");
				System.out.println("Attemp left :"+ (attempt-1));
				
			 }
			 attempt--;
			 
		 }while(attempt>=1);
		 
		 System.out.println("Phone is disabled for  "+ (millisec/1000) + " Sec");
		 Thread.sleep(millisec);
		 millisec = millisec *2;
		 System.out.println("====================================================");
		} 
	}

}