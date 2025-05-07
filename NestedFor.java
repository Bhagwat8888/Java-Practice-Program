class NestedFor{
   public static void main(String[] args){
        int num = 1234;
		
		while(num >0){
		 int rev = num % 10 ;
		 if(rev % 3 == 0){
			  System.out.println(rev+" This digit  is divisible by 3 ");
		 } else {
			  System.out.println(rev+" This digit is not divisible for by 3 ");
		 }
		 num = num / 10;
		}
		
   }
}