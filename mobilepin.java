import java.util.Scanner;
class mobilepin{
  public static void main(String[] args){
         Scanner sc = new Scanner(System.in);
	    int oldpin = 1234;
      	int attempt = 0;
		
		do{
		   System.out.println("Enter the pin :");
		   int pin = sc.nextInt();
		   
		   if(pin==oldpin){
		    System.out.println("login secessfully ");
			   break; 
		   } else {
		      System.out.println("Envalid pin entered ");
			  attempt++;
		   }
		} while(attempt<4);
		
		if(attempt==4){
		System.out.println("attemp reatched ");
		}
    }
 } 