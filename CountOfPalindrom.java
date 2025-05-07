 import java.util.Scanner;

class CountOfPalindrom {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter the Start number: ");
        int start = sc.nextInt();
        
        System.out.println("Enter the End number: ");
        int end = sc.nextInt();
        
        int count = 0;
        int first = start;
        while (first <= end) {
            int num = first;
            int reverse = 0;
            
            while (num > 0) {
                int last = num % 10;
                reverse = reverse * 10 + last;
                num /= 10;
            }
            
            if (reverse == first) {
                count++;
            }
            
            first++;
        }
		System.out.println("Count of the palindrom number is : "+count); 
    }
}
