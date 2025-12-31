import java.util.Arrays;

class MinimumDenomination {
    public static void main(String[] args) {
        int amount=27;
        int[] coins={1,10,20,25,50};
        int res=coinChange(coins, amount);
        System.out.println("Minimum Denominations with given amt and coins:"+ res);
    }
    public static int coinChange(int[] coins, int amount) {
        //why we use dp means we get next solution by previous solution
        // target is 5 rupees
        //then we known how 1,2,3,4 rupees are generated
        //so we calculate one by one using dp
        //here target is rupees
        int dp[]=new int[amount+1];
        Arrays.fill(dp, amount + 1);
        dp[0]=0;
        for(int i=1;i<=amount;i++)
        {
            for(int coin:coins)
            {
                if((i-coin)>=0)
                {
                    dp[i]=Math.min(dp[i],1+dp[i-coin]);
                }
            }
        }
        return dp[amount]>amount?-1:dp[amount];
    }
}