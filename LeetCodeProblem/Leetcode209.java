class minSubArraySumLen {
    public static void main(String[] args) {
        int[] nums={2,3,1,2,4,3};
        int out=minSubArrayLen(7, nums);
        System.out.println(out);
    }
    public static int minSubArrayLen(int target, int[] nums) {
       int res=Integer.MAX_VALUE;
       int n=nums.length;
       int sum=0;
       int l=0;
       for(int r=0;r<n;r++)
       {
        sum+=nums[r];
        while(sum>=target)
        {
            res=Math.min(res,r-l+1);
            sum-=nums[l];
            l+=1;
        }
       }
       if(res==Integer.MAX_VALUE)return 0;
       return res;

    }
}
