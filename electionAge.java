import java.util.Scanner;
class electionAge {
  public static void main(String[] args){
     Scanner sc = new Scanner(System.in);
	 System.out.println("Enter the Age of the voter :");
	 int Age = sc.nextInt();
	 
	 if(Age>=18){
	     System.out.println("Entered Age is Valid for vote ");
	 } else {
	  System.out.println("Entered Age of the Voter Vote Not Valid for vote ");
	 }
	 
	 
  }
}