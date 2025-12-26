import java.util.Scanner;

public class PyramidStar {

  public static void main(String[] args) {
    int rows;
    Scanner s=new Scanner(System.in);
    System.out.println("enter rows");
    rows=s.nextInt();
    for (int i = 1; i <= rows; ++i) {
      for (int j = 1; j <= i; ++j) {
        System.out.print("* ");
      }
      System.out.println();
    }
    s.close();
  }
}
