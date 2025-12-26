import java.util.Scanner;

class SumNatural {

    public static void main(String[] args) {

        int num, sum = 0;
        Scanner s=new Scanner(System.in);
        System.out.println("Enter number");
        num=s.nextInt();
        for(int i = 1; i <= num; ++i)
        {
            sum += i;
        }
        System.out.println("Sum = " + sum);
        s.close();
    }
}