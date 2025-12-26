import java.util.Scanner;

public class Average {
    public static void main(String[] args) {
        double sum = 0.0;
        Scanner s=new Scanner(System.in);
        System.out.print("enter arraysize :");
        int n=s.nextInt();
        double numArray[]=new double[n];
        System.out.println("enter elements one by one");
        for(int i=0;i<n;i++)
          {
            numArray[i]=s.nextDouble();
          }
        for (double num: numArray) {
           sum += num;
        }

        double average = sum / numArray.length;
        System.out.printf("The average is: %.2f", average);
        s.close();
      }
}
