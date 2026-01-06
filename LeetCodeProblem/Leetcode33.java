



//  Search in Rotated Sorted Array

class Leetcode33 {

    public static void main(String[] args) {
        int nums[]={4,5,6,7,8,0,1,2,3};
        int target=6;
        System.out.println("Target present in the index: "+ search(nums,target));
    }
    public static int search(int[] nums, int target) {
        int n = nums.length;
        if (n == 1 && nums[0] == target)
            return 0;
        int left = 0;
        int right = n - 1;
        int mid = 0;
        while (left < right) {
            mid = left + (right - left) / 2;
            if (nums[mid] > nums[right])
                left = mid + 1;
            else
                right = mid;
        }
        int pivot = left;
        left = 0;
        right = n - 1;
        while (left <= right) {
            mid = left + (right - left) / 2;
            int rmid = (mid + pivot) % n;
            if (nums[rmid] == target)
                return rmid;
            else if (nums[rmid] < target)
                left = mid + 1;
            else
                right = mid-1;
        }
        return -1;
    }
}
