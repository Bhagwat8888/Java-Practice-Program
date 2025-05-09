import java.util.Scanner;

class AutomorphicNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter a number: ");
        int num = sc.nextInt();
        
        int square = num * num;
        
        int tempNum = num;
        int digits = 0;
        
         while (tempNum > 0) {
            digits++;
            tempNum /= 10;
        }
        
        int lastDigits = 0;
        int divisor = 1;
        
         for (int i = 0; i < digits; i++) {   
            divisor *= 10;
        }
        
        lastDigits = square % divisor;   
        
        
        if (lastDigits == num) {
            System.out.println(num + " is an Automorphic number.");
        } else {
            System.out.println(num + " is not an Automorphic number.");
        }
    }
}
