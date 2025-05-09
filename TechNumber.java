class TechNumber{
  public static void main(String[] args){
    
	 int num =  2025;
	  
	  
	 int first = num / 100;
	 int last = num % 100;
	 int sum = first + last ;
	 int product = sum * sum ;
	 
	 System.out.println(num);
	 System.out.println(first);
	 System.out.println(last);
	 System.out.println(sum);
	 System.out.println(product);
	 
	 if(num == product){
		 System.out.println("it is a Tech number ");
	 }else{
		 System.out.println("it is not a Tech number ");
	 }
	 
	 
  }
}