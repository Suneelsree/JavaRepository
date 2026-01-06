//Find First and Last Position of Element in Sorted Array
public class Leetcode34 {
    public static void main(String[] args) {
        int nums[]={2,2,3,4,5,6,6,6,6,6,7,7,8,8,8,8,9,9,9};
        int target=6;
        int[] res=searchRange(nums,target);
        System.out.println("Target present in the index from "+ res[0]+" to "+ res[1]);
    }
  public static int[] searchRange(int[] nums, int target) {
       int n=nums.length;
       int left=0;
       int right=n-1;
       int i=-1;
       int j=-1;
       int mid=0;
       if(n==1 && nums[0]==target)return new int[]{0,0};

       while(left<=right)
       {
            mid=left+(right-left)/2;
            if(nums[mid]==target)
            {
                i=mid;
                right=mid-1;
            }
            else if(nums[mid]>target)right=mid-1;
            else left=mid+1;
       } 
       left=0;
       right=n-1;
       while(left<=right)
       {
            mid=left+(right-left)/2;
            if(nums[mid]==target)
            {
                j=mid;
                left=mid+1;
            }
            else if(nums[mid]>target)right=mid-1;
            else left=mid+1;
       }
       
       if(j!=-1)return new int[]{i,j};
       return new int[]{-1,-1};
    }  
}
