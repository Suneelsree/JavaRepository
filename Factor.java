import java.util.Scanner;

public class Factor {
  public static void main(String[] args) {
    int number;
    Scanner s=new Scanner(System.in);
    System.out.print("Enter number");
    number=s.nextInt();
    System.out.print("Factors of " + number + " are: ");
    for (int i = 1; i <= number; ++i) {
      if (number % i == 0) {
        System.out.print(i + " ");
      }
    }
    s.close();
  }
}
