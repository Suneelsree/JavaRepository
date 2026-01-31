//Two Sum II - Input Array Is Sorted

import java.util.Arrays;

class Solution {
    public static void main(String[] args) {
        int nums[]={-5,-3,0,2,4,6,8};
        int target=5;
        int res[]=twoSum(nums, target);
        System.out.println(Arrays.toString(res));
    }
    public static int[] twoSum(int[] nums, int target) {
        int n=nums.length;
        int left=0;
        int right=n-1;
        int i=0;
        while(i<n-1)
        {
            left=i+1;
            right=n-1;
            while(left<=right)
            {
                int mid=left+(right-left)/2;
                if(nums[mid]+nums[i]==target)return new int[]{i+1,mid+1};
                else if(nums[mid]+nums[i]>target)right=mid-1;
                else left=mid+1;
            }
            i++;
        }
        return new int[]{-1,-1};
    }
}
