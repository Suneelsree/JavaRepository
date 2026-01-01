public class Leetcode53 {
    //53. Maximum Subarray
    public static void main(String[] args) {
        int nums[]={5,4,-1,7,8};
        int res=maxSubArray(nums);
        System.out.println("max sum of sub array : "+ res);
    }
    public static int maxSubArray(int[] nums) {
        int n=nums.length;
        int dp[]=new int[n];
        int res=nums[0];
        dp[0]=nums[0];
        for(int i=1;i<n;i++)
        {
            int cal=nums[i]+dp[i-1];
            dp[i]=(cal>=nums[i])?cal:nums[i];
            if(res<dp[i])res=dp[i];

            // dp[i] = Math.max(nums[i], nums[i] + dp[i - 1]);
            // res = Math.max(res, dp[i]);
        }
        return res;
    }
}
