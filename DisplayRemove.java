class DisplayRemove{
  public static void main(String[] args){
       int Num = 123468;
       System.out.println("Entered Number is : "+Num);

	   while(Num > 0){
		   int Number = Num % 10; //   This is the use for Takingthe last digit of  the numebr 
		   
		    System.out.println("The fetched  digit is : "+Number);
			
			Num = Num / 10; // this is used for the remove the last digit inside the entered number 
	   }
	   
	   System.out.println("Now the updated values of the num variable is :"+Num);
  }
}