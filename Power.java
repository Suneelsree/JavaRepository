import java.util.Scanner;

public class Power {
  public static void main(String[] args) {
      
    int base,powerRaised ;
    Scanner s=new Scanner(System.in);
    System.out.print("Enter base/n");
    base=s.nextInt();
    System.out.print("Enter power/n");
    powerRaised=s.nextInt();
    int result = power(base, powerRaised);
    System.out.println(base + "^" + powerRaised + "=" + result);
    s.close();
  }

  public static int power(int base, int powerRaised) {
    if (powerRaised != 0) {
      return (base * power(base, powerRaised - 1));
    }
    else {
      return 1;
    }
  }
}
