class Solution {
    //longestMountain
    public static void main (String args[]) {
        int arr[]={1,5,6,7,4,3,7,9,1};
        int n=arr.length;
        int max=0;
        int l=0,r=0;
        for(int i=1;i<n-1;i++)
        {
            if(arr[i]>arr[i-1] && arr[i]>arr[i+1])
            {
                l=i;
                r=i;
                while(l>0 && arr[l]>arr[l-1])l--;
                while(r<n-1 && arr[r]>arr[r+1])r++;
                max = Math.max(max, r - l + 1);
            }
            
        }
        System.out.println("longestMountain"+max);
    }
}
