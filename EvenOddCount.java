class EvenOddCount{
  public static void main(String[] args){
       int Num = 123468;
       System.out.println("Entered Number is : "+Num);
	   int EvenCount = 0;
	   int OddCount = 0;
	   
	   while(Num > 0){
		   int Number = Num % 10; //   This is the use for Takingthe last digit of  the numebr 
		   
		   if(Number % 2 == 0)
		   { 
			   EvenCount = EvenCount + 1;
		   }
		    else
			{
				OddCount = OddCount + 1;
			}
			Num = Num / 10; // this is used for the remove the last digit inside the entered number 
	   }
	   System.out.println("Entered number is present " + EvenCount +" Even Digit  ");
	   System.out.println("Entered number is present " + OddCount +" Odd Digit  ");
  }
}