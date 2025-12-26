import java.util.Scanner;

public class Solution {
  public static void main(String[] args) {
    int count = 0;
    int num;
    Scanner s=new Scanner(System.in);
    System.out.println("enter number :");
    num=s.nextInt();
    while (num != 0) {
      num /= 10;
      ++count;
    }
    System.out.println("Number of digits: " + count);
    s.close();
    }
}
