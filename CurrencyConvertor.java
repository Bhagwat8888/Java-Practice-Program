import java.util.Scanner;

class CurrencyConvertor{
  public static void main(String[] args){
    
	Scanner sc = new Scanner(System.in);
	
	System.out.println("   Welcome   ");
	System.out.println();
	System.out.println("1. USD ");
	System.out.println("2. EUR ");
	System.out.println("3. BHD ");
	System.out.println("4. BAM ");
	System.out.println("5. BOB ");
	System.out.println();
	System.out.println("Enter  your responce  : ");
	String str = sc.next().toUpperCase();
	System.out.println("Enter the amount in INR :");

	float  inr = sc.nextFloat();
	float  Converted = 0;
	
	String curr = "valid";
	
	switch(str){
	  case "USD" :{
		  Converted = inr / 85.5165f;
		  break;
	  }
	   case "EUR" :{
		  Converted = inr / 97.4713f;
		    break;
	   }
	   case "BHD" :{
		  Converted = inr / 227.390f;
	   break;
	   }
		  
	   case "BAM" :{
		  Converted = inr / 49.9500f ;
		  break;
	   }
	   case "BOB" :{
		  Converted = inr / 12.3829f;
		  break;
	   }
	 default :{
	      System.out.println("Invalid the valiod currency ");
           curr = "novalid";   		  
	 }
  }
  if(curr.equals("valid"))
  {
     System.out.println(inr + " INR " + Converted + " " +str);
  }
 }
}