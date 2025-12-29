
import java.util.*;

class Solution {
    //isContainDuplicateInRange
    public static void main(String args[]) {
        int nums[]={1,2,3,4,5,2};
        int k=5;
        boolean f=false;
        if (k <= 0) f=false;

        Set<Integer> set = new HashSet<>();

        for (int i = 0; i < nums.length; i++) {
            if (set.contains(nums[i]))f=true;

            set.add(nums[i]);
            if (set.size() > k) {
                set.remove(nums[i - k]);
            }
        }
        if(f)
            System.out.println("isContainDuplicateInRange"+f);
    }
}
