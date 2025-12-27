import java.util.Scanner;

public class Fibonacci {
  public static void main(String[] args) {
    //Declaration  && initiallization 
    int n , a = 0, b = 1;
    Scanner s=new Scanner(System.in);
    System.out.println("Enter limit term");
    n=s.nextInt();
    
    System.out.println("Fibonacci Series till " + n + " terms:");
    //for loop
    for (int i = 1; i <= n; ++i) {
      //display series
      System.out.println(a + ", ");
      int c = a + b;
      a = b;
      b = c;
    }
    s.close();
  }
}
