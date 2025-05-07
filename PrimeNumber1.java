import java.util.Scanner;

class PrimeNumber1 {
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the number : ");
    int num = sc.nextInt();

    int den = 2;
    for (; den <= num / 2; den++) {
      if (num % den == 0) {
        break;
      }
    }

    if (den > num / 2) {
      System.out.println("prime number");
    } else {
      System.out.println("Not prime number");
    }

    sc.close();
  }
}
