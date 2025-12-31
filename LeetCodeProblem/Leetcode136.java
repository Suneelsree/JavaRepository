class SingleNumber {
    public static void main(String[] args) {
        int nums[]={1,2,3,2,3,4,5,4,1};
        int res=singleNumber(nums);
        System.out.println("Single number = "+res);

    }
    public static int singleNumber(int[] nums) {
        int n=nums.length;
        int res=nums[0];
        for(int i=1;i<n;i++)
        {
            res=res^nums[i];
        }
        return res;
    }
}
