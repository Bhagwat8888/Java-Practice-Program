class OtpGenerator{
	
   public static void main(String[] args){
	   
       System.out.println("OTP Generator program using  the Math.random function ");
	   int otp = (int)(Math.random()*9000);
	   System.out.println("OTP is :"+otp);
	   
   }
}