import java .util.Scanner;
class EvilNumber{
 public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter a number to check if it is an evil number or not");
    int num = sc.nextInt();
    int count = 0;
    int bin = 0;
    int i = 1;

    while(num > 0){
        int rem = num % 2;
        bin = rem * i + bin;
        num = num / 2;
        i = i * 10;
    }

    while (bin >0 ) 
    {
      int last = bin % 10;
       if(last == 1){
          count++;
       }
         bin = bin / 10;
         
    }
    System.out.println("1 no is present how many times is : "+count);
    if(count % 2 == 0){
        System.out.println("The number is an evil number");
    }else{
        System.out.println("The number is not an evil number");
    }
    

 }

}