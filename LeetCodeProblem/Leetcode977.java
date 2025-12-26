package LeetCodeProblem;

//977. Squares of a Sorted Array

import java.util.Arrays;

class Solution {
    public static void main(String[] args) {
        int[] nums={-4,-1,0,3,10};
        Solution S=new Solution();
        int[] res=S.sortedSquares(nums);
        System.out.print(Arrays.toString(res));
    }
    public int[] sortedSquares(int[] nums) {
        int n=nums.length;
        if(nums[0]>-1)
        {
            for(int i=0;i<n;i++)
            {
                nums[i]*=nums[i];
            }
            return nums;
        }
        int res[]=new int[n];
        if(nums[n-1]<0)
        {
            int i=0;
            int j=n-1;
            int temp=0;
            while(i<=j)
            {
                temp=(int)Math.pow(nums[i],2);
                nums[i]=(int)Math.pow(nums[j],2);
                nums[j]=temp;
                i++;
                j--;
            }
            return nums;
        }
        int m=0;
        for(int i=0;i<n;i++)
        {
            if(nums[i]>=0)
            {
                m=i;
                break;
            }
        }
        int i=m-1;
        int j=0;
        while(i>=0 && m<n)
        {
            if(Math.abs(nums[i])<nums[m])
            {
                res[j]=nums[i]*nums[i];
                j++;
                i--;
            }
            else if(Math.abs(nums[i])>=nums[m])
            {
                res[j]=nums[m]*nums[m];
                j++;
                m++;
            }
        }
        while(i>=0)
        {
            res[j++]=nums[i]*nums[i];
            i--;
        }
        while(m<n)
        {
            res[j++]=nums[m]*nums[m];
            m++;
        }
        return res;
    }
}
