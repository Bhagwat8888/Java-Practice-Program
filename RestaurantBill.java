import java.util.Scanner;

class RestaurantBill{
   public static void main(String[] args){
       
		System.out.println("========= Restaurant Billing System Porgram ============= ");
		System.out.println();
		
		System.out.println("Select the Restaurant One of the following same name as it is ");
		System.out.println("1.Raj Restaurant");
		System.out.println("2.Pradeep Hotel");
		System.out.println("3.Family restaurant");
		System.out.println("4.Taj Hotel");
		System.out.println("5.Gokul Restaurant");
		System.out.println();
		
		Scanner sc = new Scanner(System.in);
		String  str = sc.nextLine().toUpperCase();
		
		switch(str){
			case "RAJ RESTAURANT":
                   System.out.println("Selected  correct restaurant ");	
				   System.out.println("===============================");
				   System.out.println("Available Items in this Hotel");
				   System.out.println("Price     Items   ");
 				   System.out.println(100+ "rs " +"Non-veg Biryani");
				   System.out.println(150+ "rs "+"Misal Pow");
				   System.out.println(80 +"rs " +"Paneer Ticka");
				   System.out.println(90 +"rs "+"Mashroom Grevy");
				   System.out.println(120+"rs " +"Veg Biryani");
				   System.out.println();
				   
				   System.out.println("Select  the available items form  the above list ");
				 
				   
					  String hotelItem1 ="Non-veg Biryani";
					  String hotelItem2 ="Misal Pow";
					  String hotelItem3 ="Paneer Ticka";
					  String hotelItem4 ="Mashroom Grevy";
					  String hotelItem5 ="Veg Biryani";
				      int itemCount1 = 0;
					  int itemCount2 = 0;
					  int itemCount3 = 0;
					  int itemCount4 = 0;
					  int itemCount5 = 0;
					  
					  String  order = "BILL";
					  
					   System.out.println("Enter the no of item you want to order : ");
					   int itemNo = sc.nextInt();
					    sc.nextLine();
					   
					   for(int i =1;i <= itemNo;i++ ){
						  System.out.println("Enter the "+i+" item Name : ");
						   
						  String cutItem1 = sc.nextLine();
						 
						  if(cutItem1.equals(hotelItem1)){
							    itemCount1++;
						    } else if(cutItem1.equals(hotelItem2)){
							   itemCount2++;
						    } else if(cutItem1.equals(hotelItem3)){
							   itemCount3++;
						    } else if(cutItem1.equals(hotelItem4)){
							   itemCount4++;
						    } else if(cutItem1.equals(hotelItem5)){
							   itemCount5++;
						    } else {
								System.out.println("Invalid item name ");
							} 
							
						  } 
						  
						  System.out.println("Enter the Bill for Bill Or if you want to cancle the order then enter the cancel : ");
						  String response = sc.next().toUpperCase();
						  
						  if(response.equals(order)){
							 
							 System.out.println("========================Your Bill========================");
							 System.out.println();
							 
							 int itemPrice1 = 0;
							 int itemPrice2 = 0;
							 int itemPrice3 = 0;
							 int itemPrice4 = 0;
							 int itemPrice5 = 0;
							 int totalPayment =0 ;
							 
							 for(int i= 1 ; i <= itemCount1;i++){
								 itemPrice1 = itemPrice1 + 100;
							 }
							 for(int i= 1 ; i <= itemCount2;i++){
								 itemPrice2 = itemPrice2 + 150;
							 }
							 for(int i= 1 ; i <= itemCount3;i++){
								 itemPrice3 = itemPrice3 + 80;
							 }
							 for(int i= 1 ; i <= itemCount4;i++){
								 itemPrice4 = itemPrice4 + 90;
							 }
							 for(int i= 1 ; i <= itemCount5;i++){
								 itemPrice5 = itemPrice5 + 120;
							 }
							 
							 
							  
							 totalPayment = itemPrice1 + itemPrice2 + itemPrice3 + itemPrice4 + itemPrice5 ;
							 
							 System.out.println("Non-veg Biryani total price is = " + itemPrice1);
							 System.out.println("Misal Pow  total price is = " + itemPrice2);
							 System.out.println("Paneer Ticka total price is = " + itemPrice3);
							 System.out.println("Mashroom Grevy total price is = " + itemPrice4);
							 System.out.println("Veg Biryani total price is = " + itemPrice5);
							 System.out.println("Total  bill Of your Ordered Items is = "+ totalPayment);
							 System.out.println();
							 System.out.println("========================Thank You Visit Again ====================== ");
						    
						  
						  
						  }
						  
			          break;
					  
					  
					  
					  
			case "PRADEEP HOTEL":
                   System.out.println("Selected  correct restaurant ");	
				   System.out.println("===============================");
				   System.out.println("Available Items in this Hotel");
				   System.out.println("Price     Items   ");
 				   System.out.println(100+ "rs " +"Non-veg Biryani");
				   System.out.println(150+ "rs "+"Hydrabadi Biryani");
				   System.out.println(80 +"rs " +"Salad");
				   System.out.println(90 +"rs "+"Matan Thali");
				   System.out.println(120+"rs " +"Chinees");
				   System.out.println();
				   
				   System.out.println("Select  the available items form  the above list ");
				  
				   
					  String hotelItem11 ="Non-veg Biryani";
					  String hotelItem22 ="Hydrabadi Biryani";
					  String hotelItem33 ="Salad";
					  String hotelItem44 ="Matan Thali";
					  String hotelItem55 ="Chinees";
				      int itemCount11 = 0;
					  int itemCount22 = 0;
					  int itemCount33 = 0;
					  int itemCount44 = 0;
					  int itemCount55 = 0;
					  
					  String  orderr = "BILL";
					  
					   System.out.println("Enter the no of item you want to order : ");
					   int itemNoo = sc.nextInt();
					    sc.nextLine();
					   
					   for(int i =1;i <= itemNoo;i++ ){
						  System.out.println("Enter the "+i+" item Name : ");
						   
						  String cutItem11 = sc.nextLine();
						 
						  if(cutItem11.equals(hotelItem11)){
							    itemCount11++;
						    } else if(cutItem11.equals(hotelItem22)){
							   itemCount22++;
						    } else if(cutItem11.equals(hotelItem33)){
							   itemCount33++;
						    } else if(cutItem11.equals(hotelItem44)){
							   itemCount44++;
						    } else if(cutItem11.equals(hotelItem55)){
							   itemCount55++;
						    } else {
								System.out.println("Invalid item name ");
							} 
							
						  } 
						  
						  System.out.println("Enter the Bill for Bill Or if you want to cancle the order then enter the cancel : ");
						  String responsee = sc.next().toUpperCase();
						  
						  if(responsee.equals(orderr)){
							 
							 System.out.println("========================Your Bill========================");
							 System.out.println();
							 
							 int itemPrice11 = 0;
							 int itemPrice22 = 0;
							 int itemPrice33 = 0;
							 int itemPrice44 = 0;
							 int itemPrice55 = 0;
							 int totalPaymentt =0 ;
							 
							 for(int i= 1 ; i <= itemCount11;i++){
								 itemPrice11 = itemPrice11 + 100;
							 }
							 for(int i= 1 ; i <= itemCount22;i++){
								 itemPrice22 = itemPrice22 + 150;
							 }
							 for(int i= 1 ; i <= itemCount33;i++){
								 itemPrice33 = itemPrice33 + 80;
							 }
							 for(int i= 1 ; i <= itemCount44;i++){
								 itemPrice44 = itemPrice44 + 90;
							 }
							 for(int i= 1 ; i <= itemCount55;i++){
								 itemPrice55 = itemPrice55 + 120;
							 }
							 
							 
							  
							 totalPaymentt = itemPrice11 + itemPrice22 + itemPrice33 + itemPrice44 + itemPrice55 ;
							 
							 System.out.println("Non-veg Biryani total price is = " + itemPrice11);
							 System.out.println("Misal Pow  total price is = " + itemPrice22);
							 System.out.println("Paneer Ticka total price is = " + itemPrice33);
							 System.out.println("Mashroom Grevy total price is = " + itemPrice44);
							 System.out.println("Veg Biryani total price is = " + itemPrice55);
							 System.out.println("Total  bill Of your Ordered Items is = "+ totalPaymentt);
							 System.out.println();
							 System.out.println("========================Thank You Visit Again ====================== ");
						    
						  
						  
						  }
						
						break;
					 
					 
					 
					
			case "FAMILY RESTAURANT":
                     System.out.println("Selected  correct restaurant ");	
				   System.out.println("===============================");
				   System.out.println("Available Items in this Hotel");
				   System.out.println("Price     Items   ");
 				   System.out.println(100+ "rs " +"Paneer Matter");
				   System.out.println(150+ "rs "+"Maratha Veg");
				   System.out.println(80 +"rs " +"Chicken Tandoor");
				   System.out.println(90 +"rs "+"Veg Thali");
				   System.out.println(120+"rs " +"Veg Biryani");
				   System.out.println();
				   
				   System.out.println("Select  the available items form  the above list ");
				  
				   
					  String hotelItem111 ="Paneer Matter";
					  String hotelItem222 ="Maratha Veg";
					  String hotelItem333 ="Chicken Tandoor";
					  String hotelItem444 ="Veg Thali";
					  String hotelItem555 ="Veg Biryani";
				      int itemCount111 = 0;
					  int itemCount222 = 0;
					  int itemCount333 = 0;
					  int itemCount444 = 0;
					  int itemCount555 = 0;
					  
					  String  orderrr = "BILL";
					  
					   System.out.println("Enter the no of item you want to order : ");
					   int itemNooo = sc.nextInt();
					    sc.nextLine();
					   
					   for(int i =1;i <= itemNooo;i++ ){
						  System.out.println("Enter the "+i+" item Name : ");
						   
						  String cutItem111 = sc.nextLine();
						 
						  if(cutItem111.equals(hotelItem111)){
							    itemCount111++;
						    } else if(cutItem111.equals(hotelItem222)){
							   itemCount222++;
						    } else if(cutItem111.equals(hotelItem333)){
							   itemCount333++;
						    } else if(cutItem111.equals(hotelItem444)){
							   itemCount444++;
						    } else if(cutItem111.equals(hotelItem555)){
							   itemCount555++;
						    } else {
								System.out.println("Invalid item name ");
							} 
							
						  } 
						  
						  System.out.println("Enter the Bill for Bill Or if you want to cancle the order then enter the cancel : ");
						  String responseee = sc.next().toUpperCase();
						  
						  if(responseee.equals(orderrr)){
							 
							 System.out.println("========================Your Bill========================");
							 System.out.println();
							 
							 int itemPrice111 = 0;
							 int itemPrice222 = 0;
							 int itemPrice333 = 0;
							 int itemPrice444 = 0;
							 int itemPrice555 = 0;
							 int totalPaymenttt =0 ;
							 
							 for(int i= 1 ; i <= itemCount111;i++){
								 itemPrice111 = itemPrice111 + 100;
							 }
							 for(int i= 1 ; i <= itemCount222;i++){
								 itemPrice222 = itemPrice222 + 150;
							 }
							 for(int i= 1 ; i <= itemCount333;i++){
								 itemPrice333 = itemPrice333 + 80;
							 }
							 for(int i= 1 ; i <= itemCount444;i++){
								 itemPrice444 = itemPrice444 + 90;
							 }
							 for(int i= 1 ; i <= itemCount555;i++){
								 itemPrice555 = itemPrice555 + 120;
							 }
							 
							 
							  
							 totalPaymenttt = itemPrice111 + itemPrice222 + itemPrice333 + itemPrice444 + itemPrice555 ;
							 
							 System.out.println("Non-veg Biryani total price is = " + itemPrice111);
							 System.out.println("Misal Pow  total price is = " + itemPrice222);
							 System.out.println("Paneer Ticka total price is = " + itemPrice333);
							 System.out.println("Mashroom Grevy total price is = " + itemPrice444);
							 System.out.println("Veg Biryani total price is = " + itemPrice555);
							 System.out.println("Total  bill Of your Ordered Items is = "+ totalPaymenttt);
							 System.out.println();
							 System.out.println("========================Thank You Visit Again ====================== ");
						    
						  
						  
						  }
						  
			          break;
					  
				  
		    default :
			System.out.println("Invalid Reataurant");
			
		}

   }
}