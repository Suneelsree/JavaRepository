package LeetCodeProblem;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Leetcode15 {
    public static void main(String[] args) {
        Leetcode15 l=new Leetcode15();
        int nums[]={-1,0,1,2,-1,-4};
        List<List<Integer>> res=l.threeSum(nums);
        for (List<Integer> row : res) {
            for (Integer element : row) {
                System.out.print(element + " ");
            }
            System.out.println(); 
        }
    }
    public List<List<Integer>> threeSum(int[] nums) {
        int n=nums.length;
        Arrays.sort(nums);
        List<List<Integer>> res=new ArrayList<>();
        for(int i=0;i<n;i++)
        {
            if(i>0 && nums[i]==nums[i-1])continue;
            int l=i+1;
            int r=n-1;
            int sum=0;
            while(l<r)
            {
                sum=nums[i]+nums[l]+nums[r];
                if(sum==0){
                    res.add(Arrays.asList(nums[i],nums[l],nums[r]));
                    l++;
                    r--;
                    while(l<r && nums[l]==nums[l-1])
                        l++;
                    while(l<r && nums[l]==nums[r+1])
                        r--;;
                }
                else if(sum<0)l++;
                else r--;
            }
        }
        return res;
    }
}
