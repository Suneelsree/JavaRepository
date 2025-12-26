import java.util.Scanner;

class Gcd {
  public static void main(String[] args) {
    Scanner s=new Scanner(System.in);
    int n1, n2;
    System.out.println("enter number 1:");
    n1=s.nextInt();
    System.out.println("enter number 2:");
    n2=s.nextInt();
    int gcd = 1;
    for (int i = 1; i <= n1 && i <= n2; ++i) {
      if (n1 % i == 0 && n2 % i == 0)
        gcd = i;
    }
    System.out.printf("GCD of %d and %d is: %d", n1, n2, gcd);
    s.close(); 
  }     
}
