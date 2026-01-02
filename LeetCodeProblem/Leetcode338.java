// Counting Bits
public class Leetcode338 {
    public static void main(String[] args) {
        int n=10;
        int res[]=countBits(n);
        System.out.println(res.toString());
    }
    public static int[] countBits(int n) {
        int dp[]=new int[n+1];
        dp[0]=0;
        int offset=1;
        for(int i=1;i<n+1;i++)
        {
            if(i==offset*2)offset=i;
            dp[i]=1+dp[i-offset];
        }
        return dp;
    }

}
