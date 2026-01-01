import java.util.Scanner;

public class Leetcode70 {
    //climb stairs
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.print("Enter No Of Steps:");
        int n=s.nextInt();
        int res=climbStairs(n);
        System.out.println("No of Ways to reach  "+n+"  Step is : "+res);
        s.close();
    }
    public static int climbStairs(int n) {
        int dp[]=new int[n+1];
        dp[0]=0;
        dp[1]=1;
        if(n>=2)dp[2]=2;
        for(int i=3;i<=n;i++)
        {
            dp[i]=dp[i-2]+dp[i-1];
        }
        return dp[n];
    }
}
