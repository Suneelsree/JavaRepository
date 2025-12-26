import java.util.*;
class MathFunctions
{
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter first number");
        int firstnum=s.nextInt();
        System.out.println("Enter Second number");
        int secondnum=s.nextInt();
        System.out.println("Minimum Value"+Math.min(firstnum,secondnum));
        System.out.println("Maximum Value"+Math.max(firstnum,secondnum));
        System.out.println("Sqrt value for First number"+Math.sqrt(firstnum));
        System.out.println("Absolute value for -2.89"+Math.abs(-2.89));
        System.out.println("Random Number"+Math.random());
        s.close();
    }

}
